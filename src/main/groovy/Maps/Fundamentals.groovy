package Maps

class Fundamentals {

    static void main(String[] args) {
        // In Groovy maps can be declared literally as opposed to the robust "new HashMap<>()" syntax
        // Maps can be formatted like arrays where key and value are separated by a colon:
        def aMap = [
                "name"      : "Kyran",
                "profession": "Software Engineer"
        ]

        // Adding new key to the map
        aMap["sport"] = "Table Tennis"
        assert aMap["sport"] == "Table Tennis"

        // Asserting size of map
        assert aMap.size() == 3
    }

}
