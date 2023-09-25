package basico.aula05;

public class OperadorTernario {
    public static void main(String[] args){
        String result;
        double salario = 4000;
        result = salario >= 5000 ? "doar 500 reais" : "você ainda não tem, essa condição";

        System.out.println(result);
    }
}
