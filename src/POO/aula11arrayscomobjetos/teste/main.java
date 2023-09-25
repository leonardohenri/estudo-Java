package POO.aula11arrayscomobjetos.teste;

import POO.aula11arrayscomobjetos.dominio.Jogador;

public class main {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Cafu" , 9);
        Jogador jogador2 =  new Jogador("pelé", 10);
        Jogador jogador3 =  new Jogador("neymar",10);

        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
