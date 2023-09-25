package POO.aula12unidirecional.teste;

import POO.aula12unidirecional.dominio.Jogador;
import POO.aula12unidirecional.dominio.Time;

public class UmParaMuitos {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Cafu" , 9);
        Jogador jogador2 =  new Jogador("pelé", 10);
        Jogador jogador3 =  new Jogador("neymar",10);
        Time time1 = new Time("seleção brasileira");
        Time time2 = new Time("Santos");

        jogador1.setTime(time1);
        jogador3.setTime(time2);

        Jogador[] jogadores = {jogador1,jogador2,jogador3};


        for (Jogador jogador : jogadores) {
            jogador.imprime();
            System.out.println("_________________");
        }
    }
}
