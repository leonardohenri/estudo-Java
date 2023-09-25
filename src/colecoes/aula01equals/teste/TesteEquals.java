package colecoes.aula01equals.teste;

import java.util.ArrayList;
import java.util.List;

public class TesteEquals {
    public static void main(String[] args){
        List<String> lista1 = new ArrayList<>();
        lista1.add("a");
        lista1.add("b");

        List<String> lista2 = new ArrayList<>();
        lista2.add("a");
        lista2.add("b");

        boolean saoIguais = lista1.equals(lista2);
        System.out.println(saoIguais);
    }
}
