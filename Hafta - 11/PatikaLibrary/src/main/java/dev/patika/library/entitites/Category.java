package dev.patika.library.entitites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", columnDefinition = "serial")
    private int id;

    @Column(name = "category_name", nullable = false,unique = true)
    private String name;

    @Column(name = "category_description", nullable = false)
    private String description;

    @JsonBackReference
    @ManyToMany(mappedBy = "categoryList", cascade = CascadeType.REMOVE)
    private List<Book> bookList;
}
