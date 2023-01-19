package cursoJava;

import java.util.Scanner;

public class exercicioAula8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        exercicioAula8_3_1 aluno = new exercicioAula8_3_1();

        String nome = input.nextLine();
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();

        double total = aluno.calculo(nota1, nota2, nota3);
        System.out.println(" ");
        aluno.resfinal(total);

    }
}
