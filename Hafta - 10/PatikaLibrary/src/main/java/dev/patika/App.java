package dev.patika;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {


    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        // Returning borrowed book process
        BookBorrowing bookBorrowing = new BookBorrowing();
        bookBorrowing.setName("Ayşe Ata Bak");
        bookBorrowing.setBorrowingDate(LocalDate.of(2024,1,12));
        bookBorrowing.setReturningDate(LocalDate.of(2024,1,24));
        bookBorrowing.setBook(entityManager.find(Book.class,1));
        entityManager.persist(bookBorrowing);

        transaction.commit();

        /*

        // Author Ekleme
        Author author = new Author();
        author.setName("Rick Riordan");
        author.setBirthDate(LocalDate.of(1970,9,13));
        author.setCountry("USA");
        entityManager.persist(author);

        // Publisher Ekleme
        Publisher publisher = new Publisher();
        publisher.setName("Ithaki");
        publisher.setEstablishmentYear(LocalDate.of(2002,10,4));
        publisher.setAddress("Kadıköy,İstanbul");
        entityManager.persist(publisher);

        // BookBorrow Ekleme
        BookBorrowing bookBorrowing = new BookBorrowing();
        bookBorrowing.setName("Ayşe Ata Bak");
        bookBorrowing.setBorrowingDate(LocalDate.of(2023,12,24));
        bookBorrowing.setReturningDate(null);
        entityManager.persist(bookBorrowing);

        // Category Ekleme
        Category category = new Category();
        category.setName("Fantastik");
        category.setDescription("Gerçekdışı olaylar barındırır.");
        entityManager.persist(category);

        // Book Ekleme
        Book book = new Book();
        book.setName("Şimşek Hırsızı");
        book.setPublicationYear(LocalDate.of(2004,4,12));
        book.setStock(100);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setBookBorrow(bookBorrowing);
        entityManager.persist(book);

        Category ile Book eşleştirme
        Category fantastic = entityManager.find(Category.class,1);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(fantastic);

        Book book = entityManager.find(Book.class,1);
        book.setCategoryList(categoryList);
        entityManager.persist(book);

         */


    }


}