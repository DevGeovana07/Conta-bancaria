/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

/**
 *
 * @author John
 */
public class Pessoa {
   private String nome;
   private int idade;
   private String cpf;
   private String numeroConta;
   
   public Pessoa (String nome, int idade, String cpf, String numeroConta){
       this.nome = nome;
       this.idade = idade;
       this.cpf = cpf;
       this.numeroConta = numeroConta;
   }
   
   
   
   public String getNome(){
       return nome;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public int getIdade(){
       return idade;
   }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    
    public String getNumeroConta(){
        return numeroConta;
    }
    
   public void setNumeroConta(String numeroConta){
       this.numeroConta = numeroConta;
   }
   
   @Override
   public String toString(){
       return "Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf + ", Numero da Conta Corrente: " + numeroConta;
   }
}

  
