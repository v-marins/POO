package heranca_polimorfismo.contaBancaria;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial(String nome, String numConta, double saldo, double limite) {
        super(nome, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "(ESPECIAL) \n" +
                super.toString() +
                "Limite: " + limite +"\n";

    }

    @Override
    public void sacar(double valor) {
        double v = super.getSaldo() + limite;
        if(v - valor < 0){
            System.out.println("Saque não permitido / Saldo negativo");
        }else{
            v = v - valor;
            super.setSaldo(v);
            System.out.println("Saque efetuado!");
            System.out.println("Valor: "+ valor);
            System.out.println("SALDO: R$ " + v + "\n");
        }
    }
}
