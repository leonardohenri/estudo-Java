package POO.aula16enumeracao.dominio;

public enum TipoCliente {
    Fisica(1), Juridica(2);
    public final int VALOR;

    TipoCliente(int valor){
        this.VALOR = valor;
    }
}
