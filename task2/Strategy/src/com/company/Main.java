package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Calculation calculation = new Calculation();
    private static CalcStrategy strategy;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the type for the representation\n" +
                "1 - Console (in terminal)\n" +
                "2 - In the separate window (using graphics)\n" +
                "0 - Finish the program");
        String optionSelector = scanner.nextLine();
        if (strategy == null){
            if (optionSelector.equals("1")){
                System.out.println("You have chosen console representation.\n");
                strategy = new ConsoleStrategy();
            }
            else if (optionSelector.equals("2")){
                System.out.println("You have chosen window representation.\n");
                strategy = new WindowStrategy();
            }
            else if (optionSelector.equals("0")){
                System.out.println("You are leaving the program. Closing...");
                System.exit(0);
                //System.out.println("CLOSED");
            }
            else{
                System.out.println("The choice is not correct. Please try again. Stop the program");
                System.exit(0);
            }
        }
        calculation.calculate(strategy);

    }
}
