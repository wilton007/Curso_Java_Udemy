package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeNumeros;


        System.out.print("Quantos numeros voce vai digitar? ");
        quantidadeNumeros = input.nextInt();
        int tabela[] = new int[quantidadeNumeros];
        for (int i = 0; i < tabela.length; i++) {
            System.out.print("Digite um numero: ");
            tabela[i] = input.nextInt();
        }
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] < 0) {
                System.out.println(tabela[i]);
            }
        }
    }
}
