package com.akadatsky;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<Fruit> fruits = new ArrayList<>();

    public void add(Fruit fruit) {
        fruits.add(fruit);
    }

    public void printBill() {
        double sum = 0;
        double itemSum;
        for (Fruit fruit : fruits) {
            itemSum = fruit.getWeight() * fruit.getPricePerKg() / 1000.0;
            sum += itemSum;
            System.out.printf("%-10s%8.2f%n", fruit.getType(), itemSum);
        }
        System.out.println("==================");
        System.out.printf("%-10s%8.2f%n%n", "Total:", sum);
    }
}
