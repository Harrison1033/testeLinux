package br.com.harrison.principal;

import java.util.Scanner;

public class TesteMain01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        int c = scan.nextInt();

        if(a > b && a > c){
            System.out.println(a + " eh o maior");
        }else if(b > c){
            System.out.println(b + " eh o maior");
        }else {
            System.out.println(c + " eh o maior");
        }
    }
}