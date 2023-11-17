/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI.jabocUI_Funcionarios;

import jaboc_Biblioteca.glasspanepopup.GlassPanePopup;
import jaboc_UI.jabocUI_Funcionarios.interface_exibirFuncionarios;
import jaboc_Classes.Conta_Cliente;
import jaboc_Classes.listaFuncionarios;
import jaboc_Classes.listaProdutos;
import jaboc_UI.jabocUI_Utilidades.interface_mensagen;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class interface_editarFuncionario extends javax.swing.JFrame {

    private listaFuncionarios listaFuncionarios;
    private listaProdutos listaProdutos;
    private Conta_Cliente Conta_Cliente;
    private int indiceFuncionario;

    /**
     * Creates new form interface_editarFuncionario
     */
    public interface_editarFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
        GlassPanePopup.install(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        verificarSenha_Funcionario = new javax.swing.JTextField();
        verificarFuncionario = new javax.swing.JButton();
        verificarCPF_Funcionario = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nomeFuncionario_Editar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        enderecoFuncionario_Editar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cargoFuncionario_Editar = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cpfFuncionario_Editar = new javax.swing.JFormattedTextField();
        telefoneFuncionario_Editar = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        sair_EditarFuncionario = new javax.swing.JButton();
        editarFuncionario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(164, 144, 124));

        jPanel1.setBackground(new java.awt.Color(141, 123, 104));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha:");

        verificarSenha_Funcionario.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        verificarSenha_Funcionario.setForeground(new java.awt.Color(79, 84, 101));
        verificarSenha_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarSenha_FuncionarioActionPerformed(evt);
            }
        });

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

        verificarCPF_Funcionario.setForeground(new java.awt.Color(79, 84, 101));
        verificarCPF_Funcionario.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(verificarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(verificarCPF_Funcionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verificarSenha_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verificarSenha_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verificarCPF_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verificarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(141, 123, 104));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome:");

        nomeFuncionario_Editar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        nomeFuncionario_Editar.setForeground(new java.awt.Color(79, 84, 101));
        nomeFuncionario_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFuncionario_EditarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");

        enderecoFuncionario_Editar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        enderecoFuncionario_Editar.setForeground(new java.awt.Color(79, 84, 101));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");

        cargoFuncionario_Editar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        cargoFuncionario_Editar.setForeground(new java.awt.Color(79, 84, 101));
        cargoFuncionario_Editar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cozinheiro(a)", "Auxiliar de Cozinha", "Garçom", "Balconista", "Faxineiro(a)", "Administrador" }));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cargo:");

        cpfFuncionario_Editar.setForeground(new java.awt.Color(79, 84, 101));
        cpfFuncionario_Editar.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        telefoneFuncionario_Editar.setForeground(new java.awt.Color(79, 84, 101));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeFuncionario_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoFuncionario_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(cpfFuncionario_Editar)
                            .addComponent(telefoneFuncionario_Editar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cargoFuncionario_Editar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFuncionario_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfFuncionario_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoFuncionario_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneFuncionario_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cargoFuncionario_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 231));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo4.png"))); // NOI18N
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        sair_EditarFuncionario.setBackground(new java.awt.Color(252, 252, 252));
        sair_EditarFuncionario.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        sair_EditarFuncionario.setForeground(new java.awt.Color(79, 84, 101));
        sair_EditarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_back.png"))); // NOI18N
        sair_EditarFuncionario.setText("   Voltar");
        sair_EditarFuncionario.setBorderPainted(false);
        sair_EditarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair_EditarFuncionario.setFocusPainted(false);
        sair_EditarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sair_EditarFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sair_EditarFuncionarioMouseExited(evt);
            }
        });
        sair_EditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_EditarFuncionarioActionPerformed(evt);
            }
        });

        editarFuncionario.setBackground(new java.awt.Color(79, 84, 101));
        editarFuncionario.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        editarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        editarFuncionario.setText("Enviar");
        editarFuncionario.setBorderPainted(false);
        editarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sair_EditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sair_EditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_edFuncionario.png"))); // NOI18N
        jLabel7.setText(" EDITAR FUNCIONÁRIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
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

    private void editarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarFuncionarioActionPerformed
        if ("".equals(nomeFuncionario_Editar.getText()) || "   .   .   -  ".equals(cpfFuncionario_Editar.getText())
                || "".equals(enderecoFuncionario_Editar.getText()) || "(  )      -    ".equals(telefoneFuncionario_Editar.getText())
                || "".equals(cargoFuncionario_Editar.getSelectedItem())) {
            GlassPanePopup.showPopup(new interface_mensagen());
        } else {
            listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().setNomeFuncionario(nomeFuncionario_Editar.getText());
            listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().setCpfFuncionario(cpfFuncionario_Editar.getText());
            listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().setEnderecoFuncionario(enderecoFuncionario_Editar.getText());
            listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().setTelefoneFuncionario(telefoneFuncionario_Editar.getText());
            listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().setCargoFuncionario(String.valueOf(cargoFuncionario_Editar.getSelectedItem()));

            JOptionPane.showMessageDialog(null, listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().toString(), "Funcionário editado!", JOptionPane.INFORMATION_MESSAGE);

            nomeFuncionario_Editar.setText("");
            cpfFuncionario_Editar.setText("");
            enderecoFuncionario_Editar.setText("");
            telefoneFuncionario_Editar.setText("");
            cargoFuncionario_Editar.setSelectedItem("Cozinheiro(a)");

            jPanel2.setVisible(false);
            editarFuncionario.setVisible(false);
        }

    }//GEN-LAST:event_editarFuncionarioActionPerformed

    private void nomeFuncionario_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFuncionario_EditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncionario_EditarActionPerformed

    private void sair_EditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_EditarFuncionarioActionPerformed
        interface_exibirFuncionarios exibirFuncionarios = new interface_exibirFuncionarios();
        exibirFuncionarios.setVisible(true);
        exibirFuncionarios.recebeListaFuncionarios(listaFuncionarios);
        exibirFuncionarios.recebeListaProdutos(listaProdutos);
        exibirFuncionarios.recebeConta(Conta_Cliente);
        this.dispose();
    }//GEN-LAST:event_sair_EditarFuncionarioActionPerformed

    private void verificarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarFuncionarioActionPerformed

        if (listaFuncionarios != null) {
            indiceFuncionario = listaFuncionarios.buscarContaFuncionario(verificarCPF_Funcionario.getText(), listaFuncionarios.getNAtualElementos(), -1);

            if (indiceFuncionario != - 1 && verificarSenha_Funcionario.getText().equals(listaFuncionarios.getItem(indiceFuncionario).getSenha())) {
                verificarCPF_Funcionario.setText("");
                verificarSenha_Funcionario.setText("");

                jPanel2.setVisible(true);
                editarFuncionario.setVisible(true);

                nomeFuncionario_Editar.setText(listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().getNomeFuncionario());
                cpfFuncionario_Editar.setText(listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().getCpfFuncionario());
                enderecoFuncionario_Editar.setText(listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().getEnderecoFuncionario());
                telefoneFuncionario_Editar.setText(listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().getTelefoneFuncionario());
                cargoFuncionario_Editar.setSelectedItem(listaFuncionarios.getItem(indiceFuncionario).getTitularFuncionario().getCargoFuncionario());

            } else if (indiceFuncionario == -1) {
                JOptionPane.showMessageDialog(null, "CPF inexistente!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há funcionários cadastrados!", "Erro", WIDTH);
        }
    }//GEN-LAST:event_verificarFuncionarioActionPerformed

    private void verificarSenha_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarSenha_FuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verificarSenha_FuncionarioActionPerformed

    private void sair_EditarFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sair_EditarFuncionarioMouseEntered
        sair_EditarFuncionario.setBackground(new Color(237, 237, 237));
    }//GEN-LAST:event_sair_EditarFuncionarioMouseEntered

    private void sair_EditarFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sair_EditarFuncionarioMouseExited
        sair_EditarFuncionario.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_sair_EditarFuncionarioMouseExited
    public void receberListaFuncionarios(listaFuncionarios listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void receberListaProdutos(listaProdutos listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void recebeConta(Conta_Cliente Conta_Cliente) {
        this.Conta_Cliente = Conta_Cliente;
    }

    public javax.swing.JPanel getJPanel2() {
        return this.jPanel2;
    }

    public javax.swing.JButton getBTNEditarFuncionario() {
        return this.editarFuncionario;
    }

    public javax.swing.JFormattedTextField getVerificarCPF_Funcionario() {
        return this.verificarCPF_Funcionario;
    }

    public javax.swing.JFormattedTextField getCpfFuncionario_Editar() {
        return this.cpfFuncionario_Editar;
    }

    public javax.swing.JFormattedTextField getTelefoneFuncionario_Editar() {
        return this.telefoneFuncionario_Editar;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cargoFuncionario_Editar;
    private javax.swing.JFormattedTextField cpfFuncionario_Editar;
    private javax.swing.JButton editarFuncionario;
    private javax.swing.JTextField enderecoFuncionario_Editar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nomeFuncionario_Editar;
    private javax.swing.JButton sair_EditarFuncionario;
    private javax.swing.JFormattedTextField telefoneFuncionario_Editar;
    private javax.swing.JFormattedTextField verificarCPF_Funcionario;
    private javax.swing.JButton verificarFuncionario;
    private javax.swing.JTextField verificarSenha_Funcionario;
    // End of variables declaration//GEN-END:variables
}
