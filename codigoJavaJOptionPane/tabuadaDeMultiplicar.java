package br.com.harrison.principal;

import javax.swing.JOptionPane;
//Programa com sucessivas respostas de uma ta buada de multiplicar atravéz do console
public class TesteMain01{

    public static void main(String[] args) {
        int n, l = 0;
        String aux;

        try {

            aux = JOptionPane.showInputDialog("entre com um número");
            n = Integer.parseInt(aux);
            while (l <= 10) {
                JOptionPane.showMessageDialog(null, "A resposta será: " + (n + " * " + l + " = " + (n * l)));
                l++;}


            //o programa só funcionou após colocar o catch abaixo
        }catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro na entrada, digite apenas número:" + erro.toString());
        }
        System.exit(0);
    }

}