package cursoJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioAula8_5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        ExercicioAula8_5_1 conta;
        double deposito;

        System.out.print("Entre com numero da sua conta: ");
        int numeroconta = input.nextInt();
        input.nextLine();
        System.out.print("nomde do titular: ");
        String nome = input.nextLine();
        System.out.print("Deseja fazer um deposito inicial (s/n)? ");
        char resposta = input.next().charAt(0);
        if (resposta == 's') {
            System.out.print("quanto deseja deposita: ");
            deposito = input.nextDouble();
            conta = new ExercicioAula8_5_1(numeroconta, nome, deposito);
        } else {
            conta = new ExercicioAula8_5_1(numeroconta, nome);
        }
        System.out.println(" ");
        System.out.println("status da conta");
        System.out.println(conta);

        System.out.println(" ");

        System.out.print("quanto deseja deposita: ");
        deposito = input.nextDouble();
        conta.deposito(deposito);

        System.out.println(" ");
        System.out.println("status da conta");
        System.out.println(conta);

        System.out.println(" ");

        System.out.print("quanto quer saquar: ");
        double saque = input.nextDouble();
        conta.saqeu(saque);

        System.out.println(" ");
        System.out.println("status da conta");
        System.out.println(conta);

    }
}
