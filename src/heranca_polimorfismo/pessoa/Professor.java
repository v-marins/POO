package heranca_polimorfismo.pessoa;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }
    // Método esta sobrescrevendo o método original da superclasse.
    //polimorfismo.
    public String obterEtiquetaEndereco(){
        String s = "Endereço do professor: " +this.getEndereco();

        return s;
    }

}