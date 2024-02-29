package dev.patika.library.dto.response.book;

import dev.patika.library.dto.response.category.CategoryResponse;
import dev.patika.library.entitites.Author;
import dev.patika.library.entitites.Category;
import dev.patika.library.entitites.Publisher;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {

    private int id;

    private String name;

    private LocalDate publicationYear;

    private int stock;


    private int authorId;


    private int publisherId;

    private List<Category> categoryList;
}
