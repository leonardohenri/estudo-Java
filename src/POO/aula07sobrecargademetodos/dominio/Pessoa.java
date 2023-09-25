package POO.aula07sobrecargademetodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private long numero;

    public void init(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void init(String nome, int idade, long numero){
        init(nome, idade);
        this.numero = numero;
    }

    public void imprime(){
        System.out.print(" nome: "+this.nome+"\n idade: "+this.idade+"\n numero: "+this.numero);
    }
}
