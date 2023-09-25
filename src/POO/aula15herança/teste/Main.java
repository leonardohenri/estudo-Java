package POO.aula15herança.teste;

import POO.aula15herança.dominio.Funcionario;
import POO.aula15herança.dominio.Pessoa;

public class Main {
    public static void main (String[] args){
        Pessoa p = new Pessoa("leonardo", 23);
        Funcionario f = new Funcionario("leonardo", 23);


        System.out.println("Pessoa");
        p.imprime();
        System.out.println("_______________");

        f.setSalario(2040.22);
        f.setNome("leonardo");
        f.setIdade(23);

        System.out.println("funcionario");
        f.imprime();
        System.out.println("_______________");

    }
}
