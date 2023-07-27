# About TBot

If you had to work with Spring Framework, you know firsthand that it framework is comfortable and powerful. But it's very very big for using Telegram API. And this project `TBot` will overcome these problems!

He will has any datatypes, handlers with custom rules and multithreading!

## Specifications

### Datatypes

  * some classes can be empties if in telegram API schemas datatype also empty;
  * they must be serialized into JSON and deserialized from it;
  * serialized field names (in JSON) must be snake_case but field of classes must be camelCase;
  * not necessary fields must be Objects and getters must return they as Optional type;
  * if telegram API schemas provide general datatype, which have different fields in dependency of key, then make interface, which have method to provide value of key. And implement classes by general datatype interface and they must have `protected` constant of key name for deserialization;
  * deserialized Objects must contains only general datatype as interface and for get specific methods, you need check using: equality of classes, instanceof keyword or interface method that provide value of key;
  * necessary fields, if possible, must contains primitive datatype, and must be marked annotation @NotNull;
  * any datatype, except empties, must have overridden equals and hashCode methods for using it with Java Collections;
  * any datatype, except empties, must have overridden toString method with template `ClassName[fieldName=fieldValue, secondFieldName=secondFieldValue,..]`;

## Accessbility

Project are not finished. Must be completed by mid to late fall.

## License

  [MIT](https://github.com/JarKz/TBot/blob/main/LICENSE)
