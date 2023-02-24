package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeNumeros;
        double soma = 0.0;


        System.out.print("Quantos numeros voce vai digitar? ");
        quantidadeNumeros = input.nextInt();
        double tabela[] = new double[quantidadeNumeros];
        for (int i = 0; i < tabela.length; i++) {
            System.out.print("Digite um numero: ");
            tabela[i] = input.nextDouble();
        }
        for (int i = 0; i < tabela.length; i++) {
            soma = soma + tabela[i];
        }
        double total = soma / quantidadeNumeros;
        System.out.println(" ");
        System.out.print("VALORES = ");
        for (int i = 0; i < tabela.length; i++) {
            System.out.print(" " + tabela[i] + "  ");
        }
        System.out.println("\nSOMA = " + soma);
        System.out.println("MEDIA = " + total);

    }
}

