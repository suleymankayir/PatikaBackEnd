package dev.patika.library.dto.response.bookborrowing;

import dev.patika.library.entitites.Book;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingResponse {

    private int id;

    private String name;

    private LocalDate borrowingDate;

    private LocalDate returningDate;


}
