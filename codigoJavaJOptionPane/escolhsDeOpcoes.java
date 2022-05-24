package br.com.harrison.principal;

import javax.swing.JOptionPane;

public class TesteMain01{

    //Programa de escolha de opções
    public static void main(String[] args) {
        Object [] op = {"Caneta", "Lápis", "Borracha", "Apontador"};
        String resp = (String)JOptionPane.showInputDialog(null, "Selecione o Ítem:\n", "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, op, "Caneta");
        if (resp == null) {
            JOptionPane.showMessageDialog(null, "Opção Cancelada");
        }
        if (resp.equals("Caneta")) {
            JOptionPane.showMessageDialog(null, "Caneta esferográfica: R$ 1,20");
        }
        if (resp.equals("Lápis")) {
            JOptionPane.showMessageDialog(null, "Lápis escolar HB: R$ 0,99");
        }
        if (resp.equals("Borracha")) {
            JOptionPane.showMessageDialog(null, "Borracha escolar: R$ 0,50");
        }
        if (resp.equals("Apontador")) {
            JOptionPane.showMessageDialog(null, "Apontador de acrílico: R$ 0,75");
        }
        System.exit(0);

    }

}