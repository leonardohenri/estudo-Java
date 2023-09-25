package POO.aula01.teste;

import POO.aula01.dominio.Pessoa;

public class TestePessoa {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        pessoa.idade =13;
        pessoa.nome = "Carlos Eduardo";
        pessoa.sexo = 'M';
        pessoa2.idade =26;
        pessoa2.nome = "Leonardo Silva";
        pessoa2.sexo = 'M';

        System.out.println("pessoa1");
        System.out.println("Nome: "+pessoa.nome);
        System.out.println("idade: "+pessoa.idade);
        System.out.println("sexo: "+pessoa.sexo);

        System.out.println("pessoa2");
        System.out.println("Nome: "+pessoa2.nome);
        System.out.println("idade: "+pessoa2.idade);
        System.out.println("sexo: "+pessoa2.sexo);
    }
}
