package projetoMercado.classes;

public class CreditoCartao extends FormaPagamento {
    Parcelas parcelas = new Parcelas(0);


    public CreditoCartao(double valor) {
        super(valor);
    }
    public void creditoCalc(){
        if (valor > 0 && opcao == 3){
            parcelas.parcelasCalc();
        }
    }
}
