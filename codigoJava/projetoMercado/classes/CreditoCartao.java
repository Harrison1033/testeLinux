package projetoMercado.classes;

public class CreditoCartao extends FormaPagamento {
    double credito;

    public CreditoCartao(double valor) {
        super(valor);
    }
    public void creditoCalc(){
        if (valor > 0 && opcao == 3){
            credito = valor + (valor * 0.08 );
            System.out.println("O valor no crédito será: " + credito);
        }
    }
}
