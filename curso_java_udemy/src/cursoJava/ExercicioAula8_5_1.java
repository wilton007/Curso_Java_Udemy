package cursoJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioAula8_5_1 {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    private int numeroconta;
    public String nometitular;
    public double allconta;


    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public double operacao() {
        System.out.print("Deseja fazer um deposito agora (s/n)? ");
        String sn = input.next();
        double totalconta = 0.0;

        if (sn.equals("s")) {
            System.out.print("Quanto quer depositar: ");
            double valordeposito = input.nextDouble();
            totalconta = totalconta + valordeposito;
            System.out.println(" ");
            System.out.println("dados da conta\nconta " + numeroconta + ", nome do titular: " + nometitular + ", saldo: $ " + df.format(totalconta));

        } else {
            System.out.println(" ");
            System.out.println("dados da conta\nconta " + numeroconta + ", nome do titular: " + nometitular + ", saldo: $ " + df.format(totalconta));
        }
        allconta = totalconta;
        return totalconta;

    }

    public double operacao2() {
        System.out.println(" ");
        System.out.print("quanto quer depositar: ");
        double valordeposito = input.nextDouble();
        allconta = allconta + valordeposito;
        System.out.println("dados da conta\nconta " + numeroconta + ", nome do titular: " + nometitular + ", saldo: $ " + df.format(allconta));
        return allconta;
    }

    public double operacao3() {
        System.out.println(" ");
        System.out.print("quanto quer sacar: ");
        double valorsaque = input.nextDouble();
        allconta = allconta - valorsaque - 5.00;
        System.out.println("dados da conta\nconta " + numeroconta + ", nome do titular: " + nometitular + ", saldo: $ " + df.format(allconta));
        return allconta;
    }


}
