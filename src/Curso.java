
import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();

    private Collection<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }


    public int getTempoTotal(){
     /*   int tempoTotal = 0;
        for (Aula aula: aulas) {
            tempoTotal += aula.getTempo();
        } */
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[ Curso : " + this.nome +  " tempo total " + this.getTempoTotal()+"]";
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
    }

    public Collection<Aluno> getAlunos() {
        return Collections.unmodifiableCollection(alunos);
    }

    public boolean alunoEstaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
