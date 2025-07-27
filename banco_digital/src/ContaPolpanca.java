package src;

public class ContaPolpanca extends Conta {
    public double saldoPolpanca;

    public ContaPolpanca(int numero, String titular, TipoConta tipoConta, Instituicao instituicao) {
        super(numero, titular, tipoConta, instituicao);
        this.saldoPolpanca = 0.0;    
    }

    public ContaPolpanca() {
        super();
        super.setTipoConta(TipoConta.Poupanca);
        this.saldoPolpanca = 0.0; 
    }

    @Override
    public void transferir(Conta conta, double valor) {
        if (valor > 0.0 && valor < this.getSaldo()) {
            System.out.println("Erro na operacao!");
            return;
        }
        
        if (super.getTipoConta() == TipoConta.Corrente) {
            super.setSaldo(super.getSaldo() - valor);
        }
        
        if (super.getTipoConta() == TipoConta.Poupanca) {
            super.setSaldo(super.getSaldo() - valor);
        }
    }

    public void depositarPolpanca(double valor) {
        if (valor <= 0.0) {
            System.out.println("Erro na operacao!");
            return;
        }

        this.saldoPolpanca += valor;
    }

    public double getSaldoPolpanca() {
        return saldoPolpanca;
    }

    public void setSaldoPolpanca(double saldoPolpanca) {
        this.saldoPolpanca = saldoPolpanca;
    }
}
