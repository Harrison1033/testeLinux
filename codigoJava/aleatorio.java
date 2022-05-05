//Adivinhar um número aleatório 

package br.com.harrison.classe;

import java.util.Random;
import java.util.Scanner;

public class TesteTres {
    Scanner scan = new Scanner(System.in);
    Random numero = new Random();
    int resp;
    int num;
    int cont = 0;
    int conta;

    public void imprimir(){
        num = numero.nextInt(10);
        System.out.println("Digite um número inteiro:");
        resp = scan.nextInt();
        while ((resp !=  num)){
            if (resp < num){
                System.out.println("Errou, digite um número Maior: >");
            }else {
                System.out.println("Errou, digite um número Menor: <");
            }
            resp = scan.nextInt();
            conta = cont ++;
        }
        System.out.println("Resposte correta Parabéns:");
        System.out.println("Você acertou em " + (conta + 2) + " Tentativas:");
    }
}