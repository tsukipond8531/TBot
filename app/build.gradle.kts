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

tasks.register("genTypes") {
  doLast {
    exec { commandLine("git", "clone", "https://github.com/JarKz/tbot_type_generator") }
    exec { commandLine("python3", "-m", "venv", "tbot_type_generator/venv") }
    exec {
      commandLine(
          "./tbot_type_generator/venv/bin/pip",
          "install",
          "-r",
          "tbot_type_generator/requirements.txt"
      )
    }
    exec { commandLine("./tbot_type_generator/venv/bin/python", "tbot_type_generator/main.py") }
    exec { commandLine("rm", "-r", "tbot_type_generator") }
    exec { commandLine("rm", "api.json") }
    exec { commandLine("cp", "-r", "output/types", "src/main/java/jarkz/tbot/") }
    exec { commandLine("rm", "-r", "output") }
  }
}
