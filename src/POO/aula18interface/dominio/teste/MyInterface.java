package POO.aula18interface.dominio.teste;

public interface MyInterface {
  void falarNome();

  default void Falaoi(){
      System.out.println("oii");
  }

}
