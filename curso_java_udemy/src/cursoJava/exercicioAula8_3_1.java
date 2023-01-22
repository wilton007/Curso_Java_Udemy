package cursoJava;

public class exercicioAula8_3_1 {

    public double calculo(double a, double b, double c){
        double total = a + b + c;
        return total;
    }
    public void resfinal(double total){
        if (total >= 60.00){
            System.out.printf("Nota Final: %.2f%nPassou",total);
        }else {
            double total1 = 60 - total;
            System.out.printf("Nota Final: %.2f%nReprovodo%nfaltam %.2f pontos",total,total1);

        }
    }
}
