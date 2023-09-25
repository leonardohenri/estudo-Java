package POO.aula14unidirecional.dominio;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome){
        this.nome = nome;
    }

    public void addCurso(Curso curso){
        cursos.add(curso);
        curso.addAluno(this);
    }

    public String getNome() {
        return nome;
    }

    public void listaDeCursos(){
        if (cursos != null){
            System.out.println("Cursos:");
            for(Curso curso : cursos){
                System.out.println(curso.getCurso());
            }
        }
    }
}
