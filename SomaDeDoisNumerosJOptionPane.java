package br.com.harrison.classe;
import javax.swing.JOptionPane;
public class TesteDois{

    public static void main(String[]args){

        //declaração das variáveis
        String numeroA, numeroB;
        int numero1, numero2, soma;

        //pede dois números inteiros
        numeroA = JOptionPane.showInputDialog("Entre com o primeiro número inteiro");
        numeroB = JOptionPane.showInputDialog("Entre com o segundo número inteiro");

        //converte os números de string para inteiro
        numero1 = Integer.parseInt(numeroA);
        numero2 = Integer.parseInt(numeroB);

        //efetua a soma dos números
        soma = numero1 + numero2;

        //mostra o resultado da soma para o usuário
        JOptionPane.showMessageDialog(null,"A soma dos números é: " +
                soma,"Resultado",JOptionPane.PLAIN_MESSAGE);
    }
}