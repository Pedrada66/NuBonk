/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.GerenciadorCliente;
import Model.Cliente;

/**
 *
 * @author pedro
 */
public class TelaPrincipal extends javax.swing.JFrame {
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public TelaPrincipal(Cliente c) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setCliente(c);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtConta = new javax.swing.JButton();
        BtInvestimentos = new javax.swing.JButton();
        BtDepositos = new javax.swing.JButton();
        BtFaq = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BtConta.setText("Conta");
        BtConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtContaActionPerformed(evt);
            }
        });

        BtInvestimentos.setText("Investimentos");
        BtInvestimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInvestimentosActionPerformed(evt);
            }
        });

        BtDepositos.setText("Depósitos");
        BtDepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDepositosActionPerformed(evt);
            }
        });

        BtFaq.setText("FAQ");
        BtFaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFaqActionPerformed(evt);
            }
        });

        BtSair.setText("Sair da conta");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtInvestimentos, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(BtConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtDepositos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtFaq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BtConta)
                .addGap(37, 37, 37)
                .addComponent(BtInvestimentos)
                .addGap(37, 37, 37)
                .addComponent(BtDepositos)
                .addGap(37, 37, 37)
                .addComponent(BtFaq)
                .addGap(37, 37, 37)
                .addComponent(BtSair)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtContaActionPerformed
        // TODO add your handling code here:
        dispose();
        GerenciadorCliente gc = new GerenciadorCliente();
        gc.GerarTelaConta(cliente);
    }//GEN-LAST:event_BtContaActionPerformed

    private void BtInvestimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInvestimentosActionPerformed
        // TODO add your handling code here:
        //setVisible(false);
        dispose();
        TelaInvestimentos ti = new TelaInvestimentos();
    }//GEN-LAST:event_BtInvestimentosActionPerformed

    private void BtDepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDepositosActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaDeposito td = new TelaDeposito();
    }//GEN-LAST:event_BtDepositosActionPerformed

    private void BtFaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFaqActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaFAQ tf = new TelaFAQ();
    }//GEN-LAST:event_BtFaqActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        // TODO add your handling code here:
        //criar método na classe do DAO para desconectar conta
        dispose();
        TelaInicial ti = new TelaInicial();
    }//GEN-LAST:event_BtSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtConta;
    private javax.swing.JButton BtDepositos;
    private javax.swing.JButton BtFaq;
    private javax.swing.JButton BtInvestimentos;
    private javax.swing.JButton BtSair;
    // End of variables declaration//GEN-END:variables
}
