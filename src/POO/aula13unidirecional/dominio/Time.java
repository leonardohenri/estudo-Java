package POO.aula13unidirecional.dominio;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String time;
    private List<Jogador> jogadores = new ArrayList<>();

    public Time(String time){
        this.time = time;
    }

    public void addJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }

    public String getTime() {
        return time;
    }

    public void imprimeJogadores(){
        System.out.println(time);
        if(jogadores != null){
            for ( Jogador jogador : jogadores ) {
                System.out.println(jogador.getJogador());
            }
        }
    }

}
