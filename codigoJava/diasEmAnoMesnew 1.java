package br.com.harrison.principal;

import java.util.Scanner;
//convertendo dias em anos, meses e dias
public class TesteMain01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a idade em dias:");
        int dia = scan.nextInt();
        int ano = dia / 365;
        dia %= 365;
        int mes = dia / 30;
        dia %= 30;
        int dias = dia;

        System.out.println(ano + " Ano(s)\n" + mes + " Mes(es)\n" + dias + " Dia(s)");

    }
}