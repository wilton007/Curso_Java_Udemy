package cursoJava;

import java.io.PrintStream;
import java.util.Scanner;

public class exercicioAula6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double x1, x2, x3, soma;
        double soma1 = 0.0;
        double soma2 = 0.0;
        double soma3 = 0.0;


        for (int i = 0; i < n; i++) {
            x1 = input.nextDouble();
            x2 = input.nextDouble();
            x3 = input.nextDouble();

            soma = ((x1 * 2) + (x2 * 3) + (x3 * 5)) / (2 + 3 + 5);
            if (i == 0) {
                soma1 = soma;
            } else if (i == 1) {
                soma2 = soma;
            } else {
                soma3 = soma;
            }
        }
        PrintStream printf = System.out.printf("%.1f\n%.1f\n%.1f", soma1, soma2, soma3);
    }
}
