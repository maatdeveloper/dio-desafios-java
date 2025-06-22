package src;

import java.util.ArrayList;
import java.util.Random;

public class ProcessoSeletivo {
    private int propostaSalarial;
    private String descricao;
    private ArrayList<Candidato> candidatosSelecionados;
    private ArrayList<Candidato> candidatosContatados;

    public ProcessoSeletivo(int ps, String d) {
        this.propostaSalarial = ps;
        this.descricao = d;
        this.candidatosSelecionados = new ArrayList<Candidato>();
        this.candidatosContatados = new ArrayList<Candidato>();
    }

    public void ligarParaCandidatos() {
        Random random = new Random();
        int i;

        for (Candidato c : this.candidatosSelecionados) {
            if (this.candidatosContatados.size() >= 3) {
                break;
            }

            for (i=1; i<=3; i++) {
                if (random.nextInt(1) != 0) {
                    candidatosContatados.add(c);
                    System.out.println("Conseguimos contato com " + c.getNome() + " após " + i + "tentativas.");
                    break;
                }
            }
        }
    }
    public void avaliarCandidato(Candidato c) {
        if (c.getPretensaoSalarial() <= this.propostaSalarial) {
            if (this.candidatosSelecionados.size() < 5) {
                this.candidatosSelecionados.add(c);
                System.out.println("Ligando para candidato...");

            } else {
                System.out.println("Já selecionamos os canditados.");

            }

        } else {
            System.out.println("Aguardando outros candidatos.");

        }
    }
    public void mostrarCandidatosSelecionados() {
        System.out.println("Os seguintes candidatos foram selecionados para entrevista: ");

        for (Candidato c : this.candidatosSelecionados) {
            System.out.println("\t" + c.getNome());
        }
    }

    public int getPropostaSalarial() {
        return propostaSalarial;
    }
    public void setPropostaSalarial(int propostaSalarial) {
        this.propostaSalarial = propostaSalarial;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }  
}
