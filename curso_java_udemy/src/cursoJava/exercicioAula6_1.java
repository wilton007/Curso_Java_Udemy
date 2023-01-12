package cursoJava;

import java.util.Scanner;

public class exercicioAula6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        while (x != 2002){
            System.out.println("Senha Invalida");
            x = input.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
