package com.example.order;

public class Order {
    private String id;
    private String product;
    private int quantity;
    private String userId;

    public Order(String id, String product, int quantity, String userId) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.userId = userId;
    }

    // Getters
    public String getId() { return id; }
    public String getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public String getUserId() { return userId; }
}
