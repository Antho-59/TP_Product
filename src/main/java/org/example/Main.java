package org.example;

import org.example.dao.ProductDAO;
import org.example.entity.Product;
import org.example.entity.Product_Electronic;
import org.example.entity.Product_Food;
import org.example.entity.Product_Housing;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();

        Product_Electronic productElectronic = Product_Electronic.builder()
                .name("TV Sony")
                .price(1000)
                .batterie_duration(8)
                .build();


        Product_Electronic productElectronic1 = Product_Electronic.builder()
                .name("TV Samsung")
                .price(1500)
                .batterie_duration(10)
                .build();

        productDAO.save(productElectronic);
        productDAO.save(productElectronic1);

        productDAO.getAll().forEach(System.out::println);

        Product_Food productFood = Product_Food.builder()
                .name("pizza")
                .price(12.9)
                .expiryDate("12-06-25").build();

        Product_Food productFood1 = Product_Food.builder()
                .name("burger")
                .price(15.9)
                .expiryDate("15-06-25")
                .build();

        productDAO.save(productFood);
        productDAO.save(productFood1);

        productDAO.getAll().forEach(System.out::println);

        Product_Housing productHousing = Product_Housing.builder()
                .name("house")
                .price(1200)
                .height(120)
                .width(200)
                .build();

    Product_Housing productHousing1 = Product_Housing.builder()
            .name("jcp")
            .price(592)
            .height(99)
            .width(111)
            .build();

    productDAO.save(productHousing);
    productDAO.save(productHousing1);

    productDAO.getAll().forEach(System.out::println);
    }
}
