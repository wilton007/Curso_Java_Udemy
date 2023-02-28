package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidadeVetor = input.nextInt();
        int[] vetor = new int[quantidadeVetor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextInt();
        }
        int somaPares = 0;
        int quantidadePares = 0;
        for (int i = 0; i < vetor.length; i++) {
            int par = vetor[i] % 2;
            if (par == 0) {
                somaPares = somaPares + vetor[i];
                quantidadePares++;
            }
        }
        if (somaPares > 0) {
            double mediaPares = (double) somaPares / quantidadePares;
            System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}