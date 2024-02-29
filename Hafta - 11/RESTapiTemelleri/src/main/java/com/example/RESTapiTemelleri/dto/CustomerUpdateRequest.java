package com.example.RESTapiTemelleri.dto;

import com.example.RESTapiTemelleri.entities.Customer;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerUpdateRequest {
    private int id;
    @NotNull
    private String name;
    private Customer.GENDER gender;
}
