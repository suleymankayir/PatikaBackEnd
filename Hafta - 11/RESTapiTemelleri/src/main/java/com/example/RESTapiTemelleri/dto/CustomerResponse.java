package com.example.RESTapiTemelleri.dto;

import com.example.RESTapiTemelleri.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// POJO bir class (Plain Old Java Object) Düz eski Java objesi
// Customer -> CustomerDTO
public class CustomerResponse {
    private int id;
    private String name;
    private String mail;
    private Customer.GENDER gender;
}
