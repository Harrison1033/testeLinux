ipackage br.com.harrison.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteMain01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Digite o valor do raio: ");
        double r = scan.nextDouble();
        double pi = 3.14159;
        double volume = ((4/3.0)* pi * Math.pow(r,3) );
        System.out.println("VOLUME = " + df.format(volume) );