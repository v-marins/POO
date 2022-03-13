package PessoaPoo;

public class Pessoa {

    private String nome;
    private String email;
    private float salario;


    public Pessoa(String nome, String email, float salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void aumentarSalario(float indice){
        salario = salario + salario*indice/100;
    }

    public void exibirDados(){
        System.out.println("Sistema de Pessoas ********");
        System.out.println("Nome: "+ nome);
        System.out.println("E-mail: " + email);
        System.out.println("Salario: R$ " + salario);
    }


}
