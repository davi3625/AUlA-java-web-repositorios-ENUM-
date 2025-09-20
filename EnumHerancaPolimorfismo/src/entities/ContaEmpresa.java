package entities;

public class ContaEmpresa extends Conta {

    private Double limite;

    public ContaEmpresa(){
        super();
    }

    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    public void saldoTotal(){
        saldo += limite;
    }

    public void emprestimo(double quantia){
        limite -= quantia + (quantia * 0.10);
        saldoTotal();
    }
}
