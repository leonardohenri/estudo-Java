package POO.aula01.teste;

import POO.aula01.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args){
        Carro carro = new Carro();
        Carro carro1 =  new Carro();

        carro.nome="Astra";
        carro.ano=2008;
        carro.modelo="sedan";

        carro1.nome="ideia";
        carro1.ano=2006;
        carro1.modelo="adventure";

        System.out.println(carro.nome+" ano "+carro.ano+" modelo "+carro.modelo);
        System.out.println(carro1.nome+" ano "+carro1.ano+" modelo "+carro1.modelo);
    }
}
