package br.com.harrison.classe;
//Antecessor e sucessor

import java.util.Scanner;

public class TesteDois {
    Scanner scan = new Scanner(System.in);
    int numero;
    int antecessor;
    int sucessor;

    public void imprimir(){
        System.out.println("Digite um número: ");
        numero = scan.nextInt();
        antecessor = numero - 1;
        sucessor = numero + 1;
        System.out.println("O número é: " + numero + "\nO antecessor é: " + antecessor + "\nO sucessor é: " + sucessor);

    }

}