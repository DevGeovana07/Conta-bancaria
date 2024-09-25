
package sistemabancario;


public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Pessoa titular, String numeroConta){
        super(titular, numeroConta);
    }
    
    public boolean aplicarDaContaCorrente(ContaCorrente contaCorrente, double valor){
        if (contaCorrente.sacar(valor)){
            this.depositar(valor);
            return true;
        }
        else{
            System.out.println("Aplicação falhou.");
        }
        return false;
    }
@Override
public boolean sacar(double valor){
    return super.sacar(valor);
}    
}

