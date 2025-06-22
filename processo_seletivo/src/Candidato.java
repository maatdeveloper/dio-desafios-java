package src;

public class Candidato {
    public String nome;
    public int pretensaoSalarial;

    public Candidato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPretensaoSalarial() {
        return pretensaoSalarial;
    }
    public void setPretensaoSalarial(int pretensaoSalarial) {
        this.pretensaoSalarial = pretensaoSalarial;
    }
}
