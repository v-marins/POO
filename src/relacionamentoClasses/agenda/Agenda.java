package relacionamentoClasses.agenda;

/*Crie uma classe Agenda que possua vários contatos. Cada contato possui nome, telefone e e-mail.
* A agenda também possui nome. Crie um programa que peça para o usuário entrar com o nome da agenda
* e 3 contatos. Crie uma String que retorna as informações dos contatos da agenda.*/

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo() {
        StringBuilder info = new StringBuilder("Agenda: " + nome + "\n");

        for(Contato c:contatos){
            info.append(c.obterInfo()).append("\n");
        }

        return info.toString();

    }
}
