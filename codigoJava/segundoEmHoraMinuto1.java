package br.com.harrison.principal;

import java.util.Scanner;
//convertendo segundos em horas minutos e segundos
public class TesteMain01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tenpo em segundos:");
        int segundos = scan.nextInt();

        int qtdHoras = segundos / 3600;
        segundos %= 3600;
        int qtdMinutos = segundos / 60;
        segundos %= 60;
        int qtdSegundos = segundos;

        System.out.printf("%d:%d:%d%n", qtdHoras, qtdMinutos, qtdSegundos);

    }
}