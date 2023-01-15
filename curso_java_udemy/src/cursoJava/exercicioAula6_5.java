package cursoJava;

import java.util.Scanner;

public class exercicioAula6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int x;
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            x = input.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }

        }
        System.out.printf("%d in\n%d out", in, out);
    }
}
