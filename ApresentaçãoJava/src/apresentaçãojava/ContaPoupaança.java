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
public class ContaPoupaança extends Conta {
    
    public ContaPoupaança(Pessoas titular, int numeroConta, double saldo){
        super (titular, numeroConta, saldo);
    }
    
    public boolean transferir(double valor, Conta contaDestino){
        if (valor > 0 && saldo >= valor && contaDestino != null){
            saldo -= valor;
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
    }
    

