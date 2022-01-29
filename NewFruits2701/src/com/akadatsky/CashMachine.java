package com.akadatsky;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<Fruit> fruits = new ArrayList<>();

    public void add(Fruit fruit) {
        fruits.add(fruit);
    }

    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public void printBill() {
        double sum = 0;
        double itemSum;
        String fruitItem;
        for (Fruit fruit : fruits) {
            itemSum = round(fruit.getWeight() * fruit.getPricePerKg() / 1000.0, 2);
            sum += itemSum;
            fruitItem = switch (fruit.getType()) {
                case LEMON -> Fruit.FruitType.LEMON.getFruit();
                case BANANA -> Fruit.FruitType.BANANA.getFruit();
                case APPLE -> Fruit.FruitType.APPLE.getFruit();
            };
            System.out.printf("%-10s%8.2f%n", fruitItem, itemSum);
        }
        System.out.println("==================");
        System.out.printf("%-10s%8.2f%n%n", "Total:", sum);
    }
}
