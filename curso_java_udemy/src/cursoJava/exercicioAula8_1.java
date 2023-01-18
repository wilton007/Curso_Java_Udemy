package cursoJava;

import java.util.Scanner;

public class exercicioAula8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        exercicioAula8_1_1 retangulo = new exercicioAula8_1_1();

        System.out.println("Enter rectangle width and height:");
        retangulo.width = input.nextDouble();
        retangulo.height = input.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());


    }
}
