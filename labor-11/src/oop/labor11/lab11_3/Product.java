package oop.labor11.lab11_3;

import oop.labor11.lab11_2.Employee;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {
    private final int identifier;
    private final String name;
    private int amount;
    private int price;

    public Product(int ID, String name, int amount, int price) {
        this.identifier = identifier;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void increaseAmount(int newAmount) {
        this.amount += newAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }


}
