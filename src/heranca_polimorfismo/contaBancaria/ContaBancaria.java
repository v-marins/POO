package heranca_polimorfismo.contaBancaria;

import java.sql.SQLOutput;

public class ContaBancaria {

    private String nome;
    private String numConta;
    private double saldo;

    public ContaBancaria(String nome, String numConta, double saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return    "ContaBancaria \n" +
                  "Nome: " + nome + "\n" +
                  "Numero Conta: " + numConta + "\n" +
                  "SALDO R$: " + saldo + "\n";
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido para Saque.");
        }else if((saldo - valor) < 0){
            System.out.println("Saque não permitido / Saldo negativo");
        }else{
            saldo = saldo - valor;
            System.out.println("Saque efetuado!");
            System.out.println("Valor: "+ valor);
            System.out.println("SALDO: R$ " + saldo +"\n");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor Inválido!");
        } else {
            saldo = saldo + valor;
            System.out.println("Depósito efetuado!");
            System.out.println("Saldo atual: " + saldo +"\n");
        }
    }
}
