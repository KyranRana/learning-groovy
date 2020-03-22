package Lists._1_Fundamentals

class Fundamentals {

    static void main(String[] args) {
        // Lists are declared as actual lists in Groovy as opposed to the robust "new ArrayList<>()"

        // Explicitly declaring the type of each list item.
        List<Integer> fibo = [1, 1]
        List<Double> gold = [1.0, 2.0]

        // Type inferring each list item.
        List someList = ["This", "is", "a", "list"]

        // List shortcuts:
        // -1 represents the last item in the list.
        // -2 represents the second-to-last item in the list.
        // etc.
        while (!isGolden(gold[-1])) {
            fibo.add(fibo[-1] + fibo[-2])
            gold.add(fibo[-1] / fibo[-2])
        }

        println "found gold ratio with fibo(${fibo.size() - 1})"
        println fibo[-1] + "/" + fibo[-2] + " = " + gold[-1]
        println "_" * 10 + "|" + "_" * (10 * gold[-1])
    }


    static boolean isGolden(candidate) {
        def small = 1
        def big = small * candidate

        return isCloseEnough((small + big) / big, big / small)
    }

    static boolean isCloseEnough(a, b) {
        return (a - b).abs() < 1.0e-9
    }
}
