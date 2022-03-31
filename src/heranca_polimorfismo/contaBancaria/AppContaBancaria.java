package heranca_polimorfismo.contaBancaria;

public class AppContaBancaria {

    public static void main(String[] args) {

       ContaPoupança c1 = new ContaPoupança("Carlos", "10050",500,10);
       ContaEspecial c2 = new ContaEspecial("Rafaela","20088",1000,500);
       ContaBancaria c3 = new ContaBancaria("Camila","50777",200);

        // Sacando valores das contas
        c1.sacar(100);
        c2.sacar(500);
        c3.sacar(50);

        // depositando valores
        c1.depositar(50);
        c2.depositar(200);
        c3.depositar(30);

        // verificando rendimento poupança
        c1.saldoRendimento(10);

        // Mostrando dados das contas
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());




    }




}
