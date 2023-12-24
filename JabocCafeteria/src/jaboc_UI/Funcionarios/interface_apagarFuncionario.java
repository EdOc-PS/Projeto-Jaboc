/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI.Funcionarios;

import jaboc_UI.Funcionarios.interface_exibirFuncionarios;
import jaboc_Classes.Conta_Cliente;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class interface_apagarFuncionario extends javax.swing.JFrame {
    /**
     * Creates new form interface_apagarFuncionario
     */
    public interface_apagarFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        verificarFuncionario = new javax.swing.JButton();
        verificarCPF_Funcionario = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Funcionario = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        sair_ApagarFuncionario = new javax.swing.JButton();
        apagarFuncionario = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(164, 144, 124));

        jPanel1.setBackground(new java.awt.Color(141, 123, 104));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPF do Funcionário:");

        verificarFuncionario.setBackground(new java.awt.Color(79, 84, 101));
        verificarFuncionario.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        verificarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        verificarFuncionario.setText("Verificar");
        verificarFuncionario.setBorderPainted(false);
        verificarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarFuncionarioActionPerformed(evt);
            }
        });

        verificarCPF_Funcionario.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(verificarCPF_Funcionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verificarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(verificarCPF_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verificarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(141, 123, 104));

        txtArea_Funcionario.setColumns(20);
        txtArea_Funcionario.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        txtArea_Funcionario.setRows(5);
        jScrollPane1.setViewportView(txtArea_Funcionario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));
        jPanel4.setPreferredSize(new java.awt.Dimension(243, 237));

        sair_ApagarFuncionario.setBackground(new java.awt.Color(252, 252, 252));
        sair_ApagarFuncionario.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        sair_ApagarFuncionario.setForeground(new java.awt.Color(79, 84, 101));
        sair_ApagarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_back.png"))); // NOI18N
        sair_ApagarFuncionario.setText("   Voltar");
        sair_ApagarFuncionario.setBorderPainted(false);
        sair_ApagarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sair_ApagarFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sair_ApagarFuncionarioMouseExited(evt);
            }
        });
        sair_ApagarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_ApagarFuncionarioActionPerformed(evt);
            }
        });

        apagarFuncionario.setBackground(new java.awt.Color(79, 84, 101));
        apagarFuncionario.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        apagarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        apagarFuncionario.setText("Apagar");
        apagarFuncionario.setBorderPainted(false);
        apagarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarFuncionarioActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo4.png"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apagarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sair_ApagarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sair_ApagarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(apagarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_deletarF2.png"))); // NOI18N
        jLabel2.setText(" APAGAR FUNCIONÁRIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void verificarCPF_FuncionarioActionPerformed(java.awt.event.ActionEvent evt){
         
     };   
    private void apagarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarFuncionarioActionPerformed
    
    }//GEN-LAST:event_apagarFuncionarioActionPerformed

    private void verificarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarFuncionarioActionPerformed
       
    }//GEN-LAST:event_verificarFuncionarioActionPerformed

    private void sair_ApagarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_ApagarFuncionarioActionPerformed
       
    }//GEN-LAST:event_sair_ApagarFuncionarioActionPerformed

    private void sair_ApagarFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sair_ApagarFuncionarioMouseEntered
       sair_ApagarFuncionario.setBackground(new Color(237, 237, 237));
    }//GEN-LAST:event_sair_ApagarFuncionarioMouseEntered

    private void sair_ApagarFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sair_ApagarFuncionarioMouseExited
        sair_ApagarFuncionario.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_sair_ApagarFuncionarioMouseExited
    public void txtAreaIneditavel(){
        txtArea_Funcionario.setEditable(false);
    }
    public javax.swing.JFormattedTextField getVerificarCPF_Funcionario(){
        return this.verificarCPF_Funcionario;
    }
    public javax.swing.JPanel getJpanel2(){
        return this.jPanel2;
    }
    public javax.swing.JButton getBTNApagarFuncionario(){
        return this.apagarFuncionario;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sair_ApagarFuncionario;
    private javax.swing.JTextArea txtArea_Funcionario;
    private javax.swing.JFormattedTextField verificarCPF_Funcionario;
    private javax.swing.JButton verificarFuncionario;
    // End of variables declaration//GEN-END:variables
}
