package cursoJava;

import java.util.Scanner;

public class ExercicioAula4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raiz = 3.14159;
        double raio = input.nextDouble();
        double area = raiz * (raio*raio);
        System.out.printf("A = %.4f", area);
    }
}
