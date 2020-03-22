package Classes._1_Declaration

/**
 * Fields and methods without accessibility modifiers will be public by default.
 * Classes in Groovy are more than just classes, they are GroovyBeans!
 */
class Book {
    private String title

    Book(String title) {
        this.title = title
    }
    String getTitle() {
        return title;
    }
}