package com.example.RESTapiTemelleri.api;

import com.example.RESTapiTemelleri.business.abstracts.ICustomerService;
import com.example.RESTapiTemelleri.dto.CustomerResponse;
import com.example.RESTapiTemelleri.dto.CustomerSaveRequest;
import com.example.RESTapiTemelleri.dto.CustomerUpdateRequest;
import com.example.RESTapiTemelleri.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ModelMapper modelMapper;
    // Read
    @GetMapping("/customers")
    // HTTP kodları için postmande status kısmında da çıktı olarak gözüküyor
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerResponse> findAll(){
        /* Custom Hali
        List<Customer> customerList = this.customerService.findAll();
        List<CustomerDto> customerDtoList = this.customerService.findAll().stream().map(
                customer -> this.converter.convertDto(customer)
        ).collect(Collectors.toList());
        */
        List<CustomerResponse> customerResponseList = this.customerService.findAll().stream().map(
                customer -> this.modelMapper.map(customer, CustomerResponse.class)
        ).collect(Collectors.toList());

        return customerResponseList;
    }

    // Create
    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    // JSON'ı Customer'a çevirmek için request body kullanıyoruz.
    public Customer save(@RequestBody CustomerSaveRequest customerSaveRequest){
        Customer newCustomer = this.modelMapper.map(customerSaveRequest,Customer.class);
        newCustomer.setOnDate(LocalDate.now());
        return this.customerService.save(newCustomer);
    }
    // Update
    @PutMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public Customer update(@RequestBody CustomerUpdateRequest customerUpdateRequest){
        Customer updatedCustomer = this.customerService.getById(customerUpdateRequest.getId());
        updatedCustomer.setName(customerUpdateRequest.getName());
        updatedCustomer.setGender(customerUpdateRequest.getGender());

        return this.customerService.update(updatedCustomer);
    }
   @DeleteMapping("/customers/{id}")
    public void delete(@PathVariable("id") int id){
        this.customerService.delete(id);
    }

    @GetMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerResponse getById(@PathVariable("id") int id){
       return this.modelMapper.map(this.customerService.getById(id), CustomerResponse.class);
    }
}
