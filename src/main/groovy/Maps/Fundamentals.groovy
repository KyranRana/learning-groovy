package Maps

class Fundamentals {

    static void main(String[] args) {
        // In Groovy maps can be declared literally as opposed to the robust "new HashMap<>()" syntax
        // Maps can be formatted like arrays where key and value are separated by a colon:
        def aTypeInferredMap = [
                "name"      : "Kyran",
                "profession": "Software Engineer"
        ]

        // Declaring the type of each key and value
        Map<String, Integer> aMap = [
                "test" : 123,
                "test2": 456
        ]

        // Adding new key to the map
        aTypeInferredMap["sport"] = "Table Tennis"
        assert aTypeInferredMap["sport"] == "Table Tennis"

        // Asserting size of map
        assert aTypeInferredMap.size() == 3
    }

}
