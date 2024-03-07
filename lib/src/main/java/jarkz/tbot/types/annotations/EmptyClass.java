package jarkz.tbot.types.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks that class is emply (it doesn't contains any fields, only overriden Object methods.)
 *
 * <p>Uses for exception from classpool for test or runtime application.
 *
 * @author Pavel Bialiauski
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EmptyClass {}
