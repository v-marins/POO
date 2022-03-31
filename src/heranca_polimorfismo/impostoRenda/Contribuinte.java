package heranca_polimorfismo.impostoRenda;
// usando conceitos de classe abstrata, pois não se instancia contribuinte.
public abstract class Contribuinte {

    private String nome;
    private double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + "\n" +
                "Renda Bruta: " + rendaBruta;
    }

    public abstract double calcularImposto();
}
