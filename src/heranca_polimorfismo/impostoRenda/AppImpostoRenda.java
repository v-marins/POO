package heranca_polimorfismo.impostoRenda;

public class AppImpostoRenda {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Moisés",4500,"335.521.960-64");
        PessoaJuridica pj = new PessoaJuridica("CasasLojas SA.",350000,"32.133.446/0001-80");

        System.out.println(pf.toString());
        System.out.println();
        System.out.println(pj.toString());

    }
}
