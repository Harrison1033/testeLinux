package projetoMercado.classes;

import java.util.Scanner;

public class CalculaValores extends Produtos{
    Scanner scan = new Scanner(System.in);
    double item = 0;
    int opcao;
    public CalculaValores( double valor) {
        super( valor);
    }
    public void calcular(){
        //continuara o código
        while (opcao != 3 ){
            System.out.println("Digite o valor do produto: ");
            item = scan.nextDouble();
            valor = valor + item;
            System.out.println("Quer adicionar um produto?\nDigite 3 para finalizar: ");
            opcao = scan.nextInt();
        }
        System.out.println("O valor final é: " + valor);
    }
}
