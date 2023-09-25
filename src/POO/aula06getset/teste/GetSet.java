package POO.aula06getset.teste;

import POO.aula06getset.dominio.Pessoa;

public class GetSet {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();

        pessoa.setIdade(1);
        pessoa.setNome("");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
