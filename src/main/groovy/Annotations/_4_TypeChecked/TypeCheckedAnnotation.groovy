package Annotations._4_TypeChecked

import groovy.transform.TypeChecked

/**
 * What is TypeChecked?
 * Groovy by default is type checked at runtime, however you can change its behaviour so it checks
 * types at compile time using the {@link TypeChecked} annotation. Be aware the annotated method has
 * to be free of dynamic features for {@link TypeChecked} to work.
 */
class TypeCheckedAnnotation {
    //@TypeChecked
    //static int answer() { "forty two" }
}
