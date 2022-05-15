public class Book {

    private String author;
    private String title;

    public static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }

    public static void main(String[] args) {
        Book brzechwaBook = Book.of("Jan Brzechwa", "Akademia Pana Kleksa");
        System.out.println(brzechwaBook.author + " " + brzechwaBook.title);

    }


}
