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
public class Pessoas {
   private String nome;
   private int idade;
   private String cpf;
   private int numeroConta;
   
   public Pessoas(String nome, int idade, String cpf, int numeroConta){
       this.nome = nome;
       this.idade = idade;
       this.cpf = cpf;
       this.numeroConta = numeroConta;
   }
   
   
   // fazer gets primeiro e depois os sets
   
   
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
    
    public int getNumeroConta(){
        return numeroConta;
    }
    
   public void setNumeroConta(int numeroConta){
       this.numeroConta = numeroConta;
   }
   
   @Override
   public String toString(){
       return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", numeroConta=" + numeroConta +
                '}';
   }
       
       
   } 
    
    

