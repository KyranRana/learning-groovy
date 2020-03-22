package Classes._2_GroovyBean

class GroovyBean {

    static void main(String[] args) {
        def groovyBook = new Book()

        groovyBook.setTitle("Groovy in action!")
        assert groovyBook.getTitle() == "Groovy in action!" // equivalent to calling "groovyBook.getTitle()"
    }
}
