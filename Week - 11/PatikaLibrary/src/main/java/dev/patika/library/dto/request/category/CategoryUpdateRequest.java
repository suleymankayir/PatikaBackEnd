package dev.patika.library.dto.request.category;

import dev.patika.library.entitites.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryUpdateRequest {

    private int id;


    private String name;


    private String description;



}
