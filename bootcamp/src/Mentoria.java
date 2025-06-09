package src;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate dataMentoria;
    private boolean concluido;

    public Mentoria(String titulo, LocalDate data) {
        this.titulo = titulo;
        this.dataMentoria = data;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataMentoria() {
        return dataMentoria;
    }
    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }
    public boolean isConcluido() {
        return this.concluido;
    }
    public void setConcluido(boolean m) {
        this.concluido = m;
    }
}
