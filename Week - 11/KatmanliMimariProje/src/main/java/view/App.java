package view;

import business.concretes.CustomerManager;
import dao.concretes.CustomerDao;
import entitites.Customer;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new CustomerDao());


        List<Customer> customerList = customerManager.findAll();
        System.out.println(customerList.toString());

        /*
        UPDATE İŞLEMİ

        Customer customer = customerManager.findById(1);
        customer.setName("Update Test");
        customerManager.update(customer);
        */

        /*
        SİLME İŞLEMİ
        customerManager.deleteById(2);
         */

        /*
        READ İŞLEMİ

        Customer firstCustomer = customerManager.findById(1);
        System.out.println(firstCustomer.toString());
        */

        /*
        SAVE İŞLEMİ

        Customer customer = new Customer();
        customer.setName("Test Dersleri");
        customer.setMail("test@patika.dev");
        customer.setGender(Customer.GENDER.MALE);
        customer.setOnDate(LocalDate.now());

        customerManager.save(customer);

         */
    }
}
