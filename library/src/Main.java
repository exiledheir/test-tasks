import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    private List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        Book b1 = new Book(1, "title1", "author1", "publisher1");
        Book b2 = new Book(2, "title2", "author2", "publisher2");
        Book b3 = new Book(3, "title3", "author3", "publisher3");
        Book b4 = new Book(4, "title4", "author4", "publisher4");

        main.addBook(b1);
        main.addBook(b2);
        main.addBook(b3);
        main.addBook(b4);

        System.out.println(main.getAllBooks());

        System.out.println(main.getById(2));

        main.deleteById(1);

        System.out.println(main.getAllBooks());

    }

    public void addBook(Book book) {
        if(Objects.nonNull(book)) {
            books.add(book);
        }
    }
    public List<Book> getAllBooks() {
        return books;
    }
    public Book getById(long id){
        for(Book book : books) {
            if(book.id() == id) {
                return book;
            }
        }
        return null;
    }

    public void deleteById(long id) {
       for(int i = 0; i < books.size(); i++) {
            if(books.get(i).id() == id) {
                books.remove(i);
            }
        }
    }
}
