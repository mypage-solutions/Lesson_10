package com.akadatsky;

public abstract class Fruit {

    public enum Color {
        RED("Red"), YELLOW("Yellow"), GREEN("Green");
        final String color;

        Color(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }

    public enum FruitType {
        APPLE("Apple"), LEMON("Lemon"), BANANA("Banana");
        final String type;

        FruitType(String type) {
            this.type = type;
        }

        public String getFruitType() {
            return type;
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

    public String fruitTypeConvert() {
        return switch (this.type) {
            case LEMON -> FruitType.LEMON.getFruitType();
            case BANANA -> FruitType.BANANA.getFruitType();
            case APPLE -> FruitType.APPLE.getFruitType();
        };
    }

    public String colorConvert() {
        return switch (this.color) {
            case RED -> Color.RED.getColor();
            case YELLOW -> Color.YELLOW.getColor();
            case GREEN -> Color.GREEN.getColor();
        };
    }

    public void getInfo() {
        double weight = this.weight / 1000d;
        System.out.printf("FruitType: %s, Color: %s, Price: %.2f, Weight: %.3f kg.%n",
                fruitTypeConvert(), colorConvert(), this.pricePerKg, weight);
    }
}
