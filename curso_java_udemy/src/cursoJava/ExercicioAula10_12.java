package cursoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioAula10_12 {
    public static void main(String[] args) {
        ExercicioAula10_12_2 funcionario = new ExercicioAula10_12_2();
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos funcionarios vai registrar? ");
        int quantidadeFuncionarios = input.nextInt();
        int contador = 1;
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("Funcionario #" + contador);
            System.out.print("Id: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("salario: ");
            double salario = input.nextDouble();
            System.out.println(" ");
            funcionario.criarFuncionario(id, nome, salario);
        }

        List<ExercicioAula10_12_1> listaFuncionarios = funcionario.funcionario;
        System.out.print("Digite o id de quem vai receber o aumento: ");
        int idAumento = input.nextInt();
        int posicao = 0;
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            if (idAumento == listaFuncionarios.get(i).getId()) {
                posicao = i;
            }
        }


        if (idAumento == listaFuncionarios.get(posicao).getId()) {
            System.out.print("Digite a porcentagem a ser aumentada: ");
            double porcentagem = input.nextDouble();
            for (int i = 0; i < listaFuncionarios.size(); i++) {
                double salarioAntigo = listaFuncionarios.get(posicao).getSalario();
                listaFuncionarios.get(posicao).setSalario((listaFuncionarios.get(posicao).getSalario() * (porcentagem / 100.0)));
                listaFuncionarios.get(posicao).setSalario(listaFuncionarios.get(posicao).getSalario() + salarioAntigo);
            }

        } else {
            System.out.println("Funcionario não existente!");
        }

        System.out.println("Lista de funcionarios:");
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            System.out.println(listaFuncionarios.get(i).getId() + ", " + listaFuncionarios.get(i).getNome() + ", " + listaFuncionarios.get(i).getSalario());
        }
    }
}
