package cursoJava;

public class ExercicioAula8_5_1 {

    private final int numeroConta;
    private final String nomeTitular;
    public double allconta;

    public ExercicioAula8_5_1(int numeroconta, String nometitular) {
        this.numeroConta = numeroconta;
        this.nomeTitular = nometitular;

    }

    public ExercicioAula8_5_1(int numeroconta, String nometitular, double allconta) {
        this.numeroConta = numeroconta;
        this.nomeTitular = nometitular;
        deposito(allconta);
    }


    public void deposito(double deposito){
        allconta += deposito;

    }
    public void saqeu(double saque){
        allconta -= saque + 5.00;

    }

    @Override
    public String toString() {
        return
                "Numero da conta: " + numeroConta +"\n"+
                "Nome do titular: " + nomeTitular + "\n" +
                "Saldo: " + allconta;
    }
}
