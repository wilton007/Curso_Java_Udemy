package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_3 {
    public static void main(String[] args) {
        int contador = 1;
        Scanner input = new Scanner(System.in);


        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidadePessoas = input.nextInt();
        ExercicioAula10_3_1[] tabela = new ExercicioAula10_3_1[quantidadePessoas];

        input.nextLine();
        for (int i = 0; i < tabela.length; i++) {
            System.out.println("Dados da " + contador + "a pessoa:");
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            tabela[i] = new ExercicioAula10_3_1(nome, idade, altura);
            input.nextLine();
            contador++;
        }
        System.out.println(" ");
        double somaAltura = 0.0;

        for (int i = 0; i < tabela.length; i++) {
            somaAltura = somaAltura + tabela[i].getAltura();
        }
        double mediaAltura = somaAltura / quantidadePessoas;

        System.out.printf("Altura Média: %.2f", mediaAltura, "\n");

        int somaIdade = 0;
        int quantosMenores = 0;
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i].getIdade() < 16) {
                somaIdade = somaIdade + tabela[i].getIdade();
                quantosMenores = quantosMenores + 1;

            }
        }
        double porcentagemMenor16 = ((double) quantosMenores / quantidadePessoas) * 100;
        System.out.print("\nPessoas com menos de 16 anos: " + porcentagemMenor16 + "%\n");

        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i].getIdade() < 16) {
                System.out.println(tabela[i].getNome());
            }
        }
    }
}
