package cursoJava;

import java.util.Scanner;

public class exercicioAula5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int resultado;

        if (a < b) {
            resultado = b % a;
            if (resultado == 0) {
                System.out.println("SAO MULTIPLOS");
            } else {
                System.out.println("NAO SAO MULTIPLOS");
            }
        } else {
            resultado = a % b;
            if (resultado == 0) {
                System.out.println("SAO MULTIPLOS");
            } else {
                System.out.println("NAO SAO MULTIPLOS");
            }
        }
    }
}
