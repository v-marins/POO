package relacionamentoClasses.maquinaRefrigerantePoo;

import java.util.Scanner;

public class LojaDeRefrigeranteApp {

    public static void main(String[] args) {

        int opcao;
        int res;
        float valor;

        Scanner scan = new Scanner(System.in);
        MaquinaDeRefrigerante m = new MaquinaDeRefrigerante();

        do {
            System.out.println(m.mostraInfo());
            System.out.println("Digite 99 para colocar crédito");
            System.out.println("Digite -1 para sair.");
            System.out.println("Digite o nº do Refigerante para comprar (0 a 4).");
            opcao = scan.nextInt();
            switch (opcao){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                     res = m.comprar(opcao); // Método retorna int de controle (0,-1,-2).
                     if (res == 0){
                         System.out.println("Enjoy!");
                     }else if(res == -1){
                         System.out.println("Saldo insuficiente, insira crédito!");
                     }else{
                         System.out.println("Desculpe, Refrigerante em falta!");
                     }
                     break;

                case 99:
                    System.out.println("Digite o valor: ");
                    valor = scan.nextFloat();
                    m.inserirCredito(valor);
                    break;

                case -1:
                    System.out.println("Obrigado por utilizar a máquina!");
                    System.out.println("Seu troco: " + m.solicitarTroco());
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        } while (opcao != -1);
    }

}