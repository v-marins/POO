package relacionamentoClasses.maquinaRefrigerantePoo;

public class MaquinaDeRefrigerante {

    private Refrigerante[] lista; //cria uma lista do tipo refrigerante (ref a classe).
    private float credito;

//    Esse construtor cria uma maquina já com 5 refrigerantes adicionados a sua lista
    public MaquinaDeRefrigerante() {
        lista = new Refrigerante[5]; // Cria uma ref de que a lista terá 5 obj do tipo refrigerante.
        lista[0] = new Refrigerante("Coca Cola",2.50f,5);
        lista[1] = new Refrigerante("Fanta Uva",2.00f,5);
        lista[2] = new Refrigerante("Fanta Laranja",2.00f,5);
        lista[3] = new Refrigerante("Sprite",2.10f,5);
        lista[4] = new Refrigerante("Kuat",1.80f,5);
        this.credito = 0.0f;

    }

    public void inserirCredito(float valor){
        credito= valor;
    }

    // retorna um int: 0 em caso de sucesso, -1 sem credito, -2 sem estoque.
    public int comprar(int numRefri){ //numRefri recebe a posicao na lista de refri.

        if(credito>=lista[numRefri].getPreco()){ // testa se possui credito.
            if(lista[numRefri].getQtd()>0){ // testa se possui estoque de refri disponível.
                credito -= lista[numRefri].getPreco(); // faz efetivamente a compra.
                int novaQtde = lista[numRefri].getQtd() -1; //atualiza a qtd de refri.
                lista[numRefri].setQtd(novaQtde); //seta a nova qtd no obj da lista.
                return 0;
            } else{
                return -2;
            }
        } else{
            return -1;
        }
    }

    public float solicitarTroco(){
        float troco = credito;
        credito = 0.0f;
        return troco;
    }

    public String mostraInfo(){
        String str = "";
        str += "+=========================================+\n" +
               "| Maquina de Refrigerante.                |\n" +
               "+=========================================+\n" +
               "| Credito R$ : " +credito +               "\n";

        for (Refrigerante r: lista) {
            str += "| "+r.getNome() + " R$: "+r.getPreco()+"\n";
        }
        str += "+=========================================+\n";
        return str;
    }
}
