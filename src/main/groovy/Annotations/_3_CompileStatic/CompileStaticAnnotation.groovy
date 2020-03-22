package Annotations._3_CompileStatic

import groovy.transform.CompileStatic

/**
 * What is CompileStatic Annotation?
 * As Groovy is a dynamically compiled language method calls are not what they seem in a compiled
 * sense. When you call a method in Groovy when that code gets compiled the method call will be
 * funnelled through a meta-class object. This is the important component which allows Groovy to
 * manipulate the JDK with its own flare by intercepting, redirecting, adding or removing method
 * calls during runtime. Please note all method calls are compiled this way.
 *
 * This does not affect performance as badly as the metaClass object is highly optimised for the
 * Java compiler. However if you have many flows going on in your Groovy code and require near Java
 * performance you can use {@link CompileStatic} to strip this dynamic functionality.
 */
@CompileStatic
class CompileStaticAnnotation {
}
