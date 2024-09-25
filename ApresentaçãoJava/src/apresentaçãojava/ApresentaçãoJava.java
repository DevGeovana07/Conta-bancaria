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
public class ApresentaçãoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoas cliente1 = new Pessoas ("João Silva", 30, "123.456.789-00", 12345);
        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1, 123456789, 1000.0);
        ContaPoupaança contaPoupanca1 = new ContaPoupaança(cliente1, 987654321, 500.0);

        // Realizar operações bancárias
        contaCorrente1.depositar(200.0);
        contaPoupanca1.depositar(150.0);
        contaCorrente1.sacar(50.0);
        contaPoupanca1.transferir(100.0, contaCorrente1);

        // Exibir informações das contas
        System.out.println(contaCorrente1);
        System.out.println(contaPoupanca1);
    }
    
}
