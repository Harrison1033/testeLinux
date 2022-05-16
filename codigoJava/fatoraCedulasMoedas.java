package br.com.harrison.principal;

import java.util.Scanner;
//Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule
// o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50,
// 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
// necessárias.
//   Entrada
//   O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
//   Saída
//   Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dinheiro = scan.nextDouble();
        int arredondar;
        System.out.println("NOTAS:" );
        arredondar = (int)dinheiro/100;
        System.out.printf("%d nota(s) de R$ 100.00%n",arredondar);
        dinheiro %=  100;

        arredondar = (int)dinheiro/50;
        System.out.printf("%d nota(s) de R$ 50.00%n",arredondar);
        dinheiro %=  50;

        arredondar = (int)dinheiro/20;
        System.out.printf("%d nota(s) de R$ 20.00%n",arredondar);
        dinheiro %=  20;

        arredondar = (int)dinheiro/10;
        System.out.printf("%d nota(s) de R$ 10.00%n",arredondar);
        dinheiro %=  10;

        arredondar = (int)dinheiro/5;
        System.out.printf("%d nota(s) de R$ 5.00%n",arredondar);
        dinheiro %=  5;

        arredondar = (int)dinheiro/2;
        System.out.printf("%d nota(s) de R$ 2.00%n",arredondar);
        dinheiro %=  2;

        dinheiro = dinheiro * 100.0; //multipliqueir por 100 para nao trabalhar com casas decimais que no caso achei muito complicado
        System.out.println("MOEDAS:");
        arredondar = (int) (dinheiro / 100);
        System.out.printf("%d moeda(s) de R$ 1.00%n",arredondar);
        dinheiro %=  100;

        arredondar = (int) (dinheiro/50);
        System.out.printf("%d moeda(s) de R$ 0.50%n",arredondar);
        dinheiro %=  50;

        arredondar = (int) (dinheiro/25);
        System.out.printf("%d moeda(s) de R$ 0.25%n",arredondar);
        dinheiro %=  25;

        arredondar = (int) (dinheiro/10);
        System.out.printf("%d moeda(s) de R$ 0.10%n",arredondar);
        dinheiro %=  10;

        arredondar = (int) (dinheiro/5);
        System.out.printf("%d moeda(s) de R$ 0.05%n",arredondar);
        dinheiro %=  5;

        arredondar = (int) (dinheiro);
        System.out.printf("%d moeda(s) de R$ 0.01%n", arredondar) ;

    }
}