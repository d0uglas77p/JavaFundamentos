package sintaxe.cap3;

public class Conta {

    int agencia;
    int numero;
    double saldo;
    public Conta() {
    }

    public  Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double verificarSaldo() {
        return this.saldo;
    }
}
