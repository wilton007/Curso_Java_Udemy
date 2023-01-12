package cursoJava;

import java.util.Scanner;

public class exercicioAula6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int disel = 0;
        int x = 0;

        while (x != 4) {
            x = input.nextInt();

            switch (x) {
                case 1:
                    alcool = alcool + 1;
                    break;
                case 2:
                    gasolina = gasolina + 1;
                    break;
                case 3:
                    disel = disel + 1;
                    break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Disel: " + disel);
    }
}
