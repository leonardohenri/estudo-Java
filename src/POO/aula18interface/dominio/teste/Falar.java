package POO.aula18interface.dominio.teste;

public class Falar implements MyInterface{
    private String nome;
    public Falar(String nome){
        this.nome = nome;
        this.falarNome();
    }

    @Override
    public void falarNome() {
        this.Falaoi();
        System.out.println(nome);

    }
}
