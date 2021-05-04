package com.company;


import java.io.IOException;
import java.util.Scanner;

public class ConsoleStrategy implements CalcStrategy{
    @Override
    public void calc(){
        Scanner sc = new Scanner(System.in);
        String arg1;
        String arg2;
        String operation;
        float result;
        System.out.println("Enter the first number:");
        arg1 = sc.nextLine();
        if (arg1.length() <= 0 || arg1.matches("[0-9.-]+") == false) {
            System.out.println("One of the arguments or both of them is/are empty or not valid");
            System.exit(-1);
        }
        System.out.println("Enter the second number:");
        arg2 = sc.nextLine();
        if (arg2.length() <= 0 || arg2.matches("[0-9.-]+") == false) {
            System.out.println("One of the arguments or both of them is/are empty or not valid");
            System.exit(-1);
        }
        float number1 = Float.parseFloat(arg1);
        float number2 = Float.parseFloat(arg2);
        System.out.println("Enter the operation type:");
        operation = sc.nextLine();
        if (operation.equals("+")){
            System.out.println("The result is :");
            result = number1 + number2;
            System.out.println(result);
        }
        else if (operation.equals("-")){
            System.out.println("The result is :");
            result = number1 - number2;
            System.out.println(result);
        }
        else if (operation.equals("*")){
            System.out.println("The result is :");
            result = number1 * number2;
            System.out.println(result);
        }
        else if (operation.equals("/") && number2 != 0){
            System.out.println("The result is :");
            result = number1 / number2;
            System.out.println(result);
        }
        else if (operation.equals("%") && number2 != 0){
            System.out.println("The result is :");
            result = number1 % number2;
            System.out.println(result);
        }
        else if ((operation.equals("%") || operation.equals("/")) && number2 != 0){
            System.out.println("Division by zero is forbidden!!!");
            System.exit(-1);
        }
        else{
            System.out.println("Operation you've chosen doesn't exist");
            System.exit(-1);
        }
    }
}
