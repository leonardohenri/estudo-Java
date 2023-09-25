package POO.aula08constructor.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private String pais;
    private String estado;
    private String cidade;
    {
        System.out.println("estou no bloco de inicialização");
    }
    public Pessoa(String nome, int idade, String pais, String estado, String cidade){
        this();
        System.out.println("estou no constructor");
        this.nome = nome;
        this.idade = idade;
        this.pais = pais;
        this.estado = estado;
        this.cidade =cidade;
    }
    public Pessoa(){
        System.out.println("mostrando que o sobrecarga funciona tmb");
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.pais);
        System.out.println(this.estado);
        System.out.println(this.cidade);

    }
}
