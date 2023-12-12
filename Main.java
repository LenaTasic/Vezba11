package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int br1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Unesite zeljenu racunsku operaciju: ");
        String operator = scanner.nextLine();

        System.out.println("Unesite drugi broj: ");
        int br2 = Integer.parseInt(scanner.nextLine());

        if (operator.equals("+")) {
            System.out.println(br1+br2);
        } else if (operator.equals("-")) {
            System.out.println(br1-br2);
        } else if (operator.equals("*")) {
            System.out.println(br1*br2);
        } else if (operator.equals("/")) {
            if (br2!=0) {
                System.out.println(br1/br2);
            } else{
                System.out.println("Deljenje sa nulom");
            }
        } else {
            System.out.println("Operator nije podrzan");
        }

    }
}
