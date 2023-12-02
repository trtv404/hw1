package hw1;

import java.util.ArrayList;
import java.util.List;

public abstract class Vending {
    private final List<Product> products;

    public Vending() {
        products = new ArrayList<>();
    }

    void addProduct(Product product){
        products.add(product);
    }

    Product getProduct(String type){
        for (Product product: products) {
            if (type.equalsIgnoreCase(product.getName())) return product;
        }
        return null;
    }
    Product getProduct(int id){
        for (Product product: products) {
            if (id == product.getId()) return product;
        }
        return null;
    }

    Product getProduct(String type, int volume){
        for (Product product: products) {
            if (type.equalsIgnoreCase(product.getName()) & volume == product.getVolume()) return product;
        }
        return null;
    }
}