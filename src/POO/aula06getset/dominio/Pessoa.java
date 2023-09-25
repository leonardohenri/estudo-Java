package POO.aula06getset.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }else{
            System.out.println("idade invalida");
        }
    }

    public void setNome(String nome) {
        if(nome != null && !nome.equals("")) {
            this.nome = nome;
        }else{
            System.out.println("nome é requirido");
        }
    }

    public int getIdade(){
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
