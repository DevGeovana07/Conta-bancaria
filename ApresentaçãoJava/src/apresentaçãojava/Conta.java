/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentaçãojava;

/**
 *
 * @author John
 */
public class Conta {
    private Pessoas titular;
    private int numeroConta;
    private double saldo;
    
    public Conta(Pessoas titular, int numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public Pessoas getTitular(){
        return titular;
    }
    public int getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;        
    }
    
    public void setTitular(Pessoas titular){
        this.titular = titular;
    }
    public void setNumeroConta (int numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    
    public void depositar (double valor){
        if (valor > 0){
            saldo += valor;
        }
    }
    
    public boolean sacar(double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
      return "Conta{" +
                "titular=" + titular +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';  
    }
}
