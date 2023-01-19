package cursoJava;

import java.util.Scanner;

public class exercicioAula8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        double b,c,d;

        exercicioAula8_2_1 funcionario = new exercicioAula8_2_1();

        System.out.print("Nome: ");
        a = input.nextLine();

        System.out.print("Salario bruto: ");
        b = input.nextDouble();

        System.out.print("Taxa de desconto: ");
        c = input.nextDouble();

        System.out.println(" ");

        funcionario.status(a,b,c);

        System.out.println(" ");

        System.out.print("Qual porcentagem de acrescimo no salario: ");
        d = input.nextDouble();

        System.out.println(" ");

        funcionario.calculo(a,b,d,c);


    }
}
