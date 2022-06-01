package projetoMercado.classes;

public class Especie extends FormaPagamento {
    double especie;

    public Especie(double valor) {
        super(valor);
    }

    public void especieCalc(){
    if (valor > 0 && opcao == 1){
        especie = valor + (valor * 0.1);
        System.out.println("O valor final é: " + especie);
    }else {
        System.out.println("Vaolor inválido: ");
    }
}
}
