package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos Quartos vai ser reservado? ");
        int quantidadeQuartos = input.nextInt();
        ExercicioAula10_11_1[] informacaoCliente = new ExercicioAula10_11_1[9];

        int contador = 1;
        int numeroQuarto = 0;
        for (int i = 0; i < quantidadeQuartos; i++) {
            System.out.println("Cliente #" + contador);
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Quarto: ");
            numeroQuarto = input.nextInt();
            informacaoCliente[numeroQuarto] = new ExercicioAula10_11_1(nome, email, numeroQuarto);
            System.out.println(" ");
            contador++;
        }
        System.out.println("Informaçoes dos Quartos:");
        for (int i = 0; i < informacaoCliente.length; i++) {
            if (informacaoCliente[i] != null) {
                System.out.println(informacaoCliente[i].getNumeroQuarto() + ": " + informacaoCliente[i].getNome() + ", " + informacaoCliente[i].getEmail());
            }
        }

    }
}
