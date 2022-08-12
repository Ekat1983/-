package ru.netology.domain;

import java.util.ArrayList;
import java.util.List;

public class ManageProduct extends Product {

    private final ProductRepo repository;

    public ManageProduct(){ this.repository = new ProductRepo();}

    public void save(Product product) {
       repository.saveProduct(product);
    }

    public Product[] searchBy(String text) {
        Product[] products = repository.findAll();

        List<Product> productsListResult = new ArrayList<Product>();

        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(text)) {
                productsListResult.add(products[i]);
            }
        }

       return productsListResult.toArray(new Product[productsListResult.size()]);
    }

    public Product[] findAll() {
        return repository.findAll();
    }
}
