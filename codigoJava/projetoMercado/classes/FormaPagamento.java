package projetoMercado.classes;

import java.util.Scanner;

public class FormaPagamento extends CalculaValores{
    Scanner scan = new Scanner(System.in);
    Especie especie = new Especie(0);
    DebitoCartao debitoCartao = new DebitoCartao(0);
    CreditoCartao creditoCartao = new CreditoCartao(0);
    int opcao;

    public FormaPagamento(double valor) {
        super(valor);
    }

    public void fPagamento(){
        System.out.println("Qual a forma de pagamento? ");
        System.out.println("(1) em espécie\n(2) cartão débito\n(3) cartão crédito");
        opcao = scan.nextInt();
        if (opcao == 1){
            especie.especieCalc();
        }else if (opcao == 2){
            debitoCartao.debitoCalc();
        }else if (opcao == 3){
            creditoCartao.creditoCalc();
        }else {
            System.out.println("Opção inválida: ");
        }

    }
}
