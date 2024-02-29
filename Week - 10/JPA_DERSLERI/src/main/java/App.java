import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class App {


    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();





        transaction.commit();


    }
}

        /*
         TypedQuery<Product> maxPriceQuery = entityManager.createQuery(
                "SELECT p FROM Product p ORDER BY p.price DESC", Product.class);
        maxPriceQuery.setMaxResults(1); -> gelecek sonucu 1 ile sınırlandırmaya yarıyor
        Product maxPricedProduct = maxPriceQuery.getSingleResult();
        System.out.println(maxPricedProduct);



        Burada dikkat edilmesi gereken husus Jpql'in db'den bağımsız olarak çalıştığı için hem okunması kolay hem de sql'deki bazı zorunlulukları
        göz ardı edebildiği için fazlasıyla esnek.
        GROUP BY'daki select'ten sonra yazılan sütunların yazılması zorunluluğu JPQL'de geçerli değil.

        // SELECT COUNT(p.product_id), c.category_name FROM products as p LEFT JOIN categories as c ON p.product_category_id = c.category_id GROUP BY p.product_category_id
        TypedQuery<Object[]> customQuery = entityManager.createQuery("SELECT COUNT(p.id), cat.name FROM Product p LEFT JOIN p.category cat GROUP BY p.category.id ", Object[].class);
        List<Object[]> productCount = customQuery.getResultList();

        for (Object[] product : productCount){
            System.out.println(product[1] + " - " + product[0]);
        }
        */

        /*
        Class'da namedQuery olarak belirlediğimiz query'leri kullanma
        TypedQuery<Product> allQuery = entityManager.createNamedQuery("Product.cheap", Product.class);
        allQuery.setParameter("prc" , 60001);
        List<Product> productList = allQuery.getResultList();

        for (Product product: productList){
            System.out.println(product.getPrice());
        }


        TypedQuery<Product> query = entityManager.createQuery("SELECT prod FROM Product prod WHERE prod.price BETWEEN 40000 AND 70000" , Product.class);
        List<Product> productList = query.getResultList();

        for (Product product: productList){
            System.out.println(product.getPrice());
        }


        TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p WHERE p.category.id IN :catIdList", Product.class);
        List<Integer> catList = Arrays.asList(1,2);
        query.setParameter("catIdList",catList);

        List<Product> productList = query.getResultList();

        for (Product product : productList) {
            System.out.println(product.getCategory().getId() + " - " + product.getName());
        }



        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
        */

    /*
            // Supplier ekleme
            Supplier supplier = new Supplier();
            supplier.setAddress("Adres");
            supplier.setCompany("Patika");
            supplier.setContact("12314212412");
            supplier.setMail("info@patika.dev");
            supplier.setPerson("Ali");
            entityManager.persist(supplier);

            Category category = new Category();
            category.setName("Telefonlar");
            entityManager.persist(category);

            Code code = new Code();
            code.setGroup("113123");
            code.setSerial("4456");
            entityManager.persist(code);

            Product product = new Product();
            product.setName("Iphone 15");
            product.setPrice(50000);
            product.setStock(100);
            product.setCode(code);
            product.setSupplier(supplier);
            product.setCategory(category);
            entityManager.persist(product);

            Color blue = new Color("Blue");
            Color red = new Color("Red");
            Color yellow = new Color("Yellow");

            entityManager.persist(blue);
            entityManager.persist(red);
            entityManager.persist(yellow);

            List<Color> colorList = new ArrayList<>();
            colorList.add(blue);
            colorList.add(red);
            product.setColorList(colorList);
            entityManager.persist(product);

            Product product = entityManager.find(Product.class,1);
            System.out.println(product.getColorList().toString());

            Product product = entityManager.find(Product.class,1);
            System.out.println(product.getCategory().getName());

         // SELECT * FROM categories
        //Query getAllCategories = entityManager.createQuery("SELECT cat FROM Category cat");
        TypedQuery<Category> getAllCategories = entityManager.createQuery("SELECT cat FROM Category cat",Category.class);
        List<Category> categoryList = getAllCategories.getResultList();

        for (Category category : categoryList){
            System.out.println(category.getName());


            //TypedQuery<Category> getAllCategories = entityManager.createQuery("SELECT cat FROM Category cat WHERE cat.id = ?1 ",Category.class);
        //getAllCategories.setParameter(1, 2);
        }

        /*

        // SELECT * FROM categories WHERE category_id = 1;
        TypedQuery<Category> getAllCategories = entityManager.createQuery("SELECT cat FROM Category cat WHERE cat.id = :id ",Category.class);

        getAllCategories.setParameter("id", 2);
        Category category = getAllCategories.getSingleResult();
        System.out.println(category.getName());

        List<Category> categoryList = getAllCategories.getResultList();

        for (Category cat : categoryList){
            System.out.println(cat.getName());
        }

        TypedQuery<CheapProduct> prodQuery = entityManager.createQuery("SELECT NEW CheapProduct(p.id,p.name,p.price) FROM Product p WHERE p.price < 65000", CheapProduct.class);
        List<CheapProduct> cheapProductList = prodQuery.getResultList();

        for (CheapProduct cp: cheapProductList){
            System.out.println(cp.toString());
        }

        List<Object[]> productNameList = prodQuery.getResultList();

        for (Object[] obj: productNameList){
            System.out.println("ID: " + obj[0] + " Name: " + obj[1] + " Price: " + obj[2]);
        }

         */


