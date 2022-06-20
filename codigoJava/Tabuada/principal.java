package bk.com.harrison.principal;

import bk.com.harrison.classes.ClasseA1;
import bk.com.harrison.classes.ClasseA2;
import bk.com.harrison.classes.ClasseA3;
import bk.com.harrison.classes.ClasseA4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ClasseA1 classeA1 = new ClasseA1();
        ClasseA2 classeA2 = new ClasseA2();
        ClasseA3 classeA3 = new ClasseA3();
        ClasseA4 classeA4 = new ClasseA4();
        int opc;
        System.out.println("Digite a operação desejada: \n(1) Soma\n(2) Subtração\n(3) Multiplicação\n(4) Divisão");
        opc = scan.nextInt();
        if (opc == 1){
            classeA1.imprimir();
        }else if (opc == 2){
            classeA2.imprimir();
        }else if (opc == 3){
            classeA3.imprimir();
        }else if (opc == 4){
            classeA4.imprimir();
        }else {
            System.out.println("Opção inválida: ");
        }
    }
}