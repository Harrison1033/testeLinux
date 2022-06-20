package bk.com.harrison.classes;

import java.util.Scanner;

public class ClasseA1 {
    Scanner scan = new Scanner(System.in);
    double numero;
    double cont = 0;

    public void imprimir(){
        System.out.println("Digite um número para Tabuada de somar: ");
        numero = scan.nextDouble();
        while (cont <= 10){
            System.out.println(numero +" + "+ cont +" = "+ (numero + cont));
            cont ++;
        }

    }
}