package projetoMercado.classes;

public class DebitoCartao extends FormaPagamento{
    double debito ;
    public DebitoCartao(double valor) {
        super(valor);
    }
    public void debitoCalc(){
        if (valor > 0 && opcao == 2){
            debito = opcao +( opcao * 0.05);
            System.out.println("O valor no débito será: " + debito);
        }else {
            System.out.println("Valor inválido: ");
        }
    }
}
