package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidadeVetor = input.nextInt();
        double[] vetor = new double[quantidadeVetor];


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextDouble();
        }

        double somaVetor = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            somaVetor = somaVetor + vetor[i];
        }

        double mediaVetor = somaVetor / quantidadeVetor;
        System.out.println(" ");
        System.out.printf("MEDIA DO VETOR = %.3f", mediaVetor);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < mediaVetor) {
                System.out.println(vetor[i]);
            }
        }
    }
}
