package dev.patika.Ecommerce.dto.response.product;

import dev.patika.Ecommerce.entities.Category;
import dev.patika.Ecommerce.entities.Supplier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private int id;


    private String name;


    private double price;


    private int stock;


    private int supplierId;


    private int categoryId;
}
