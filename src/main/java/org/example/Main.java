package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }
    //Test 1: Eine Methode, die die Summe von zwei ganzen Zahlen berechnet.
    public static int add(int a, int b) {
        return a+b;
    }
    //Test 2: Eine Methode, die überprüft, ob eine gegebene Zahl gerade ist.
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
    //Test 3: Eine Methode, die das Produkt von zwei ganzen Zahlen berechnet.
    public static int multiply(int a, int b) {
        return a * b;
    }
    //Test 4: Eine Methode, die einen gegebenen String in Großbuchstaben umwandelt.
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
    //Test 5: Eine Methode, die überprüft, ob eine gegebene Zahl positiv ist.
    public static boolean isPositive(int number) {
        return number > 0;
    }
}