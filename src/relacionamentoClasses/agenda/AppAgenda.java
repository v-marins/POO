package relacionamentoClasses.agenda;

import java.util.Scanner;

public class AppAgenda {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Entre com o nome da Agenda: ");
        Agenda ag1 = new Agenda();
        ag1.setNome(scan.nextLine());

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++) {
            Contato cont = new Contato();
            System.out.println("Entre com o contato posição "+(i+1)+":");
            System.out.println("Nome: ");
            cont.setNome(scan.nextLine());
            System.out.println("Telefone: ");
            cont.setTelefone(scan.nextLine());
            System.out.println("E-mail: ");
            cont.setEmail(scan.nextLine());

            contatos[i] = cont;
        }

        ag1.setContatos(contatos);

        System.out.println(ag1.obterInfo());
    }
}
