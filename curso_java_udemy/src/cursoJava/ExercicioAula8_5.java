package cursoJava;

import java.util.Scanner;

public class ExercicioAula8_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ExercicioAula8_5_1 conta = new ExercicioAula8_5_1();

        System.out.print("Entre com numero da sua conta: ");
        int numeroconta = input.nextInt();
        conta.setNumeroconta(numeroconta);
        input.nextLine();
        System.out.print("Nome do titular: ");
        String nome = input.nextLine();
        conta.nometitular = nome;
        conta.operacao();
        conta.operacao2();
        conta.operacao3();
    }
}
