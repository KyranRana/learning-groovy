package Annotations._1_Introduction

import groovy.transform.Immutable

/**
 * What is an annotation?
 * Annotations in groovy can be declared and used just like annotations in Java, however in Groovy
 * you can also use them to change how your code is compiled. There are many different annotations
 * provided by the GDK (Groovy Development Kit) for this purpose, the main one we will demonstrate
 * here is {@link Immutable}.
 *
 * The {@link Immutable} annotation is used to mark a class as final meaning after instantiation
 * you can not change its state. Under the hood this annotation does a lot of hard work including
 * implementing strict copying for access to mutable properties, generating an equality hashcode
 * based on the object's contents, and generating relevant constructors to set properties in the
 * class on instantiation.
 *
 * This whole process of using annotations to alter the compiled program's state is known as
 * performing an AST transformation. Think of AST (Abstract Syntax Tree) as a representation of
 * your code before its looked at the Groovy compiler to create Java bytecode. An AST transformation
 * is what intercepts that process, taking the AST and manipulating it so the targeted code fulfills
 * the need of the annotation used (known as compile-time metaprogramming).
 */
@Immutable
class ImmutableBook {
    String title
}
