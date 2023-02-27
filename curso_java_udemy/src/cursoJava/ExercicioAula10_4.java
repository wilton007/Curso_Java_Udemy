package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidadeNumeros = input.nextInt();
        double tabela[] = new double[quantidadeNumeros];


        double valor = 0.0;
        int posicao = 0;
        for (int i = 0; i < tabela.length; i++) {
            System.out.print("Digite um numero: ");
            tabela[i] = input.nextDouble();

            if (tabela[i] > valor) {
                valor = tabela[i];
                posicao = i;
            }
        }
        System.out.print("\nMAIOR VALOR = " + valor);
        System.out.print("\nPOSICAO DO MAIOR VALOR = "+posicao);
    }
}
