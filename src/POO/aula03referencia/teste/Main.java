package POO.aula03referencia.teste;

import POO.aula03referencia.dominio.FalarNome;
import POO.aula03referencia.dominio.Pessoa;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Leonardo";

        FalarNome falarNome = new FalarNome();

        falarNome.printarNome(pessoa);

        falarNome.printarNome(pessoa);
    }
}
