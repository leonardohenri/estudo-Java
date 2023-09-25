package POO.aula09objetostatic;

public class Carro {
    private String nome;
    private String marca;
    private static  double velocidadeMaxima = 250;

    public Carro(String nome, String marca){
        this.nome =nome;
        this.marca = marca;
    }

    public void imprime(){
        System.out.println(" nome:" +this.nome+ "\n marca:"+this.marca+"\n velocidade Maxima: "+this.velocidadeMaxima);
        System.out.println("_____________________");
    }

    public static void setVelocidadeMaxima(double velocidadeMaxima) {
        Carro.velocidadeMaxima = velocidadeMaxima;
    }
}
