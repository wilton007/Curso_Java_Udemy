package cursoJava;

import java.util.Scanner;

public class exercicioAula4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo1 = input.nextInt();
        int quantidade1 = input.nextInt();
        double valor1 = input.nextDouble();

        int codigo2 = input.nextInt();
        int quantidade2 = input.nextInt();
        double valor2 = input.nextDouble();

        double valortotal = (double) (quantidade1*valor1)+(quantidade2*valor2);

        System.out.printf("VALOR A PAGAR = R$ %.2f",valortotal);

    }
}
