package POO.aula12unidirecional.dominio;

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

    public void imprime(){
        System.out.println("jogador: " +nome+ " usava o numero: "+numero);
        if (time != null){
            System.out.println(time.getTime());
        }
    }
}
