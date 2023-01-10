package cursoJava;

import java.util.Scanner;

public class exercicoAula5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        if (x % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
