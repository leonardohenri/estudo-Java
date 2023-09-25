package POO.aula13unidirecional.teste;

import POO.aula13unidirecional.dominio.Jogador;
import POO.aula13unidirecional.dominio.Time;

public class MuitosParaUm {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Cafu" , 9);
        Jogador jogador2 =  new Jogador("pelé", 10);
        Jogador jogador3 =  new Jogador("neymar",10);
        Time time1 = new Time("seleção brasileira");

        time1.addJogador(jogador1);

        time1.imprimeJogadores();

        time1.addJogador(jogador2);

        time1.imprimeJogadores();

        time1.addJogador(jogador3);

        time1.imprimeJogadores();
    }
}
