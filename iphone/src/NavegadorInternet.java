package src;

import java.util.ArrayList;

public class NavegadorInternet {
    private ArrayList<Aba> abas;
    private Aba abaAberta;

    public NavegadorInternet() {
        this.abas = new ArrayList<Aba>();
        this.abaAberta = null;
    }

    public void exibir(Aba a) {
        if (!this.abas.contains(a)) {
            System.out.println("A aba nao está aberta!");
            return;
        }

        System.out.println("Exibindo aba " + a.getNome());
    }

    public void atualizar(Aba a) {
        if (this.abaAberta == null ) {
            System.out.println("Nenhum aba aberta.");
        }
    }

    public boolean adicionar(Aba a) {
        return this.abas.add(a);
    }

    public boolean remover(Aba a) {
        if (this.abas.contains(a)) {
            System.out.println("Esta aba nao existe.");
            return false;
        }

        this.abas.remove(a);
        return true;
    }

    public void abasAbertas() {
        for (Aba aba : abas) {
            System.out.println(aba.getNome());
        }
    }
}
