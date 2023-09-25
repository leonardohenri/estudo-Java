package POO.aula14unidirecional.teste;

import POO.aula14unidirecional.dominio.Aluno;
import POO.aula14unidirecional.dominio.Curso;

public class MuitosParaMuitos {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("leonardo");
        Aluno aluno2 = new Aluno("forte");
        Aluno aluno3 = new Aluno("job");
        Curso curso1 = new Curso("C","Anderson");
        Curso curso2 = new Curso("Java","Guanabara");

        aluno1.addCurso(curso1);
        aluno2.addCurso(curso1);
        aluno3.addCurso(curso1);

        curso1.listaDeAlunos();

        aluno1.addCurso(curso2);
        aluno2.addCurso(curso2);

        curso2.listaDeAlunos();

        aluno1.listaDeCursos();

    }
}
