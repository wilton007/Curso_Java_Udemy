package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas linhas: ");
        int n = input.nextInt();
        System.out.print("Quantas colunas: ");
        int m = input.nextInt();

        int[][] matrizTeste = new int[n][m];
        System.out.println("Digite o valores: ");
        for (int i = 0; i < matrizTeste.length; i++) {
            for (int j = 0; j < matrizTeste[i].length; j++) {
                matrizTeste[i][j] = input.nextInt();
            }
        }
        System.out.print("Qual numero para obter detalhes: ");
        int numeroDetalhes = input.nextInt();

        for (int j = 0; j < matrizTeste.length; j++) {
            for (int k = 0; k < matrizTeste[j].length; k++) {
                if (matrizTeste[j][k] == numeroDetalhes) {
                    System.out.println("posisão: " + j + "," + k);

                    if (k - 1 >= 0) {
                        System.out.println("esquerda: " + matrizTeste[j][k - 1]);
                    }
                    if (k + 1 < matrizTeste[j].length) {
                        System.out.println("direita: " + matrizTeste[j][k + 1]);
                    }
                    if (j - 1 >= 0) {
                        System.out.println("acima: " + matrizTeste[j - 1][k]);
                    }
                    if (j + 1 < matrizTeste.length) {
                        System.out.println("abaixo: " + matrizTeste[j + 1][k]);
                    }
                    System.out.println(" ");
                }
            }
        }
    }
}

