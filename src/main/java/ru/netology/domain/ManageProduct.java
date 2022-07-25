package ru.netology.domain;

public class ManageProduct extends Product {

    private ProductRepo repository;
    private Product[] products = new Product[0];


    public void add(Product productItem) {
        repository.saveProduct(productItem);
    }

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product searchBy(int id) throws Exception {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                return products[i];
            }
        }
        throw new Exception("Element not found");
    }

    public Product[] findAll() {
        return products;
    }
}
