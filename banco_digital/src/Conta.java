package src;

public class Conta implements IConta {
    private int numero;
    private String titular;
    private TipoConta tipoConta;
    private Instituicao instituicao;
    private double saldo;

    public Conta(int numero, String titular, TipoConta tipoConta, Instituicao instituicao) {
        this.numero = numero;
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.instituicao = instituicao;
        this.saldo = 0.0;
    }

    public Conta() {
        this.numero = 0;
        this.titular = "";
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro na operação de deposito!");
            return;
        }

        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor >= this.saldo) {
            System.out.println("Erro na operacao de saque.");
            return;
        }
        if (valor <= 0) {
            System.out.println("Erro na operação de deposito!");
            return;
        }

        this.saldo -= valor;
    }

    public void transferir(Conta conta, double valor) {
        // implementar nas classes ContaCorrente e ContaPoupanca...
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append("========================================\n");
        stringBuilder.append("Instituicao: " + this.getInstituicao());
        stringBuilder.append("\n");
        stringBuilder.append("Numero: " + this.getNumero());
        stringBuilder.append("\n");
        stringBuilder.append("Titular: " + this.titular);
        stringBuilder.append("\n");
        stringBuilder.append("Tipo de Conta: " + this.getTipoConta());
        stringBuilder.append("\n");
        stringBuilder.append("Saldo: R$" + this.getSaldo());
        stringBuilder.append("\n========================================");

        return stringBuilder.toString();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
    
}
