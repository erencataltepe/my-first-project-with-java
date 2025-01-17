package calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double bubblegum = 202;
        double toffee = 118;
        double iceCream = 2250;
        double milkChocolate = 1680;
        double dougnut = 1075;
        double pancake = 80;

        double income = bubblegum + toffee + iceCream + milkChocolate + dougnut + pancake;

        System.out.println("Earned amount");
        System.out.println("Bubblegum: $" + bubblegum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" +iceCream);
        System.out.println("Milk chocolate: $" + milkChocolate);
        System.out.println("Doughnut: $" + dougnut);
        System.out.println("Pancake: $" + pancake);

        System.out.println("Income: $" + income);
        System.out.println("Staff expenses:");
        double staffExpenses = scanner.nextDouble();
        System.out.println("Other expenses:");
        double otherExpenses = scanner.nextDouble();
        double netIncome = income - staffExpenses - otherExpenses;
        System.out.printf("Net income: $%.0f", netIncome);



        scanner.close();

    }
}