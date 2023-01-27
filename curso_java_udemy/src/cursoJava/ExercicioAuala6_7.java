package cursoJava;

import java.util.Scanner;

public class ExercicioAuala6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double a, b, resultado;

        for (int i = 0; i < n; i++) {
            a = input.nextDouble();
            b = input.nextDouble();
            resultado = a / b;
            if (b == 0.0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(resultado);
            }

        }
    }
}
