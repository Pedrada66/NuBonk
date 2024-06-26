/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.GerenciadorCliente;
import Model.Cliente;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class TelaInicial extends javax.swing.JFrame {
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
    public TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public TelaInicial(Cliente c) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void VerificaSenhaAdm(char[] senha){
        System.out.println(senha);
        char[] senhaCorreta = {'3','1','2'};
        boolean passwordMatches = Arrays.equals(senha, senhaCorreta);
        if(passwordMatches){
            System.out.println("Adm");
            dispose();
            TelaAdm ta = new TelaAdm();
        }
        else{
            System.out.println("Senha incorreta");
            JOptionPane.showMessageDialog(this, "Senha Incorreta",
                        "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private int VerificaPreenchimento(){
        try{
            if((FtxtCpf.getText()).isEmpty()){
                JOptionPane.showMessageDialog(this, "Preencha todos os dados",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                return 1;
            }
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
        try{
            if((new String(TxtSenha.getPassword())).isEmpty()){
                JOptionPane.showMessageDialog(this, "Preencha todos os dados",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                return 1;
            }
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
        return 0;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RotCpf = new javax.swing.JLabel();
        RotSenha = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JPasswordField();
        BtLogin = new javax.swing.JButton();
        BtCadastro = new javax.swing.JButton();
        FtxtCpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        RotCpf.setText("CPF:");

        RotSenha.setText("Senha:");

        BtLogin.setText("Login");
        BtLogin.setActionCommand("BtLogin");
        BtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLoginActionPerformed(evt);
            }
        });

        BtCadastro.setText("Cadastrar-se");
        BtCadastro.setActionCommand("BtCadastro");
        BtCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastroActionPerformed(evt);
            }
        });

        try {
            FtxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RotSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(RotCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FtxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RotCpf)
                    .addComponent(FtxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RotSenha)
                    .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(BtLogin)
                .addGap(32, 32, 32)
                .addComponent(BtCadastro)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        BtCadastro.getAccessibleContext().setAccessibleName("Cadastro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLoginActionPerformed
        // TODO add your handling code here:
        String cpf = (String) FtxtCpf.getValue();
        char[] senha = TxtSenha.getPassword();
        //colocar isso em um método verificaCadastro (Controller)
        int i = VerificaPreenchimento();
        if(i == 0){
            switch(cpf){
                case "000.000.000-00" -> {
                    VerificaSenhaAdm(senha);
                }
                default -> {
                    dispose();
                    TelaPrincipal tp = new TelaPrincipal();
                }
            }
        }
        //colocar um método verifica senha (controller)
    }//GEN-LAST:event_BtLoginActionPerformed

    private void BtCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastroActionPerformed
        // TODO add your handling code here:
        dispose();
        String cpf = (String) FtxtCpf.getValue();
        GerenciadorCliente gc = new GerenciadorCliente();
        gc.GerarTelaCadastro(cpf);
    }//GEN-LAST:event_BtCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastro;
    private javax.swing.JButton BtLogin;
    private javax.swing.JFormattedTextField FtxtCpf;
    private javax.swing.JLabel RotCpf;
    private javax.swing.JLabel RotSenha;
    private javax.swing.JPasswordField TxtSenha;
    // End of variables declaration//GEN-END:variables
}
