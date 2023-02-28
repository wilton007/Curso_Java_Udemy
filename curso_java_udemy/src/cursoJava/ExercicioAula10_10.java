package cursoJava;

import java.util.Scanner;

public class ExercicioAula10_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidadePessoas = input.nextInt();
        String[] masculiFeminino = new String[quantidadePessoas];
        double[] altura = new double[quantidadePessoas];

        int contador = 1;
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Altura da " + contador + "a pessoa: ");
            altura[i] = input.nextDouble();
            input.nextLine();
            System.out.print("Genero da " + contador + "a pessoa: ");
            masculiFeminino[i] = input.nextLine();
            contador++;
        }
        double menorAltura = 100;
        for (int i = 0; i < altura.length; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        System.out.println("Menor Altura = " + menorAltura);

        double maiorAltura = 0.0;
        for (int i = 0; i < altura.length; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }
        System.out.println("Maior altura = " + maiorAltura);

        double somaAlturaFeminina = 0.0;
        int contadorAlturaFeminina = 0;
        int quantidadeHomens = 0;
        for (int i = 0; i < altura.length; i++) {
            if (masculiFeminino[i].equals("f")) {
                somaAlturaFeminina = somaAlturaFeminina + altura[i];
                contadorAlturaFeminina++;
            } else {
                quantidadeHomens++;
            }

        }

        double mediaAlturaFeminina = somaAlturaFeminina / contadorAlturaFeminina;
        if (contadorAlturaFeminina == 0) {
            System.out.println("Não há mulheres nessa lisata");
        } else {
            System.out.printf("Media das alturas da Mulheres = %.2f\n", mediaAlturaFeminina);
        }

        System.out.println("Numero de homens = " + quantidadeHomens);
    }
}
