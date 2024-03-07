package jarkz.tbot.violations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ViolationList {

  private Map<String, List<Violation>> violationGroups = new HashMap<>();

  private final String NEXT_LINE = "\n";

  private final String SKIP_LINE = "\n\n";

  public ViolationList addTo(String group, Violation violation) {
    var violations = this.violationGroups.getOrDefault(group, new ArrayList<>());
    violations.add(violation);
    this.violationGroups.put(group, violations);
    return this;
  }

  public ViolationList extendFrom(ViolationList violations) {
    BinaryOperator<List<Violation>> concatValues =
        (firstList, secondList) -> {
          var newList = new ArrayList<Violation>();
          newList.addAll(firstList);
          newList.addAll(secondList);
          return newList;
        };

    var thisEntries = violationGroups.entrySet();
    var otherEntries = violations.violationGroups.entrySet();

    violationGroups =
        Stream.concat(thisEntries.stream(), otherEntries.stream())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, concatValues));
    return this;
  }

  public boolean isEmpty() {
    return violationGroups.isEmpty();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Violation List:").append(SKIP_LINE);

    for (var group : violationGroups.entrySet()) {
      builder.append(group.getKey()).append(':').append(SKIP_LINE);
      for (var violation : group.getValue()) {
        builder.append(violation.toString()).append(NEXT_LINE);
      }
      builder.append(SKIP_LINE);
    }

    return builder.toString();
  }
}
