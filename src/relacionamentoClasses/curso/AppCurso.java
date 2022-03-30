package relacionamentoClasses.curso;

import java.util.Scanner;

public class AppCurso {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Adicione o nome do curso: ");
        String nomeCurso = scan.nextLine();

        System.out.println("Adicione o horário: ");
        String horario = scan.nextLine();

        System.out.println("Adicione o nome do professor: ");
        String nomeProf = scan.nextLine();

        System.out.println("Adicione o departamento do professor: ");
        String departamento = scan.nextLine();

        System.out.println("Adicione o e-mail do professor: ");
        String email = scan.nextLine();

        // Crio um array para receber todos os alunos
        Aluno[] alunos = new Aluno[5];
        // interação para criar alunos (cada instancia um novo aluno)
        for (int i = 0; i < alunos.length; i++) {

            Aluno objAluno = new Aluno();

            scan.nextLine();
            System.out.println("============ ALUNOS ============");

            System.out.println("Adicione o nome do aluno "+(i+1)+":");
            objAluno.setNome(scan.nextLine());

            System.out.println("Adicione a matricula do aluno "+(i+1)+":");
            objAluno.setMatricula(scan.nextLine());

        //Crio um array para receber as notas
            double[] notas = new double[4];
        // interação para criar as notas e adicionar ao array notas.
            for (int j = 0; j <notas.length; j++) {
                    System.out.println("Entre com a nota "+(j+1)+" do aluno "+(i+1));
                    notas[j] = scan.nextDouble();
            }
        // Seto as notas criadas no obj aluno
            objAluno.setNotas(notas);
        // Adiciono o objeto com informações de um aluno no array de alunos
            alunos[i] = objAluno;
        }

        Professor prof = new Professor();
        prof.setNome(nomeProf);
        prof.setDepartamento(departamento);
        prof.setEmail(email);

        Curso curso = new Curso();
        curso.setNome(nomeCurso);
        curso.setHorario(horario);
        curso.setProfessor(prof);
        curso.setAluno(alunos);


        System.out.println(curso.obterInfo());


    }
}
