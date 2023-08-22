# Documentation

Using TBot may follow difficults and misundersntands.
Firstly, you shall understand that I make this project similar to the Spring: easy start using, dependency injections and automations. TBot will be easy and useful if you familiar with the Spring.

Before start to implemet the project, I separated framework by categories:

* [Datatypes](#Datatypes);
* Core;
* Handling updates.

> ___NOTE___
> The list will be replenished or modified as it develop the project.

## Datatypes

Instead of using complex JSON string, verifications and valdations, I use Java classes like POJO. By abstract from mechanism of serializations/deserialization, creating JSON by telegram docs, encapsulating data, you just use simple classes.

You shall do not change datatypes, inheriting or implementing, if you really do not need do it. But, for specific datatypes you can change it by yourself, then read, please, [the specific documentation for datatypes](https://github.com/jarkz/tbot/docs/DATATYPES.md) for correct work.
