package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
                products[index] = products[index + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
