package ru.perepelitsina.part1.lesson23;

import java.util.ArrayList;
import java.util.List;

public class BasketClass implements Basket {
    private List<String> productList = new ArrayList<>();
    private List<Integer> quantityList = new ArrayList<>();
    @Override
    public void addProduct(String product, int quantity) {
        if (productList.contains(product)){
            updateProductQuantity(product, quantity);
        } else {
            productList.add(product);
            quantityList.add(productList.indexOf(product), quantity);
        }
    }

    @Override
    public void removeProduct(String product) {
        int i = productList.indexOf(product);
        productList.remove(i);
        quantityList.remove(i);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int q = productList.indexOf(product);
        Integer oldQ = quantityList.get(q);
        quantityList.remove(q);
        quantityList.add(q, (oldQ + quantity));
    }

    @Override
    public void clear() {
        productList.clear();
        quantityList.clear();
    }

    @Override
    public List<String> getProducts()
    {
        return productList;
    }

    @Override
    public int getProductQuantity(String product) {
        int iPr = productList.indexOf(product);
        return quantityList.get(iPr);
    }
}
