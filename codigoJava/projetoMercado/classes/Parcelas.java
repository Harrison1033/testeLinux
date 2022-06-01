package projetoMercado.classes;

import java.util.Scanner;

public class Parcelas extends CreditoCartao{
    Scanner scan = new Scanner(System.in);
    int parcelas;
    double total;
    public Parcelas(double valor) {
        super(valor);
    }
    public void parcelasCalc(){
        System.out.println("Digite o número de parcelas até 12X ");
        parcelas = scan.nextInt();
        if (parcelas > 0 && parcelas <= 4){
           total = parcelas - (parcelas * 0.1);
        }else if (parcelas > 4 && parcelas <= 8){
            total = parcelas - (parcelas * 0.05);
        }else if (parcelas > 8 && parcelas <= 12){
            total = parcelas + (parcelas * 0.05 );
        }else {
            System.out.println("Permitido só até 12 Parcelas: ");
        }
    }
}
