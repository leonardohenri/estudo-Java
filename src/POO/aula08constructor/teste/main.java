package POO.aula08constructor.teste;

import POO.aula08constructor.dominio.Pessoa;

public class main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Leonardo",23,"Brasil","São Paulo","Monte Aprazível");

        pessoa.imprime();
    }
}
