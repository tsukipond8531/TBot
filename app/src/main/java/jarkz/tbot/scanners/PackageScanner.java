package jarkz.tbot.scanners;

import java.util.List;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

public class PackageScanner {

  public List<ClassInfo> scanUserPackages(Class<?> baseClass) {
    var packageName = baseClass.getPackageName();
    packageName = packageName.substring(0, packageName.length() - baseClass.getName().length() - 1);

    var reflections = new Reflections(packageName, Scanners.SubTypes.filterResultsBy(s -> true));

    return reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .map(c -> scanClass(c))
        .toList();
  }

  public ClassInfo scanClass(Class<?> classToScan) {

    throw new UnsupportedOperationException("Unimplemented method");
  }
}
