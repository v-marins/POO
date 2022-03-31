package heranca_polimorfismo.impostoRenda;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "(Pessoa Jurídica) " +
                super.toString() + "\n"+
                "CNPJ: " + cnpj + "\n" +
                "Imposto: " + calcularImposto();
    }

    @Override
    public double calcularImposto() {
        return getRendaBruta() * 0.1; // retorna 10% da renda bruta.
    }
}
