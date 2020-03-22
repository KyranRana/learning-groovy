package Classes._1_Declaration

class Declaration {

    /**
     * Classes can be instantiated in Groovy the same way they are in Java.
     *
     * Notice how we haven't explicitly imported the Book class? Because the Book class is in
     * the "src" directory which is in our classpath, the Groovy runtime environment will find
     * it for us and compile it to a Java class before calling it.
     *
     * Package scanning normally happens from the current package till root.
     */
    static void main(String[] args) {
        Book gina = new Book('Groovy in Action')

        assert gina.getTitle() == 'Groovy in Action'
        assert getTitleBackwards(gina) == 'noitcA ni yvoorG'
    }

    static String getTitleBackwards(book) {
        String title = book.getTitle()
        return title.reverse()
    }
}