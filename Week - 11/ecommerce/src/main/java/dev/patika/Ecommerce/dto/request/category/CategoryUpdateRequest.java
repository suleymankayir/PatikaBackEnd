package dev.patika.Ecommerce.dto.request.category;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryUpdateRequest {
    @Positive(message = "ID degeri pozitif bir sayi olmak zorunda")
    private int id;
    @NotNull(message = "Kategori ismi boş ve null olamaz")
    private String name;
}
