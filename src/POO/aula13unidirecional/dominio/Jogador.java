package POO.aula13unidirecional.dominio;

public class Jogador {
    private String nome;
    private int numero;
    private Time time;
    public Jogador(String nome, int numero){
            this.nome = nome;
            this.numero = numero;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getJogador(){
        return("jogador: " +nome+ " usava o numero: "+numero);
    }
}
