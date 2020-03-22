package Imports

class ImportedPackages {

    /**
     * As opposed to Java which only imports package {@code java.lang}, Groovy provides more
     * convenience by automatically importing the following packages for you.
     *
     * - groovy.lang.*
     * - groovy.util.*
     * - java.lang.*
     * - java.util.*
     * - java.net.*
     * - java.io.*
     * - java.math.BigInteger
     * - java.math.BigDecimal
     *
     * Any other package will require an explicit import.
     */
    static void main(String[] args) {
        def classes = [
                String, // refers to java.lang.String
                List,   // refers to java.util.List
                File    // refers to java.io.File
        ]
    }
}
