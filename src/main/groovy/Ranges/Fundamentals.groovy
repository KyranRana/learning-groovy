package Ranges

class Fundamentals {

    static void main(String[] args) {
        // In Groovy ranges can be defined literally using <start_num>..<end_num>
        // Be aware Groovy also supports decreasing ranges as well.
        def x = 1..10

        // Asserting a range contains a value
        assert x.contains(5)
        assert !x.contains(15)

        // Asserting size of range
        assert x.size() == 10

        // Asserting range bounds
        assert x.from == 1
        assert x.to == 10

        // Asserting range values when reversed
        assert x.reverse() == 10..1
    }
}
