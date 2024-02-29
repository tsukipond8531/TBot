plugins {
  id("application")
  id("com.diffplug.spotless") version "6.20.0"
}

repositories { mavenCentral() }

dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
  testImplementation("nl.jqno.equalsverifier:equalsverifier:3.15.7")
  testImplementation("org.reflections:reflections:0.10.2")
  testImplementation("org.slf4j:slf4j-api:2.0.7")
  testImplementation("org.slf4j:slf4j-log4j12:2.0.7")

  implementation("org.apache.httpcomponents:httpclient:4.5.14")
  implementation("org.apache.httpcomponents:httpmime:4.5.14")
  implementation("com.google.guava:guava:31.1-jre")
  implementation("com.google.code.gson:gson:2.10.1")
  implementation("jakarta.validation:jakarta.validation-api:3.0.2")
}

java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

tasks.withType<Javadoc> { options.encoding = "UTF-8" }

spotless { java { googleJavaFormat() } }

application { mainClass.set("jarkz.tbot.App") }

tasks.withType<JavaCompile> { options.encoding = "UTF-8" }

tasks.named<Test>("test") { useJUnitPlatform() }

fun exec_command(command: Array<String>) {
  val process =
      ProcessBuilder(*command)
          .directory(rootProject.projectDir)
          .redirectOutput(ProcessBuilder.Redirect.PIPE)
          .redirectError(ProcessBuilder.Redirect.PIPE)
          .redirectErrorStream(true)
          .start()
  process.waitFor(60, TimeUnit.SECONDS)
  val result = process.inputStream.bufferedReader().readText()
  if (!result.isBlank()) {
    println(result)
  }
}

fun clone_git(from: String) {
  val command = arrayOf("git", "clone", from)
  exec_command(command)
}

fun run_python_process(directory: String) {
  val createVenv = arrayOf("python3", "-m", "venv", directory + "/venv")
  exec_command(createVenv)

  val installRequirements =
      arrayOf("./" + directory + "/venv/bin/pip", "install", "-r", directory + "/requirements.txt")
  exec_command(installRequirements)

  val runScript = arrayOf("./" + directory + "/venv/bin/python", directory + "/main.py")
  exec_command(runScript)
}

fun copy(from: String, to: String) {
  val copyCommand = arrayOf("cp", "-r", from, to)
  exec_command(copyCommand)
}

fun remove(path: String) {
  val removeCommand = arrayOf("rm", "-r", path)
  exec_command(removeCommand)
}

fun removeAll(vararg paths: String) {
  paths.forEach { path -> remove(path) }
}

tasks.register("genTypes") {
  doLast {
    clone_git("https://github.com/JarKz/tbot_type_generator")
    run_python_process("tbot_type_generator")
    copy("output/types", "app/src/main/java/jarkz/tbot/")
    copy("output/core", "app/src/main/java/jarkz/tbot/")
    removeAll("api.json", "tbot_type_generator", "output")
  }
  finalizedBy("spotlessApply")
}
