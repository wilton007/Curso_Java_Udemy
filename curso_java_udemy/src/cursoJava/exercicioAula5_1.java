package cursoJava;

import java.util.Scanner;

public class exercicioAula5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        if (x < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
    }
}
