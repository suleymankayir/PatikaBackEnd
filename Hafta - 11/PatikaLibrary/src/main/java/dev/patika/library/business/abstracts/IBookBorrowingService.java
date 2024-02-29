package dev.patika.library.business.abstracts;

import dev.patika.library.entitites.BookBorrowing;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IBookBorrowingService {
    BookBorrowing save(BookBorrowing bookBorrowing);
    BookBorrowing get(int id);
    Page<BookBorrowing> cursor(int page, int pageSize);
    BookBorrowing update(BookBorrowing bookBorrowing);
    boolean delete(int id);
    List<BookBorrowing> getAll();
}
