package cursoJava;

import java.util.Scanner;

public class exercicioAula6_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int resultado;

        for (int i = 1; i <= n; i++) {
            resultado = n % i;
            if (resultado == 0) {
                System.out.println(i);
            }
        }
    }
}
