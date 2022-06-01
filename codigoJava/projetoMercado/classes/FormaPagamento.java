package projetoMercado.classes;

import java.util.Scanner;

public class FormaPagamento extends CalculaValores{
    Scanner scan = new Scanner(System.in);
    Especie especie = new Especie(0);
    int opcao;

    public FormaPagamento(double valor) {
        super(valor);
    }

    public void fPagamento(){
        System.out.println("Qual a forma de pagamento? ");
        System.out.println("(1) em espécie\n(2) cartão débito\n(3) no pix\n(4) cartão crédito");
        opcao = scan.nextInt();
        if (opcao == 1){
            especie.fPagamento();
        }

    }
}
