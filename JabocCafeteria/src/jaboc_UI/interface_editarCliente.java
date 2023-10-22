/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI;

import jaboc_Classes.Conta_Cliente;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author guilh
 */
public class interface_editarCliente extends javax.swing.JFrame {
    Conta_Cliente Conta_Cliente;
    /**
     * Creates new form interface_editarCliente
     */
    public interface_editarCliente() {
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
        bVoltar = new javax.swing.JButton();
        verificarProduto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bVoltar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        editarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nomeCliente_Editar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpfCliente_Editar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enderecoCliente_Editar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefoneCliente_Editar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        verificarCPF_Cliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        verificarSenha_Cliente = new javax.swing.JTextField();
        verificarCliente = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));

        bVoltar.setBackground(new java.awt.Color(252, 252, 252));
        bVoltar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bVoltar.setForeground(new java.awt.Color(79, 84, 101));
        bVoltar.setText("Voltar");
        bVoltar.setBorderPainted(false);
        bVoltar.setFocusPainted(false);
        bVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bVoltarMouseExited(evt);
            }
        });
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        verificarProduto.setBackground(new java.awt.Color(79, 84, 101));
        verificarProduto.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        verificarProduto.setForeground(new java.awt.Color(252, 252, 252));
        verificarProduto.setText("Verificar");
        verificarProduto.setBorderPainted(false);
        verificarProduto.setFocusPainted(false);
        verificarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarProdutoActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo4.png"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButton2.setText("Editar Conta");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verificarProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verificarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(164, 144, 124));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EDITAR CLIENTE");

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));

        bVoltar1.setBackground(new java.awt.Color(252, 252, 252));
        bVoltar1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        bVoltar1.setForeground(new java.awt.Color(79, 84, 101));
        bVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_back.png"))); // NOI18N
        bVoltar1.setText("  Voltar");
        bVoltar1.setBorderPainted(false);
        bVoltar1.setFocusPainted(false);
        bVoltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bVoltar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bVoltar1MouseExited(evt);
            }
        });
        bVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltar1ActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo4.png"))); // NOI18N
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        editarCliente.setBackground(new java.awt.Color(79, 84, 101));
        editarCliente.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        editarCliente.setForeground(new java.awt.Color(252, 252, 252));
        editarCliente.setText("Enviar");
        editarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(141, 123, 104));

        nomeCliente_Editar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        nomeCliente_Editar.setForeground(new java.awt.Color(79, 84, 101));
        nomeCliente_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCliente_EditarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(79, 84, 101));
        jLabel5.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 84, 101));
        jLabel2.setText("CPF:");

        cpfCliente_Editar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        cpfCliente_Editar.setForeground(new java.awt.Color(79, 84, 101));
        cpfCliente_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfCliente_EditarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(79, 84, 101));
        jLabel3.setText("Endereço:");

        enderecoCliente_Editar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        enderecoCliente_Editar.setForeground(new java.awt.Color(79, 84, 101));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(79, 84, 101));
        jLabel4.setText("Telefone:");

        telefoneCliente_Editar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        telefoneCliente_Editar.setForeground(new java.awt.Color(79, 84, 101));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeCliente_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecoCliente_Editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfCliente_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(telefoneCliente_Editar)
                    .addComponent(jLabel4))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneCliente_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(141, 123, 104));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPF:");

        verificarCPF_Cliente.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        verificarCPF_Cliente.setForeground(new java.awt.Color(79, 84, 101));
        verificarCPF_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarCPF_ClienteActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Senha:");

        verificarSenha_Cliente.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        verificarSenha_Cliente.setForeground(new java.awt.Color(79, 84, 101));

        verificarCliente.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        verificarCliente.setText("Verificar");
        verificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(verificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(verificarCPF_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verificarSenha_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verificarCPF_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verificarSenha_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(verificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarCPF_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarCPF_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verificarCPF_ClienteActionPerformed

    private void nomeCliente_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCliente_EditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCliente_EditarActionPerformed

    private void cpfCliente_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfCliente_EditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfCliente_EditarActionPerformed

    private void verificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarClienteActionPerformed
        
        if(Conta_Cliente != null){
            if(Conta_Cliente.verificaCPF(verificarCPF_Cliente.getText()) && Conta_Cliente.verificaSenha(verificarSenha_Cliente.getText())){
                nomeCliente_Editar.setText(Conta_Cliente.getTitular().getNomeCliente());
                cpfCliente_Editar.setText(Conta_Cliente.getTitular().getCpfCliente());
                enderecoCliente_Editar.setText(Conta_Cliente.getTitular().getEnderecoCliente());
                telefoneCliente_Editar.setText(Conta_Cliente.getTitular().getTelefoneCliente());
            }else if(!Conta_Cliente.verificaCPF(verificarCPF_Cliente.getText())){
                JOptionPane.showMessageDialog(null,"CPF inexistente!", "Erro", WIDTH);
            }else{
                JOptionPane.showMessageDialog(null,"Senha incorreta!", "Erro", WIDTH);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Cliente cadastrado!","Erro",WIDTH);
        }    
    }//GEN-LAST:event_verificarClienteActionPerformed

    private void editarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarClienteActionPerformed
        if(Conta_Cliente == null){
            JOptionPane.showMessageDialog(null, "Nenhum Cliente cadastrado!", "Erro", WIDTH);
        }     
        else if("".equals(nomeCliente_Editar.getText()) || "".equals(cpfCliente_Editar.getText()) || "".equals(enderecoCliente_Editar.getText()) || "".equals(telefoneCliente_Editar.getText())){
            JOptionPane.showMessageDialog(null,"Os campos estão vazios!","Erro",WIDTH);
        }else{
            Conta_Cliente.getTitular().setNomeCliente(nomeCliente_Editar.getText());
            Conta_Cliente.getTitular().setCpfCliente(cpfCliente_Editar.getText());
            Conta_Cliente.getTitular().setEnderecoCliente(enderecoCliente_Editar.getText());
            Conta_Cliente.getTitular().setTelefoneCliente(telefoneCliente_Editar.getText());

            nomeCliente_Editar.setText("");
            cpfCliente_Editar.setText("");
            enderecoCliente_Editar.setText("");
            telefoneCliente_Editar.setText("");
        }
    }//GEN-LAST:event_editarClienteActionPerformed

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        bVoltar1.setBackground(new Color (237,237,237));
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        bVoltar1.setBackground(new Color(252,252,252));
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        interface_Menu iM = new interface_Menu();
        iM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void verificarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarProdutoActionPerformed
   
    }//GEN-LAST:event_verificarProdutoActionPerformed

    private void bVoltar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltar1MouseEntered
        bVoltar.setBackground(new Color (237,237,237));
    }//GEN-LAST:event_bVoltar1MouseEntered

    private void bVoltar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltar1MouseExited
        bVoltar.setBackground(new Color(252,252,252));
    }//GEN-LAST:event_bVoltar1MouseExited

    private void bVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltar1ActionPerformed
        interface_Menu iM = new interface_Menu();
        iM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVoltar1ActionPerformed
    public void recebeConta(Conta_Cliente C){
        Conta_Cliente = C;
    }
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVoltar;
    private javax.swing.JButton bVoltar1;
    private javax.swing.JTextField cpfCliente_Editar;
    private javax.swing.JButton editarCliente;
    private javax.swing.JTextField enderecoCliente_Editar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField nomeCliente_Editar;
    private javax.swing.JTextField telefoneCliente_Editar;
    private javax.swing.JTextField verificarCPF_Cliente;
    private javax.swing.JButton verificarCliente;
    private javax.swing.JButton verificarProduto;
    private javax.swing.JTextField verificarSenha_Cliente;
    // End of variables declaration//GEN-END:variables
}
