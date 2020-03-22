package Strings

class Fundamentals {

    static void main(String[] args) {
        // String interpolation
        def name = "Kyran"
        def profession = "Software Engineering"
        assert "$name loves $profession" == "Kyran loves Software Engineering"

        // String replacement (using regex)
        def test2 = "This is 123 test"
        test2 = test2.replaceAll(/\d+/, "456")
        assert test2 == "This is 456 test"

        // String finding (using regex)
        assert test2 =~ /\d+/ // true if test2 contains digits
    }
}
