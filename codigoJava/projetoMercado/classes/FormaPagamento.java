package projetoMercado.classes;

import java.util.Scanner;

public class FormaPagamento {
    Scanner scan = new Scanner(System.in);
    int opcao;

    public void fPagamento(){
        System.out.println("Qual a forma de pagamento? ");
        System.out.println("(1) em espécie\n(2) cartão débito\n(3) no pix\n(4) cartão crédito");
        opcao = scan.nextInt();

    }
}
