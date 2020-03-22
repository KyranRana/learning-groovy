package Assertions

class Assertions {

    static void main(String[] args) {
        // Groovy supports plain assertions just like Java does with the use of the assert keyword.
        // Assertions allow you to determine if your program is behaving as you expect it to.
        assert (true)
        assert 1 == 1
        def x = 1
        assert x == 1
        def y = 1; assert y == 1

        // Note: Groovy's assertions are more powerful than normal Java assertions since they give
        // you the current state of the variables you put to the test (including their combined
        // outcome). This means in failure you get to see why a certain conditional or state test
        // has failed.

        // Examples of failed assertions.
//        assert 1 == 2

//        def a = 5
//        def b = 9
//        assert b == a + a
    }
}
