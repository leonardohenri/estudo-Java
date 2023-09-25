package POO.aula16enumeracao.dominio;

public class Pessoa {
    private String nome;
    private TipoCliente tipoCliente;

    public Pessoa(String nome, TipoCliente tipoCliente) {
        this.nome =  nome;
        this.tipoCliente = tipoCliente ;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                '}';
    }

    public String imprime(){
        return ("nome: "+nome + " tipo: " +tipoCliente);
    }
}
