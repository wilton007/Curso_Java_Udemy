package cursoJava;

import java.util.Scanner;

public class exercicioAula5_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h1 = input.nextInt();
        int h2 = input.nextInt();

        Math meth = null;
        if (h1 > h2 ){
            int horatotal = meth.abs(h1 - 24 - h2 );
            System.out.printf("O JOGO DUROU %d HORA(S)",horatotal);
        } else if (h1 < h2){
            int horatotal = meth.abs(h1 - h2 );
            System.out.printf("O JOGO DUROU %d HORA(S)",horatotal);
        } else if ( h1 == 0 && h1 == 0){
            System.out.printf("O JOGO DUROU 24 HORA(S)");
        }
    }
}
