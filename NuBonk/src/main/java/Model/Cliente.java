/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pedro
 */
public class Cliente extends Pessoa{
    int numeroConta, quantidadeInvestimento;
    float saldo;

    public Cliente() {
    }

    public Cliente(String cpf, String senha) {
        super(cpf, senha);
    }
    
    public Cliente(String nome, String endereco, String cpf, String telefone,
                   String genero, String datanascimento, String email, String senha,
                   float saldo, int qtdinvestimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.dataNascimento = datanascimento;
        this.email = email;
        this.senha = senha;
        this.saldo = saldo;
        this.quantidadeInvestimento = qtdinvestimento;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getQuantidadeInvestimento() {
        return quantidadeInvestimento;
    }

    public void setQuantidadeInvestimento(int quantidadeInvestimento) {
        this.quantidadeInvestimento = quantidadeInvestimento;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
