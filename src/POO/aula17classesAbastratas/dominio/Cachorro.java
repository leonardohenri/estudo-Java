package POO.aula17classesAbastratas.dominio;

public class Cachorro extends Animal{
    public Cachorro(String nome){
        this.nome = nome;
    }
    @Override
    public void som() {
        System.out.println("au au");
    }
}
