
package sistemabancario;

public class ContaCorrente extends Conta {
    
  public ContaCorrente(Pessoa titular, String numeroConta) {
        super(titular, numeroConta);
    }

    public void aplicarRendimento() {
        if (saldo >= 100) {
            saldo += saldo * 0.0005 ;
        }
    }
    
@Override
public boolean sacar(double valor){
    return super.sacar(valor);
}
}
    