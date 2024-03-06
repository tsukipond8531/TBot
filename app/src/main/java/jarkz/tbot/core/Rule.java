package jarkz.tbot.core;

import java.util.function.Predicate;

import jarkz.tbot.types.Update;

public @interface Rule {
  public Predicate<Update> value = (update) -> true;
}
