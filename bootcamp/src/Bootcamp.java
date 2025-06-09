package src;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private int cargaHoraria;
    private boolean concluido;
    public ArrayList<Mentoria> mentorias;
    public ArrayList<Curso> cursos;

    public Bootcamp(String nome, LocalDate dataInicial) {
        this.nome = nome;
        this.dataInicial = dataInicial;
        this.cargaHoraria = 0;
        this.dataFinal = calcularDataFinal(dataInicial);
        this.mentorias = new ArrayList<Mentoria>();
        this.cursos = new ArrayList<Curso>();
        this.concluido = false;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();

        sBuilder.append("======================================\n");
        sBuilder.append(" \\ Bootcamp " + this.getNome() + " {\n");

        for (Curso curso : this.cursos) {
            sBuilder.append("\t" + curso.getTitulo() + " : " + curso.getCargaHoraria() + "h,\n");
        }

        sBuilder.append("}\n");
        sBuilder.append("======================================\n");
        sBuilder.append("Seu progresso: ");

        for (Curso curso : this.cursos) {
            if (curso.isConcluido()) {
                sBuilder.append("*");
            } else {
                sBuilder.append("x");
            }
        }
        
        if (this.isConcluido()) {
            sBuilder.append("\nSTATUS: Concluido.\n");
        } else {
            sBuilder.append("\nSTATUS: Em progresso.\n");
        }

        return sBuilder.toString();
    }
    public LocalDate calcularDataFinal(LocalDate dataI) {
        return dataI.plusDays(90);
    }
    public void assistirCurso(int curso) {
        if (!cursos.get(curso).isConcluido()) {
            cursos.get(curso).setConcluido(true);
        }
    }
    public void assistirMentoria(int ment) {
        if (!mentorias.get(ment).isConcluido()) {
            mentorias.get(ment).setConcluido(concluido);
        }
    }
    private void concluido() {
        for (Curso curso : cursos) {
            if (!curso.isConcluido()) {
                this.concluido = false;
                return;
            }
        }

        this.concluido = true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDataInicial(LocalDate dataI) {
        this.dataInicial = dataI;
    }
    public LocalDate getDataInicial() {
        return this.dataInicial;
    }
    public void setDataFinal(LocalDate dataF) {
        this.dataFinal = dataF;
    }
    public LocalDate getDataFinal() {
        return this.dataFinal;
    }
    public void setCargaHoraria(int ch) {
        this.cargaHoraria = ch;
    }
    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
    public boolean isConcluido() {
        this.concluido();

        return this.concluido;
    }
    public void adicionarCurso(Curso c) {
        this.cursos.add(c);
        this.cargaHoraria += c.getCargaHoraria();
    }
    public void adicionarMentoria(Mentoria m) {
        this.mentorias.add(m);
    }
}
