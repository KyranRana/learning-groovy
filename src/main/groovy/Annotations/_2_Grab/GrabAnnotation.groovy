package Annotations._2_Grab

// The Grab annotation can be used to import dependencies within a Groovy script rather than using
// a dependency management system or explicitly including dependencies into the classpath. What
// provides this annotation is something called Grapes which is JAR dependency manager embedded into
// Groovy.

// Commented out because the Grab annotation is commonly used in standalone Groovy scripts. If you want
// to truly test this script you will need to uncomment the line below and run this script from the
// command line. Remember to comment this line after testing so other scripts in this project will not
// break.

//@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.9')
import org.apache.commons.lang3.ClassUtils

class GrabAnnotation {

    static void main(String[] args) {
        assert !ClassUtils.isInnerClass(Outer)
        assert ClassUtils.isInnerClass(Outer.Inner)
    }
}
