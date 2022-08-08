package ru.netology.domain;

public class ManageProduct extends Product {

    private final ProductRepo repository;

    public ManageProduct(){ this.repository = new ProductRepo();}

    public void save(Product product) {
       repository.saveProduct(product);
    }

    public Product searchBy(int id) throws Exception {
        Product[] products = repository.findAll();

        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                return products[i];
            }
        }
        throw new Exception("Element not found");
    }

    public Product[] findAll() {
        return repository.findAll();
    }
}
