package br.com.harrison.classe;
//tabuada
import java.util.Scanner;
public class TesteDois {
    Scanner scan = new Scanner(System.in);
    int numero;
   
    public void imprimir(){
        System.out.println("Digite um número para multiplicar: ");
        numero = scan.nextInt();
        for (int i = 0; i < 10; i ++){
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}