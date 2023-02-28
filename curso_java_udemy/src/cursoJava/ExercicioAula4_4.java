package cursoJava;

import java.util.Scanner;

public class ExercicioAula4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroFuncionario = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double salarioHoras = input.nextDouble();
        double salarioTotal = (double) horasTrabalhadas * salarioHoras;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", numeroFuncionario, salarioTotal);
    }
}
