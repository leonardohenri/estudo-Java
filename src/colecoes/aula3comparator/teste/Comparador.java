package colecoes.aula3comparator.teste;
import colecoes.aula3comparator.dominio.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparador {
    public static void main(String[] args) {
        List<Pessoa> lista1 = new ArrayList<>();
        lista1.add(new Pessoa(23,"leonardo"));
        lista1.add(new Pessoa(20,"sofia"));
        lista1.add(new Pessoa(15,"mariana"));
        lista1.add(new Pessoa(61,"idalete"));
        lista1.add(new Pessoa(76,"homero"));

        Collections.sort(lista1);

        for (Pessoa pessoa : lista1){
            System.out.println(pessoa);
        }

    }
}
