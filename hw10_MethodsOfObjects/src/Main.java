public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Fedor", "Dostoevsky");
        Author author2 = new Author("Gabriel Garsia", "Markes");

        Book book1 = new Book("Brothers Karamazovi", author1, 1880);
        Book book2 = new Book("100 years of Solitude", author2, 1968);

        book2.setYear(1967);

        System.out.println(book1);
        System.out.println(book2);
    }
}