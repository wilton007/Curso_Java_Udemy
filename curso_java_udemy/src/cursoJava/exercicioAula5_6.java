package cursoJava;

import java.util.Scanner;

public class exercicioAula5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        if (x >= 0 && x <= 25){
            System.out.println("intervalo [0,25]");
        } else if (x >= 25.01 && x <= 50 ){
            System.out.println("intervalo (25,50]");
        } else if (x >= 50.01 && x <= 75){
            System.out.println("intervalo (50,75]");
        } else if (x >= 75.01 && x <= 100){
            System.out.println("intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
