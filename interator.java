package br.com.harrison.classe;
//Utilizando o interator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TesteTres{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // vamos criar uma ArrayList
        ArrayList<String> pessoas = new ArrayList();
        //vamos digitar os nomes pelo número de interações
        for (int i = 0; i < 4; i ++) {
            System.out.println("Digite um nome: ");
            pessoas.add(scan.next());
        }
        // vamos obter um iterador para a lista
        Iterator<String> pessoa = pessoas.iterator();

        // vamos obter o próximo elemento (neste caso, do primeiro ao quarto)
        for (int i = 0; i < 4; i ++) {
            String nome = pessoa.next();
            System.out.println(nome);
        }
    }
}