package relacionamentoClasses.curso;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo() {

        StringBuilder info = new StringBuilder("Nome do Aluno: " + nome + "\n" +
                "Matrícula: " + matricula + "\n" +
                "Notas: ");
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
            info.append(nota).append(" / ");
        }
        double media = soma / 4;
        info.append("\n" + "Média: ").append(media).append(" - ");

        if (media >= 7) {
            info.append("APROVADO!\n");
        } else {
            info.append("REPROVADO!\n");
        }
        return info.toString();
    }

    public double obterMedia(){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma/4;
    }
}
