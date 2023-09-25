package POO.aula05varargs.teste;

import POO.aula05varargs.dominio.Calculadora;

public class Main {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        double[] numeros = {2.2, 4.6, 20.23};

        calculadora.somaArray(numeros);
        System.out.println("agora o somaVarArgs");
        calculadora.somaVarArgs(numeros);
        System.out.println("chamando somaArray sem declarar na variavel");
        calculadora.somaArray(new double[] {10,20,30,40});
        System.out.println("chamando somaVarArgs sem declarar na variavel");
        calculadora.somaVarArgs(10,20,30,40,50 );
        System.out.println("chamando somaArrayDois que recebe dois parametro o array de numeros e o menos");
        calculadora.somaArrayDois(numeros, 10);
        System.out.println("chamando somaVarArgsDois que recebe dois parametro o menos pq precisa ser antes do var args e o array de numeros");
        calculadora.somaVarArgsDois(10,20,30,40,50 );


    }
}
