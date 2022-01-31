package com.akadatsky;

public class Main {

    /*
        Lemon: 24.90, 198г
        Banana: 31.30, 198г (again 198)
        RedApple: 14.90, 228г
        GreenApple: 23.90, 232г
     */
    public static void main(String[] args) {

        Lemon lemon = new Lemon(198);
        Banana banana = new Banana(198);
        Apple redApple = new AppleRed(228);
        Apple greenApple = new AppleGreen(232);

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

    }
}
