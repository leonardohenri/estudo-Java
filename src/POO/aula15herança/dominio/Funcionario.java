package POO.aula15herança.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade){
        super(nome,idade);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprime(){
        super.imprime();
        System.out.println(salario);
    }

}
