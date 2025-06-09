package src;

public class Dev {
    private String nome;
    private Bootcamp bootcamp;

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp btc) {
        this.bootcamp = btc;
    }
    public void dadosBootcamp() {
        System.out.println(this.getBootcamp());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Bootcamp getBootcamp() {
        return bootcamp;
    }  
}
