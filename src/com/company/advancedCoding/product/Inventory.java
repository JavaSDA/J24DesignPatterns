package com.company.advancedCoding.product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) { // TODO: revise this method
        this.products.add(product);
    }

    public List<Product> getProductsLessThan(float price) {
        // Stream the products and filter products whose price
        // is less than the one given above
        return this.products
                .stream()
                .filter(product -> product.getPrice() < price)
                .collect(Collectors.toList());
    }

    public List<Product> getProductsWithGreaterQuantity(int units) {
        return this.products
                .stream()
                .filter(product -> product.getQuantity() >= units)
                .collect(Collectors.toList());
    }

    public float getTotalPrice() {
        return (float) this.products
                .stream()
                .mapToDouble(product -> product.getPrice()) // Product::getPrice
                .sum();
    }

    public float getAveragePrice() {
        return (float) this.products
                .stream()
                .mapToDouble(product -> product.getPrice()) // Product::getPrice
                .average()
                .orElse(0.0f);
    }

    public Product getMostExpensive() {
        return this.products
                .stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
    }

}
