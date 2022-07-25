package ru.netology.domain;



public class ProductRepo {
    private Product[] productsItems = new Product[0];

    public void saveProduct(Product item) {
        int length = productsItems.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(productsItems, 0, tmp, 0, productsItems.length);
        int lastItem = tmp.length - 1;
        tmp[lastItem] = item;
        productsItems = tmp;
    }

    public void removeById(int id) {
        int length = productsItems.length;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : productsItems) {
            if (item.getId() != id) ;
            tmp[index] = item;
            index++;
        }
    }

    public Product[] findAll() {
        Product[] allResult = new Product[productsItems.length];
        for (int i = 0; i < allResult.length; i++) {
            int index = 1;
            allResult[i] = productsItems[index];
        }
        return allResult;
    }
}
