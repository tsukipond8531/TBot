# Documentation for Datatypes

## General information

Without going into detail, all datatypes implemented by [telegram api docs](https://core.telegram.org/bots/api). Some datatypes grouped by Intefaces, which marked by `@GeneralInterface` annotation. There is rules for using datatypes:

1. For get a specific datatype in field with a interface type, you must check by the `instanceof` keyword before casting;
2. Some classes can be empty (they marked by the `@EmptyClass` annotation), they doesn't contains the fields and are the "check marks";
3. Creating a datatype, make sure, that the not-null fields are filled.

## Specifications

Before creating or changing a datatype, read the specifications below. The main reason of using the specification is a ecosystem, that builded aroud the datatypes. Also some clauses are specific for json library: Gson.

* Creating datatype:
  1. Use a referenced datatype to [the telegram api docs](https://core.telegram.org/bots/api)
  2. Use the POJO specification (private/protected fields, getters/setters and equals/hashCode methods);
  3. The required fields must be marked by `@NotNull` annotation and be primitive, if possible;
  4. The optional fields must be Objects or Wrappers and they getters must return Optional\<T\> value;
  5. Overrie the equals and hashCode methods;
  6. (1) Overriden method toString must return the string by template: `ClassName[fieldName=fieldValue, secondFieldName=secondFieldValue,..]`;
  7. Datatype must be serialized and deserialized to and from JSON by google Gson library;

* Naming convention:
  1. Name of the class fields must be in camelCase form and logically equivalent to name in [the referenced docs](https://core.telegram.org/bots/api);
  2. If datatype field name is in snake_case form in [the referenced docs](https://core.telegram.org/bots/api), then mark field by `@SerializedName({field_name_in_snake_case})` annotation;

* Specific datatype convention:
  1. Some datatypes in [the referenced docs](https://core.telegram.org/bots/api) can be empties, therefore mark these datatypes by `@EmptyClass` annotation;
  2. Datatypes can ge grouped in [the referenced docs](https://core.telegram.org/bots/api), ([an exemple](https://core.telegram.org/bots/api#chatmember)). Make a general interface and mark it by `@GeneralInterface` annotation. And implement datatypes from the group by interface.
    - 2.1. For deserialization you need implement [adapter](https://www.javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/com/google/gson/JsonDeserializer.html). An example you can see in source package `jarkz.tbot.types.deserializers`.

>___NOTE___
> (1) – it not necessary for empty datatypes;
