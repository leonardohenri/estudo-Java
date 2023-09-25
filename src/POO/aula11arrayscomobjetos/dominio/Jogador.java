package POO.aula11arrayscomobjetos.dominio;

public class Jogador {
    private String nome;
    private int numero;
    public Jogador(String nome, int numero){
            this.nome = nome;
            this.numero = numero;
    }

    public void imprime(){
        System.out.println("jogador: " +nome+ " usava o numero: "+numero);
    }
}
