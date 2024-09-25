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
public class ContaCorrente extends Conta {
    private double rendimento; 
    
    public ContaCorrente (Pessoas titular, int numeroConta, double saldo) {
        super(titular, numeroConta, saldo); // oq é super ??
        this.rendimento = 0.05;
    }
    public double calcularRendimento(){
        return saldo * rendimento / 100; // saldo está privado
    }
    public void render(){
        saldo += calcularRendimento();
    }
    @Override
    public String toString(){
        return super.toString() +
                ", rendimento = " + rendimento +
                '}';
    }
    }
    
}
