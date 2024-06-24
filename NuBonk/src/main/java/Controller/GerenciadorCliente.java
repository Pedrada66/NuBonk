/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import View.TelaCadastro;
import View.TelaConta;
import View.TelaInicial;

/**
 *
 * @author pedro
 */
public class GerenciadorCliente {
    private Cliente c = new Cliente();
    private TelaInicial ti;
    private TelaCadastro tc;
    private TelaConta tco;

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
    
    
    
    public GerenciadorCliente() {
        
    }
    
    public void GerarTelaInicial(){
        ti = new TelaInicial(c);
    }
    
    public void GerarTelaCadastro(String cpf){
        tc = new TelaCadastro(cpf,c);
    }
    
    public void GerarTelaConta(Cliente c){
        tco = new TelaConta(c);
        System.out.println(c.getNome());
        System.out.println(c.getCpf());
        System.out.println(c.getGenero());
        System.out.println(c.getDataNascimento());
        System.out.println(c.getEmail());
        System.out.println(c.getEndereco());
        System.out.println(c.getNome());
        System.out.println(c.getTelefone());
        System.out.println(c.getSenha());
    }
}
