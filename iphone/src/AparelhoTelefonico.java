package src;

import java.util.ArrayList;

public class AparelhoTelefonico {
    private ArrayList<Contato> contatos;
    private String correio;

    public AparelhoTelefonico() {
        this.contatos = new ArrayList<Contato>();
        this.correio = null;
    }

    public void mostrarCorreioVoz() {
        if (this.correio == null || this.correio.isEmpty()) {
            System.out.println("Não tem mensagens gravadas no correio de voz.");
            return;
        }

        System.out.println(this.correio);
    }

    public void ligar (Contato c) {
        System.out.println("Ligando para " + c.getNome());
    }

    public void atender(Contato c) {
        System.out.println("Recebendo ligacao de " + c.getNome());
    }

    public void iniciarCorreioVoz(String msg) {
        this.correio = msg;
        System.out.println("Mensagem gravada com sucesso.");
    }

    public boolean adicionar(Contato c) {
        return this.contatos.add(c);
    }

    public boolean remover(Contato c) {
        if (!this.contatos.contains(c)) {
            System.out.println("Voce nao tem esse contato.");
            return false;
        }

        this.contatos.remove(c);
        return true;
    }

    public void meusContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato.getNome() + ": " + contato.getNumero());
        }
    }
}
