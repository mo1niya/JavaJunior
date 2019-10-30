package ru.perepelitsina.part1.lesson25.task2;

import java.util.HashMap;
import java.util.Map;

public class BasketImpl implements Basket {
    private Map<String, Integer> productMap = new HashMap<>();
    @Override
    public void addProduct(String product, int quantity) {
        if (productMap.containsKey(product)){
            updateProductQuantity(product, quantity);
        } else {
            productMap.put(product, quantity);
        }
    }

    @Override
    public void removeProduct(String product) {
        productMap.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int oldQ = productMap.get(product);
        productMap.put(product, oldQ + quantity);
    }

    @Override
    public void clear() {
        productMap.clear();
    }

    @Override
    public Map<String, Integer> getProducts()
    {
        return productMap;
    }

    @Override
    public int getProductQuantity(String product) {
        return productMap.get(product);
    }
}
