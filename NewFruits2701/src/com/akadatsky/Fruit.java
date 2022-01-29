package com.akadatsky;

public class Fruit {

    public enum Color {
        RED, YELLOW, GREEN
    }

    public enum FruitType {
        APPLE("Apple"), LEMON("Lemon"), BANANA("Banana");
        final String fruit;

        FruitType(String fruit) {
            this.fruit = fruit;
        }

        public String getFruit() {
            return fruit;
        }
    }

    private FruitType type;
    private Color color;
    private double pricePerKg;
    private int weight;

    public Fruit(FruitType type, Color color, double pricePerKg, int weight) {
        this.type = type;
        this.color = color;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    public FruitType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public void getInfo() {
        double weight = this.weight / 1000d;
        System.out.printf("FruitType: %s, Color: %s, Price: %.2f, Weight: %.3f kg.%n",
                this.type, this.color, this.pricePerKg, weight);
    }
}
