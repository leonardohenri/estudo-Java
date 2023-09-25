package POO.aula03referencia.dominio;

public class FalarNome {
    public void printarNome(Pessoa pessoa){
        System.out.println(pessoa.nome);
        System.out.println("agora vou trocar o nome para robson");
        pessoa.nome ="robson";
    }
}
