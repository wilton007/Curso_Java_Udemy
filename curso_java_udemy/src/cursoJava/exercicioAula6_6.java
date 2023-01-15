package cursoJava;

import java.io.PrintStream;
import java.util.Scanner;

public class exercicioAula6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double x1, x2, x3, soma;


        for (int i = 0; i < n; i++) {
            x1 = input.nextDouble();
            x2 = input.nextDouble();
            x3 = input.nextDouble();

            soma = ((x1 * 2) + (x2 * 3) + (x3 * 5)) / (2 + 3 + 5);
            System.out.printf("%.1f", soma);
        }
    }

}

