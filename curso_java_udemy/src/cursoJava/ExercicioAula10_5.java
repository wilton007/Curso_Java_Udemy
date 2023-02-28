package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos Valores vai ter cada vetor? ");
        int quantidade = input.nextInt();

        int[] tabelaA = new int[quantidade];
        int[] tabelaB = new int[quantidade];
        int[] tabelaC = new int[quantidade];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < tabelaA.length; i++) {
            tabelaA[i] = input.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < tabelaB.length; i++) {
            tabelaB[i] = input.nextInt();
        }

        System.out.println("VETOR RESULTANTE : ");
        for (int i = 0; i < tabelaC.length; i++) {
            tabelaC[i] = tabelaA[i] + tabelaB[i];
            System.out.println(tabelaC[i]);
        }
    }
}
