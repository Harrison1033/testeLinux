package bk.com.harrison.classes;

import java.util.Scanner;

public class ClasseA2 {
    Scanner scan = new Scanner(System.in);
    double numero;
    double cont = 0;

    public void imprimir(){
        System.out.println("Digite um número para a tabuada de Subtração: ");
        numero = scan.nextDouble();
        while (cont <= 10){
            System.out.println(numero +" - "+ cont +" = "+ (numero - cont));
            cont ++;
        }
    }
}