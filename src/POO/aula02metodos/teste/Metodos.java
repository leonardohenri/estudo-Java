package POO.aula02metodos.teste;

import POO.aula02metodos.dominio.Calculadora;

public class Metodos {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        double var1 = 10.23;
        double var2 = 20.5;
        double result  = calculadora.soma(var1,var2);

        double result1 = calculadora.divicao(10,20);

        System.out.println(result);
        System.out.println(result1);

    }
}
