package POO.aula14unidirecional.dominio;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String curso ;
    private String professor;

    private List<Aluno> alunos = new ArrayList<>();

    public Curso(String curso, String professor){
        this.curso = curso;
        this.professor = professor;
    }

    public String getCurso(){
        return ("Curso: "+curso+" Professor: "+professor);
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void listaDeAlunos(){
        if (alunos !=  null){
            for (Aluno aluno : alunos){
                System.out.println(aluno.getNome());
            }
        }
    }

}
