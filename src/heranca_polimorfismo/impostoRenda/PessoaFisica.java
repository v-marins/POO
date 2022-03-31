package heranca_polimorfismo.impostoRenda;

public class PessoaFisica extends Contribuinte{

    private String cpf;

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "(Pessoa Física) " +
                super.toString() + "\n"+
                "CPF: " + cpf + "\n" +
                "Imposto: " + calcularImposto();
    }

    @Override
    public double calcularImposto() {

        double renda = this.getRendaBruta();

        if(renda <= 1400){
            return 0;
        } else if(renda > 1400 && renda <= 2100){
            return (renda * 0.1) - 100;
        }else if(renda > 2100 && renda <= 2800){
            return (renda * 0.15) - 270;
        }else if(renda > 2800 && renda <= 3600) {
            return (renda * 0.25) - 500;
        }
        // renda > 3600
        return (renda * 0.3) - 700;
    }
}
