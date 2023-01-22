package cursoJava;

import java.util.Scanner;

public class exercicioAula8_4 {
    public static void main(String[] args) {
        exercicioAula8_4_1 calculo = new exercicioAula8_4_1();
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o valor do dollar? ");
        double valordollar = input.nextDouble();
        System.out.print("Quantos dolares vai precisar? ");
        double quantdollar = input.nextDouble();
        System.out.printf("o valor a pagar em reais = %.2f",calculo.converte(valordollar,quantdollar));
    }
}
