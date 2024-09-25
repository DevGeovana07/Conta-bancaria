
package sistemabancario;
import java.util.Scanner;
public class SistemaBancario {

    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
       Pessoa cliente = new Pessoa("João Silva", 30, "123.456.789-00", "0001");

        ContaCorrente contaCorrente = new ContaCorrente(cliente, "0001");
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente, "0002"); 
        
        System.out.println("Informações do Cliente:");
        System.out.println(cliente);
        System.out.println("Número da Conta Poupança: " + contaPoupanca.getNumeroConta());

        contaCorrente.depositar(200); 
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());

        contaCorrente.aplicarRendimento();
        System.out.println("Saldo Conta Corrente após rendimento: " + contaCorrente.getSaldo());

        contaPoupanca.aplicarDaContaCorrente(contaCorrente, 150);
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
        
        contaSaque(cliente, contaCorrente, contaPoupanca);
        
        
    }
    
   private static boolean contaSaque(Pessoa cliente,ContaCorrente contaCorrente, ContaPoupanca contaPoupanca){
       System.out.println("1 - Conta Corrente");
       System.out.println("2 - Conta Poupança");
       System.out.println("Escolha a conta para realizar o saque: ");
       int opcao = scanner.nextInt();
       
       switch (opcao) {
           case 1: 
               realizarSaque(contaCorrente);
               break;
           case 2:
               realizarSaque(contaPoupanca);
               break;
           default: 
               System.out.println("Opção inválida!");
               break;
       }
        return false;
   }

       
    private static void realizarSaque(Conta conta){
        System.out.println("Digite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();
        
        if (valorSaque <= conta.getSaldo()) {
            conta.sacar(valorSaque);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        
        System.out.println("Saldo atual da conta: " + conta.getSaldo());
    }
    }   
       
    
