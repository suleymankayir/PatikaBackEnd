import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> library = new TreeSet<>(new BookNameComparetor());

        library.add(new Book("Star Wars",234,"George Lucas","23.10.1970"));
        library.add(new Book("Star Trek",123,"Cpt. Spook","23.10.1981"));
        library.add(new Book("Harry Potter",600,"J.K.Rowling","23.10.1999"));
        library.add(new Book("Ring",890,"Tolkien","23.10.1953"));
        library.add(new Book("Percy Jackson",317,"Rick Riordan","12.09.2005"));


        Iterator<Book> itr = library.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next().getBookName());
        }


        TreeSet<Book> library2 = new TreeSet<>(new BookPageNumberComparetor().reversed() );

        library2.add(new Book("Star Wars",234,"George Lucas","23.10.1970"));
        library2.add(new Book("Star Trek",123,"Cpt. Spook","23.10.1981"));
        library2.add(new Book("Harry Potter",600,"J.K.Rowling","23.10.1999"));
        library2.add(new Book("Ring",890,"Tolkien","23.10.1953"));
        library2.add(new Book("Percy Jackson",317,"Rick Riordan","12.09.2005"));

        Iterator<Book> itr2 = library2.iterator();

        while (itr2.hasNext()){
            System.out.println(itr2.next().getBookPageNumber());
        }

    }
}