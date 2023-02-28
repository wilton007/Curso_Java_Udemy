package cursoJava;

import java.util.Scanner;

public class ExercicioAula4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantidade coxinha: ");
        int quantidade1 = input.nextInt();
        System.out.print("Digite valor coxinha: ");
        double valor1 = input.nextDouble();

        System.out.print("Digite quantidade suco: ");
        int quantidade2 = input.nextInt();
        System.out.print("Digite valor suco: ");
        double valor2 = input.nextDouble();

        double valortotal = (quantidade1*valor1) +(quantidade2*valor2);

        System.out.printf("VALOR A PAGAR = R$ %.2f",valortotal);

    }
}
