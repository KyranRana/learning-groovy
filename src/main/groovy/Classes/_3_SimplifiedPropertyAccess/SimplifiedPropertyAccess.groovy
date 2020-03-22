package Classes._3_SimplifiedPropertyAccess

class SimplifiedPropertyAccess {

    static void main(String[] args) {
        def classes = [String, List, File]

        for (clazz in classes) {
            // Groovy does not obey the JavaBean property conventions (getter and setter methods
            // for accessing and modifying properties) but instead uses a way simpler approach which
            // allows properties to be accessed and changed directly via dot-notation.
            //
            // Internally the Groovy compiler will still make calls to the getters and setters of
            // the respective Java classes for you.
            //
            println clazz.package.name
        }

        // Be aware in Groovy you can also achieve the same objective as shown above using the fancy
        // star-dot (*.) notation directly on the list. This allows property access to be applied to
        // every item in the list (demonstrated below) and the result will be a list with all values'
        // "package.name".
        println classes*.package*.name
    }
}
