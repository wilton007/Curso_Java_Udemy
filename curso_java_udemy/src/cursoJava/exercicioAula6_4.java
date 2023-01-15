package cursoJava;

import java.util.Scanner;

public class exercicioAula6_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if (1 <= x && x <= 100) {
            for (int i = 0; i <= x; i++) {
                int y = i % 2;
                if (y != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

