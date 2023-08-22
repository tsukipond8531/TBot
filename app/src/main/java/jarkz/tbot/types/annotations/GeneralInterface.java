package jarkz.tbot.types.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks inteface that it is general inteface. For a inteface, from which implements the datatypes
 * with different types.
 *
 * @author Pavel Bialiauski
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface GeneralInterface {}
