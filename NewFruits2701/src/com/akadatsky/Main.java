package com.akadatsky;

public class Main {

    /*
        Lemon: 24.90, 198г
        Banana: 31.30, 198г (again 198)
        RedApple: 14.90, 228г
        GreenApple: 23.90, 232г
     */
    public static void main(String[] args) {

        Fruit lemon = new Lemon(198);
        Fruit banana = new Banana(198);
        Fruit redApple = new AppleRed(228);
        Fruit greenApple = new AppleGreen(232);
        Fruit yellowApple = new Apple(Color.YELLOW, 0.0, 0);

        CashMachine cashMachine = new CashMachine();
        cashMachine.add(lemon);
        cashMachine.add(banana);
        cashMachine.add(redApple);
        cashMachine.add(greenApple);
        cashMachine.printBill();
        System.out.println("Information of existing products:");
        lemon.getInfo();
        banana.getInfo();
        redApple.getInfo();
        greenApple.getInfo();
        System.out.println("\nInformation of not existing products:");
        yellowApple.getInfo();

    }
}
