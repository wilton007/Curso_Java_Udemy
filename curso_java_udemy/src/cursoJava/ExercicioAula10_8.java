package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int quantidadePessoas = input.nextInt();
        String[] vetorPessoas = new String[quantidadePessoas];
        int[] vetorIdade = new int[quantidadePessoas];
        int contador = 1;

        for (int i = 0; i < quantidadePessoas; i++) {
            input.nextLine();
            System.out.println("Dados da " + contador + "a pessoa: ");
            System.out.print("Nome: ");
            vetorPessoas[i] = input.nextLine();
            System.out.print("Idade: ");
            vetorIdade[i] = input.nextInt();
            contador++;
        }
        int maiorIdade = 0;
        String nomeMaiorIdade = null;
        for (int i = 0; i < vetorIdade.length; i++) {
            if (vetorIdade[i] > maiorIdade) {
                maiorIdade = vetorIdade[i];
                nomeMaiorIdade = vetorPessoas[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nomeMaiorIdade);
    }
}
