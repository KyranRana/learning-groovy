package Annotations._1_Introduction

class Introduction {

    static void main(String[] args) {
        ImmutableBook fixedBook1 = new ImmutableBook("test")

        // alternative way of instantiation
        ImmutableBook fixedBook2 = new ImmutableBook(title: "test")

        assert fixedBook1.title == "test"
        assert fixedBook2.title == "test"

        try {
            // testing we can not change an immutable object
            fixedBook1.title = "oh no!"
            assert false, "Should not happen!"
        } catch (ReadOnlyPropertyException e) {
            assert e.message == "Cannot set readonly property: title for class: Annotations._1_Introduction.ImmutableBook"
        }
    }
}
