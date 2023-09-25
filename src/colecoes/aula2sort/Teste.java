package colecoes.aula2sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(123);
        numeros.add(6);
        numeros.add(1);
        numeros.add(2345);
        numeros.add(7);

        Collections.sort(numeros);

        for (int num: numeros){
            System.out.print(num+" ");
        }
    }
}
