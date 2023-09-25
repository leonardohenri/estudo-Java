package POO.aula05varargs.dominio;

public class Calculadora {
    public void somaArray(double[] numeros){
        double soma = 0;
        for (double num: numeros) {
            soma += num;
        }
        System.out.println(soma);

    }
    public void somaVarArgs(double... numeros){
        double soma = 0;
        for (double num: numeros) {
            soma += num;
        }
        System.out.println(soma);

    }
    public void somaArrayDois(double[] numeros, double menos){
        double soma = 0;
        for (double num: numeros) {
            soma += num;
        }
        soma -= menos;
        System.out.println(soma);

    }
    public void somaVarArgsDois(double menos, double... numeros){
        double soma = 0;
        for (double num: numeros) {
            soma += num;
        }
        soma -= menos;
        System.out.println(soma);

    }
}
