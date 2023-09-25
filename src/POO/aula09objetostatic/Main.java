package POO.aula09objetostatic;

public class Main {
    public static void main(String[] args){
        Carro carro = new Carro("FERRARI 296 GTB ","ferrari");
        Carro carro1 = new Carro("A3 Sedan","audi");
        Carro carro2 = new Carro("ONIX","chevrolet");

        carro.imprime();
        carro1.imprime();
        carro2.imprime();

        carro.setVelocidadeMaxima(188.97);

        carro.imprime();
        carro1.imprime();
        carro2.imprime();

        Carro.setVelocidadeMaxima(120);

        carro.imprime();
        carro1.imprime();
        carro2.imprime();
    }
}
