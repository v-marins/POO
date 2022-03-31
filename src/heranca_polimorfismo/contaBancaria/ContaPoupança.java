package heranca_polimorfismo.contaBancaria;

public class ContaPoupança extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupança(String nome, String numConta, double saldo, int diaRendimento) {
        super(nome, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "(POUPANÇA) \n" +
                 super.toString() +
                "Dias de Rendimento: " + diaRendimento + "\n";

    }

    public void saldoRendimento (double taxa){

        double v = super.getSaldo();
        v = v + (v * taxa/100) * diaRendimento;
        super.setSaldo(v);
        System.out.println("(POUPANÇA) SALDO ATUALIZADO COM RENDIMENTO");
        System.out.println("Taxa: " + taxa + "% durante "+diaRendimento+" dias.");
        System.out.println("SALDO R$: "+v+"\n");
    }
}
