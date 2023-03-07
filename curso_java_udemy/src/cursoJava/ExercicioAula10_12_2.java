package cursoJava;

import java.util.ArrayList;
import java.util.List;

public class ExercicioAula10_12_2 {
    List<ExercicioAula10_12_1> funcionario = new ArrayList<>();

    public void criarFuncionario(int id, String nome, double salario){
        ExercicioAula10_12_1 funcionariBase = new ExercicioAula10_12_1(id,nome,salario);
        funcionario.add(funcionariBase);
    }
}
