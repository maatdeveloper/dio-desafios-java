package src;

public class Cliente {
    public String nome;
    public int idade;
    public Conta contaBancaria;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.contaBancaria = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Conta getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(Conta contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    
}
