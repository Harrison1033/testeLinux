package br.com.harrison.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteMain01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000" );
        System.out.println("Digite o valor A:");
        double a = scan.nextDouble();
        System.out.println("Digite o valor B:");
        double b = scan.nextDouble();
        System.out.println("Digite o valor C:");
        double c = scan.nextDouble();
        double tri = (a * c)/2;
        double cir = 3.14159 * Math.pow(c,2);
        double tra = ((a + b)* c)/2;
        double qua = b * b;
        double ret = a * b;
        System.out.println("TRIANGULO: " + df.format(tri) );
        System.out.println("CIRCULO: " + df.format(cir) );
        System.out.println("TRAPEZIO: " + df.format(tra) );
        System.out.println("QUADRADO: " + df.format(qua));
        System.out.println("RETANGULO: "+ df.format(ret));

    }
}
