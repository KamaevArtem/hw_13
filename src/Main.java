public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("J.R.R. Tolkien", "Tolkien");
        Author author2 = new Author("Stephen King", "King");

        Book book1 = new Book("The Hobbit", author1, 1937);
        Book book2 = new Book("The Lord of the Rings", author2, 1954);

        book1.setPublicationYear(1937);
        book2.setPublicationYear(1954);
        System.out.println("Книга 1: "+ book1.toString());
        System.out.println("Книга 2: "+ book2.toString());


    }
}