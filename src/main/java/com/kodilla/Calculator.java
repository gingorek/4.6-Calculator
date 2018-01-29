package com.kodilla;

public class Calculator {

    public void someMethod(){
        System.out.println("To wszystko dziala !!");
    }
    public void  addingStuff(int a, int b){
        int result = a+b ;
        System.out.println("Wynik dodawania = " + result);
    }
    public void  substratingStuff(int c, int d){
        int result = c-d;
        System.out.println("Wynik odejmowania = " + result);
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.someMethod();
        calculator.addingStuff(5,6);
        calculator.substratingStuff(100,5);
    }
}
