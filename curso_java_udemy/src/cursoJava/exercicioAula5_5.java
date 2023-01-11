package cursoJava;

import java.util.Scanner;

public class exercicioAula5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" CODIGO     ESPECIFICAÇÃO        PREÇO ");
        System.out.println("=======================================");
        System.out.println(" 1         Cachorro Quente      R$4.00 ");
        System.out.println(" 2         X-Salada             R$4.50 ");
        System.out.println(" 3         X-Bacon              R$5.00 ");
        System.out.println(" 4         Torrada Simples      R$2.00 ");
        System.out.println(" 5         Refrigerante         R$1.50 ");
        System.out.println("=======================================");

        int codigo1 = input.nextInt();
        int quantidade = input.nextInt();
        double total = 0.0;

        if (codigo1 == 1){
            total = quantidade * 4.0;
        } else if ( codigo1 == 2){
            total = quantidade * 4.50;
        } else if(codigo1 == 3) {
            total = quantidade * 5.00;
        } else if (codigo1 == 4){
            total = quantidade * 2.00;
        } else if (codigo1 == 5){
            total = quantidade * 1.50;
        } else {
            System.out.println(" codigo não exitente");
        }

        System.out.printf("total: R$ %.2f",total);
    }
}
