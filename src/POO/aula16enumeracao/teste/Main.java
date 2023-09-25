package POO.aula16enumeracao.teste;

import POO.aula16enumeracao.dominio.Pessoa;
import POO.aula16enumeracao.dominio.TipoCliente;

public class Main {
    public static void main (String[] args){
        Pessoa pessoa = new Pessoa("leonardo", TipoCliente.Fisica);

        System.out.println(pessoa.imprime());
        System.out.println(pessoa);
    }
}
