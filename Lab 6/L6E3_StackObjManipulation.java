
import java.util.*;

public class L6E3_StackObjManipulation {
    public static void main(String[] args) {
    Stack<Book> books = new Stack<>();
    Book one = new Book("1234","JJ", "Fundamental of Java ");
    Book two = new Book("3456","KK", "Fundamental of Kotlin ");
    Book three = new Book("5678" , "PP","Fundamental of Python");
    books.push(one);
    books.push(two);
    books.push(three);



    Stack<Book> booksReversed = new Stack<>();
    Stack<Book> clonedbooks = new Stack<>();
    clonedbooks = (Stack<Book>) books.clone();

    while(!clonedbooks.isEmpty()){
        Book temp = new Book();
        temp = clonedbooks.pop();
        booksReversed.push(temp);
    }
    System.out.println("Original Books");
    books.forEach(e->System.out.println(e.ISBN + "-" + e.title +"-by "+ e.author));
    System.out.println("Reversed books");
    booksReversed.forEach(e->System.out.println(e.ISBN + "-" + e.title +"-by "+ e.author));
    System.out.println("Cloned books");
    clonedbooks.forEach(e->System.out.println(e.ISBN + "-" + e.title +"-by "+ e.author));
}
}

class Book {
    String ISBN, author, title;
    public Book(String ISBN, String author, String title) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }
    public Book() {

    }
}