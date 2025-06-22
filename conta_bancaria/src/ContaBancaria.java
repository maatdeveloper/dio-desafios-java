package src;

public class ContaBancaria {
    private int numero;
    private String agencia;
    private String cliente;
    private double saldo;

    public ContaBancaria() {
        this.setNumero(1);
        this.setCliente(null);
        this.setAgencia(null);
        this.setSaldo(0.0);
    }
    public ContaBancaria(int numero, String agencia, String cliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }
    private void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public double getSaldo() {
        return saldo;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + this.getCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.getAgencia() + ", conta " + this.getNumero() + " e seu saldo R$" + this.getSaldo() + " já está disponível para saque";
    }
}
