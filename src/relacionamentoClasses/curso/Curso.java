package relacionamentoClasses.curso;

/*Escreva uma classe para representar um curso que tem nome e horário, tem um professor que possui
* nome, departamento e email e tem "n" alunos, que possuem nomes, matricula e 4 notas.
* Escreva um programa que crie um curso com 5 alunos, que o usuário possa cadastrar as informações do
* curso, do professor e dos alunos. Ao final imprima média da turma, média do aluno e se ele foi aprovado.*/

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] aluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public String obterInfo(){
        String info = "Nome Curso: " + nome +"\n";

        info += professor.obterInfo();

        System.out.println("--------- Alunos ----------");
        for (Aluno aluno: aluno){
            info += aluno.obterInfo();
        }

        info += "\nMédia da Turma: "+ obterMediaTurma();

        return info;
    }

    public double obterMediaTurma(){
        double soma = 0;
        for (Aluno aluno: aluno){
        soma += aluno.obterMedia();
        }
        return soma/ aluno.length;

    }
}
