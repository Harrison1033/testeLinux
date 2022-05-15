package br.com.harrison.principal;

import java.util.Scanner;
//Fatorando cédulas
public class TesteMain01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor a ser fatorado");
        int cedulas = scan.nextInt();
        System.out.println(cedulas);
        System.out.println(cedulas / 100 + " nota(s) de R$ 100,00" );
        cedulas %= 100;
        System.out.println(cedulas / 50 + " nota(s) de R$ 50,00");
        cedulas %= 50;
        System.out.println(cedulas / 20 + " nota(s) de R$ 20,00");
        cedulas %= 20;
        System.out.println(cedulas / 10 + " nota(s) de R$ 10,00");
        cedulas %= 10;
        System.out.println(cedulas / 5 + " nota(s) de R$ 5,00");
        cedulas %= 5;
        System.out.println(cedulas / 2 + " nota(s) de R$ 2,00");
        cedulas %= 2;
        System.out.println(cedulas + " nota(s) de R$ 1,00");


    }
}