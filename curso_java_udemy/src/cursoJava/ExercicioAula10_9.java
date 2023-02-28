package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int quantidadeAlunos = input.nextInt();
        String[] vetorAlunos = new String[quantidadeAlunos];
        double[] vetorNota1 = new double[quantidadeAlunos];
        double[] vetorNota2 = new double[quantidadeAlunos];

        int contador = 1;

        for (int i = 0; i < quantidadeAlunos; i++) {
            input.nextLine();
            System.out.println("Digite nome, primeira e sugunda nota do " + contador + "o aluno:");
            vetorAlunos[i] = input.nextLine();
            vetorNota1[i] = input.nextDouble();
            vetorNota2[i] = input.nextDouble();
            contador++;
        }
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            double total = (vetorNota1[i] + vetorNota2[i]) / 2;
            if (total >= 6.0) {
                System.out.println(vetorAlunos[i]);
            }
        }
    }
}
