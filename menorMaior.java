package br.com.harrison.classe;

import java.util.Scanner;

public class TesteQuatro {
    public static void main(String[] args) {
        final int NUMEROS_A_LER;
        Scanner scan = new Scanner(System.in);
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        System.out.println("Digite o número de valores a serem digitados");
        NUMEROS_A_LER = scan.nextInt();

        for (int i = 0; i < NUMEROS_A_LER; i++) {
            System.out.println("Entre com o proximo inteiro: ");
            int num = scan.nextInt();
            if (num < minimo) {
                minimo = num;
            }
            if (num > maximo) {
                maximo = num;
            }
        }

        System.out.println("O menor numero é: " + minimo);
        System.out.println("O maior numero é: " + maximo);
    }
}