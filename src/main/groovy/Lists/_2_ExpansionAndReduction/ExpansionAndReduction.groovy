package Lists._2_ExpansionAndReduction

class ExpansionAndReduction {

    static void main(String[] args) {
        // In Groovy you can easily change the size of a list at runtime.

        // Adding extra value by assigning to a non-existent index
        def test = [1, 2, 3]
        test[3] = 4
        assert test == [1, 2, 3, 4]

        // Adding extra values by assigning to non-existent indexes.
        def test2 = [1, 2, 3]
        test2[3..5] = [4, 5, 6]
        assert test2 == [1, 2, 3, 4, 5, 6]

        // Replacing value with extra values based on index(es)
        def test3 = [4, 5, 6]
        test3[1..1] = ['a', 'b', 'c']
        assert test3 == [4, 'a', 'b', 'c', 6]

        def test4 = [4, 5, 6]
        test4[0..1] = ['a', 'b', 'c']
        assert test4 == ['a', 'b', 'c', 6]

        // Replacing values with other values based on indexes
        def test5 = [1, 2, 3, 4, 5]
        test5[1..3] = [5, 6, 7]
        assert test5 == [1, 5, 6, 7, 5]

        // Replacing values with less values based on indexes (Reduction)
        def test6 = [1, 2, 3, 4, 5, 6]
        test6[1..3] = []
        assert test6 == [1, 5, 6]
    }
}
