/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nubonk;

//import Controller.GerenciadorInicial;
import Controller.GerenciadorCliente;
import Controller.GerenciadorDAO;
import View.TelaAdm;
import View.TelaInicial;

/**
 *
 * @author pedro
 */
public class NuBonk {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerenciadorCliente gc = new GerenciadorCliente();
                gc.GerarTelaInicial();
                GerenciadorDAO gd = new GerenciadorDAO();
                gd.inserirInvestimento();
            }
        });
    }
}
