package us.com.harrison1.classeA;
//sobrecarga de métodos
import java.util.Scanner;

public class ClasseC {
 Scanner scan = new Scanner(System.in);
    int somar (int x, int y){
        return x + y;
    }
    int somar (int x, int y, int z){
        return x + y + z;
    }
    public void imprimir(){
        System.out.println("Digite dois valores");
        int result1 = somar(scan.nextInt(), scan.nextInt());
        System.out.printf("Resultado 1: %d%n",result1);
        System.out.println("Digite três valores");
        int result2 = somar(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.printf("Resultado 2: %d%n",result2);
    }

}