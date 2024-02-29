package dev.patika.spring.api;

import dev.patika.spring.Customer;
import dev.patika.spring.business.abstracts.ICustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {



}
/*
        Field ile IoC uygulaması
        @Autowired
        private ICustomerService customerService;
*/

/*
        Setter ile IoC uygulaması

        private final ICustomerService customerService;

        @Autowired
        public void setCustomerService(ICustomerService customerService) {
            this.customerService = customerService;
        }
*/

/*
        Constructor ile IoC uygulaması

        private final ICustomerService customerService;


        public CustomerController(ICustomerService customerService){
            this.customerService = customerService;
        }
*/

/*
    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/{id}")
    public Customer getById(@PathVariable("id") int id){
        return this.customerService.getById(id);
    }

 */