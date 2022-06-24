package bk.com.harrison.principal;
import java.util.Scanner;

public class PrincipalTeste {
    public static void main(String[] args) {
        //Arrays de tamanho n que imprime tudo no final
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite o número de nomes: ");
        num = Integer.parseInt(scan.nextLine());//Só deu certo com o Integer.parseInt
        String[] nome = new String[num];
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome");
            nome[i] = scan.nextLine();
        }
        for (String s : nome) {
            System.out.println("Nome: " + s);
        }
    }
}