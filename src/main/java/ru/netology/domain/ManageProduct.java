package ru.netology.domain;

import java.util.ArrayList;
import java.util.List;

public class ManageProduct extends Product {

    private final ProductRepo repository;

    public ManageProduct() {
        this.repository = new ProductRepo();
    }

    public void save(Product product) {
        repository.saveProduct(product);
    }

    public Product[] searchBy(String text) {
        Product[] products = repository.findAll();

        int currentItemsCount = clearArrayAndGetCountValidItems(products, text);
        Product[] productsListResult = new Product[currentItemsCount];

        for (int i = 0, j = 0; i < products.length; i++) {
            if (products[i] != null) {
                productsListResult[j] = products[i];
                j++;
            }
        }

        return productsListResult;
    }

    private int clearArrayAndGetCountValidItems(Product[] products, String text) {
        int counter = 0;
        for (int i = 0; i < products.length; i++) {
            if (!products[i].getName().equals(text)) {
                products[i] = null;
                continue;
            }
            counter++;
        }
        return counter;
    }


    public Product[] findAll() {
        return repository.findAll();
    }
}
