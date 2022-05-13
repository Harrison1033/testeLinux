package br.com.harrison.principal;

import java.util.Scanner;

public class TesteMain01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Digite o valor de x1: ");
        double x1 = scan.nextDouble();
        System.out.println("Digite o valor de y1: ");
        double y1 = scan.nextDouble();
        System.out.println("Digite o valor de x2: ");
        double x2 = scan.nextDouble();
        System.out.println("Digite o valor de y2");
        double y2 = scan.nextDouble();
        double dist = Math.sqrt(Math.pow((x2 - x1), 2)+ Math.pow((y2 - y1), 2));
        System.out.printf("%.4f%n", dist);
    }
}