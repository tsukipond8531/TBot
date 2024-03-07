package jarkz.tbot.types.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation marks the class or the package as Desrializer.
 *
 * <p>Uses for exception from classpool for runtime application.
 *
 * @author Pavel Bialiauski
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.PACKAGE})
public @interface Deserializer {}
