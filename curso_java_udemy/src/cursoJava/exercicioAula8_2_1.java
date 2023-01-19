package cursoJava;

public class exercicioAula8_2_1 {


    public void status(String nome, double salariobruto, double taxaporcentagem){
        System.out.printf("Funcionario: %s, $ %.2f%n",nome,salariobruto-taxaporcentagem);
    }
    public void calculo(String nome, double salariobruto, double porcentagem, double taxaporcentagem){
        double total = (porcentagem / 100)*salariobruto + (salariobruto - taxaporcentagem);
        System.out.printf("Salario Atualizado: %s, $ %.2f",nome,total);
    }



}
