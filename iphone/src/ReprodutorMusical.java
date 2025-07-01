package src;

import java.util.ArrayList;

public class ReprodutorMusical {
    private ArrayList<Musica> playlist;
    private Musica musicaParaTocar;

    public ReprodutorMusical() {
        this.playlist = new ArrayList<Musica>();
        this.musicaParaTocar = null;
    }

    public void selecionar(Musica m) {
        if (this.playlist.size() == 0)  {
            System.out.println("Sem musicas na playlist.");
            return;
        }
        if (!this.playlist.contains(m)) {
            System.out.println("Essa musica nao esta na playlist.");
            return;
        }

        this.musicaParaTocar = m;
        System.out.println("Musica " + m.getNome() + " selecionada!");
    }

    public void tocar() {
        if (this.musicaParaTocar == null) {
            System.out.println("Nenhuma musica selecionada.");
            return;
        }

        System.out.println("Tocando " + this.musicaParaTocar.getNome());
    }

    public void pausar() {
        if (this.musicaParaTocar == null) {
            System.out.println("Nenhuma musica tocando.");
            return;
        }

        System.out.println(this.musicaParaTocar.getNome() + " pausada");
    }

    public boolean adicionar(Musica m) {
        return this.playlist.add(m);
    }

    public boolean remover(Musica m) {
        if (!this.playlist.contains(m)) {
            System.out.println("Esta musica nao esta na playlist.");
            return false;
        }

        this.playlist.remove(m);
        return true;
    }

    public void mostrarPlaylist() {
        for (Musica musica : this.playlist) {
            System.out.println("\t" + musica.getNome());
        }
    }
}
