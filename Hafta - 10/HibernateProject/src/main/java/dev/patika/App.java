package dev.patika;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.List;

public class App {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        // create - read - update - delete
        session.beginTransaction();
        try {
            Customer customer = new Customer();

            customer.setName("Hibernate Test");
            customer.setGender(Customer.GENDER.FEMALE);
            customer.setOnDate(LocalDate.now());
            customer.setMail("test@patika.dev");

            session.persist(customer);

            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }


    }
}

            /*
            Tek bir nesne çekme
             Customer customer1 = session
                    .createSelectionQuery("FROM Customer WHERE id = 2",Customer.class)
                    .getSingleResult();


            System.out.println(customer1.toString());0
             */

            /*
            Hashql ile veri çekme

            List<Customer> customers = session
                    .createSelectionQuery("FROM Customer", Customer.class)
                    .getResultList();

            System.out.println(customers.toString());

            */

            /*
            Read işlemleri

            customer = session.byId(Customer.class).getReference(2);
            System.out.println(customer);

             */


            /*
            Hibernate ile Create İşlemi


            customer.setName("Hibernate Test");
            customer.setGender(Customer.GENDER.FEMALE);
            customer.setOnDate(LocalDate.now());
            customer.setMail("test@patika.dev");

            session.persist(customer);

             */

            /*
            Update işlemi
            customer = session.get(Customer.class,1);
            customer.setName("Değişmedi");
            session.persist(customer);
            */

            /*
            Remove işlemi
            session.remove(customer);
            */
