public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso("Java", "Alex Santos");
        cursoJava.adiciona(new Aula("Aula 1 herança",20));
        cursoJava.adiciona(new Aula("Aula 1 polimorfismo",25));
        cursoJava.adiciona(new Aula("Aula 1 encapsulamento",30));
        cursoJava.adiciona(new Aula("Aula 1 interface",35));

        Aluno aluno1 = new Aluno("Alex Santos", 1111);
        Aluno aluno2 = new Aluno("Flavia Ferreira", 2222);
        Aluno aluno3 = new Aluno("Fernanda Santos", 3333);

        cursoJava.matricula(aluno1);
        cursoJava.matricula(aluno2);
        cursoJava.matricula(aluno3);

        System.out.println("Alunos matriculados :");
        for (Aluno aluno: cursoJava.getAlunos()) {
            System.out.println(aluno.getNome());
        }

        System.out.println("Todos os alunos matriculados: ");
        cursoJava.getAlunos().forEach(aluno -> {
            System.out.println(aluno.getNome());
        });


        System.out.println("Aluno está matriculado ?");
        System.out.println(cursoJava.alunoEstaMatriculado(aluno1));


        System.out.println("Aluno está matriculado ?");
        Aluno alex = new Aluno("Alex Santos", 1111);
        System.out.println(cursoJava.alunoEstaMatriculado(alex));

        System.out.println(aluno1 == alex);
        System.out.println(aluno1.equals(alex));

        System.out.println(aluno1.hashCode() == alex.hashCode());

    }
}