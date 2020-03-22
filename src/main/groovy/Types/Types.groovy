package Types

class Types {

    static void main(String[] args) {
        // Groovy is an optionally typed language which means you can choose whether to specify
        // the types of your variables / methods or have them dynamically inferred.

        // Type specified
        String intro = "hello world!"
        int number = 123
        double guess = 1.23

        // Type inferred at runtime
        def introInferred = "hello world!"
        def numberInferred = 123
        def guessInferred = 1.23
    }

    // Type specified
    static Integer getMyGuess() {
        123
    }

    // Type inferred
    static def getMyGuessInferred() {
        123
    }
}
