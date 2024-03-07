package jarkz.tbot.scanners;

import jarkz.tbot.core.Rule;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Optional;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

public class PackageScanner {

  public List<ClassInfo> scanUserPackages(Class<?> baseClass) {
    var packageName = baseClass.getPackageName();

    var reflections = new Reflections(packageName, Scanners.SubTypes.filterResultsBy(s -> true));

    return reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .map(c -> scanClass(c))
        .filter(c -> c.isPresent())
        .map(c -> c.get())
        .toList();
  }

  public Optional<ClassInfo> scanClass(Class<?> classToScan) {

    ClassInfo info = null;

    var methods = classToScan.getDeclaredMethods();
    for (var method : methods) {
      if (!Modifier.isPublic(method.getModifiers()) || !method.isAnnotationPresent(Rule.class)) {
        continue;
      }

      if (info == null) {
        info = new ClassInfo(classToScan);
      }

      info.addMethodInfo(method);
    }

    return Optional.ofNullable(info);
  }
}
