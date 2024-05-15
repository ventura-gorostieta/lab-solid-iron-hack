package com.spin.labs.solid.model;

public class Order {

    private Long id;
    private String type;
    private int amount;
    private int quantity;
    private String email;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", quantity=" + quantity +
                ", email='" + email + '\'' +
                '}';
    }

}
