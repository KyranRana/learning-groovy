package Annotations._3_CompileStatic

import groovy.transform.CompileStatic

/**
 * What is CompileStatic Annotation?
 * As Groovy is a dynamically compiled language method calls are not what they seem in a compiled
 * sense. When you call a method in Groovy when that code gets compiled the method call will be
 * funnelled through a meta-class object. This is the important component which allows Groovy to
 * manipulate the JDK with its own flare by intercepting, redirecting, adding or removing method
 * calls. Please note all method calls are compiled this way.
 *
 * This can be heavy on performance in some cases depending on the number of method calls you have.
 * If you want near Java performance you can use {@link CompileStatic} to remove this dynamic
 * functionality.
 */
@CompileStatic
class CompileStaticAnnotation {
}
