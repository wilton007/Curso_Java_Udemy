package cursoJava;

import java.util.Scanner;

public class ExercicioAula4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int total = x + y;
        System.out.println("SOMA = "+total);
    }
}
