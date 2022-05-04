package br.com.harrison.classe;
//parImpar
import java.util.Scanner;
public class TesteDois {
    Scanner scan = new Scanner(System.in);
    
    public void imprimir(){
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        if (numero % 2 == 0){
            System.out.println("O número: " + numero + " é par");
        }else {
            System.out.println("O número: " + numero + " é Ímpar");
        }

    }
}