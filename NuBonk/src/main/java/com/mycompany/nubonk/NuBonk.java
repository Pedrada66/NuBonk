/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nubonk;

//import Controller.GerenciadorInicial;
import Controller.GerenciadorCliente;
import View.TelaAdm;
import View.TelaInicial;

/**
 *
 * @author pedro
 */
public class NuBonk {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        GerenciadorCliente gc = new GerenciadorCliente();
        gc.GerarTelaInicial();
    }
}
