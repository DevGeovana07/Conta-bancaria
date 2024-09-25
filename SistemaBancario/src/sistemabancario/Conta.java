
package sistemabancario;


public class Conta {
    protected Pessoa titular;
    protected String numeroConta;
    protected double saldo;
    
    public Conta(Pessoa titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    
    public Pessoa getTitular(){
        return titular;
    }
    
    public String getNumeroConta(){
        return numeroConta;
    }
    
    public double getSaldo(){
        return saldo;        
    }
    
    public void depositar (double valor){
        if (valor > 0){
            saldo += valor;
        }
        else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public boolean sacar(double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            return true;
        }
        else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}
