package cursoJava;

import java.util.Scanner;

public class ExercicioAula4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int total = a * b - c * d;

        System.out.println("DIFERENCA = "+total);
    }
}
