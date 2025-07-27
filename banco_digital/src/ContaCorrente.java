package src;

public class ContaCorrente extends Conta {
    private double taxa;

    public ContaCorrente(int numero, String titular, TipoConta tipoConta, Instituicao instituicao) {
        super(numero, titular, tipoConta, instituicao);
        this.taxa = 5.0;
    }
    public ContaCorrente() {
        super();
        super.setTipoConta(TipoConta.Corrente);
        this.taxa = 5.0;
    }

    @Override
    public void transferir(Conta conta, double valor) {
        if (valor > 0.0 && valor < this.getSaldo()) {
            System.out.println("Erro na operacao!");
            return;
        }
        
        if (super.getTipoConta() == TipoConta.Corrente) {
            conta.depositar(valor - ((valor / 100) * this.taxa));
            super.setSaldo(super.getSaldo() - valor);
        }
        
        if (super.getTipoConta() == TipoConta.Poupanca) {
            conta.depositar(valor - ((valor / 100) * (this.taxa*2)));
            super.setSaldo(super.getSaldo() - valor);
        }
    }
}
