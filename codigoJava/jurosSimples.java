package br.com.harrison.classe;
//juros
import java.util.Scanner;
public class TesteDois {
    Scanner scan = new Scanner(System.in);
    double salrio;
    double valorTotal;

    public void imprimir(){
        System.out.println("Digite o valor do salário: ");
        salrio = scan.nextDouble();
        valorTotal = salrio + (salrio * 0.1);
        System.out.println("O valor digitado é: " + salrio);
        System.out.println("Com o aumento de 10% ficará: " + valorTotal);

    }
}