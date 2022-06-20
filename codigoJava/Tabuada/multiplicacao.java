package bk.com.harrison.classes;

import java.util.Scanner;

public class ClasseA3 {
    Scanner scan = new Scanner(System.in);
    double numero;
    double cont = 1;

    public void imprimir(){
        System.out.println("Digite um número para a tebuada de multiplicação");
        numero = scan.nextDouble();
        while (cont <= 10 ){
            System.out.println(numero +" X "+ cont +" = "+ (numero * cont));
            cont ++;
        }
    }
}