/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI.jabocUI_Funcionarios;

import jaboc_Biblioteca.glasspanepopup.GlassPanePopup;
import jaboc_UI.jabocUI_Funcionarios.interface_exibirFuncionarios;
import jaboc_Classes.Conta_Cliente;
import jaboc_Classes.Funcionario;
import jaboc_Classes.Conta_Funcionario;
import jaboc_Classes.listaFuncionarios;
import jaboc_Classes.listaProdutos;
import jaboc_UI.jabocUI_Utilidades.interface_mensagen;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author eeuar
 */
public class interface_criarFuncionario extends javax.swing.JFrame {

    private Funcionario Funcionario;
    private int Id_ContaFuncionario = 1;
    private listaFuncionarios listaFuncionarios;
    private listaProdutos listaProdutos;
    private Conta_Cliente Conta_Cliente;

    /**
     * Creates new form NewJFrame
     */
    public interface_criarFuncionario() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nomeFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cargoFuncionario = new javax.swing.JComboBox<>();
        enderecoFuncionario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        senhaFuncionario = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        verificarSenhaFuncionario = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        cpfFuncionario = new javax.swing.JFormattedTextField();
        telefoneFuncionario = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        sair_criarFuncionario2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        criarFuncionario2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(164, 144, 124));
        jPanel3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(141, 123, 104));

        nomeFuncionario.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        nomeFuncionario.setForeground(new java.awt.Color(79, 84, 101));
        nomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFuncionarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargo:");

        cargoFuncionario.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        cargoFuncionario.setForeground(new java.awt.Color(79, 84, 101));
        cargoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cozinheiro(a)", "Auxiliar de Cozinha", "Garçom", "Balconista", "Faxineiro(a)", "Administrador" }));
        cargoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoFuncionarioActionPerformed(evt);
            }
        });

        enderecoFuncionario.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        enderecoFuncionario.setForeground(new java.awt.Color(79, 84, 101));
        enderecoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoFuncionarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Endereço");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone");

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 84, 101));
        jLabel1.setText("Crie uma senha:");

        senhaFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senhaFuncionario.setForeground(new java.awt.Color(79, 84, 101));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(79, 84, 101));
        jLabel8.setText("Informe a senha novamente:");

        verificarSenhaFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        verificarSenhaFuncionario.setForeground(new java.awt.Color(79, 84, 101));

        cpfFuncionario.setForeground(new java.awt.Color(79, 84, 101));
        cpfFuncionario.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        cpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfFuncionarioActionPerformed(evt);
            }
        });

        telefoneFuncionario.setForeground(new java.awt.Color(79, 84, 101));
        telefoneFuncionario.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(verificarSenhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(cargoFuncionario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel8)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(nomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(telefoneFuncionario))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(cpfFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(enderecoFuncionario))))
                    .addComponent(senhaFuncionario))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(cargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verificarSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_addFuncionario2.png"))); // NOI18N
        jLabel9.setText("CRIAR FUNCIONÁRIO");

        jPanel5.setBackground(new java.awt.Color(252, 252, 252));

        sair_criarFuncionario2.setBackground(new java.awt.Color(252, 252, 252));
        sair_criarFuncionario2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        sair_criarFuncionario2.setForeground(new java.awt.Color(79, 84, 101));
        sair_criarFuncionario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_back.png"))); // NOI18N
        sair_criarFuncionario2.setText("   Voltar");
        sair_criarFuncionario2.setBorderPainted(false);
        sair_criarFuncionario2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair_criarFuncionario2.setFocusPainted(false);
        sair_criarFuncionario2.setFocusable(false);
        sair_criarFuncionario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sair_criarFuncionario2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sair_criarFuncionario2MouseExited(evt);
            }
        });
        sair_criarFuncionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_criarFuncionarioActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo4.png"))); // NOI18N
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        criarFuncionario2.setBackground(new java.awt.Color(79, 84, 101));
        criarFuncionario2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        criarFuncionario2.setForeground(new java.awt.Color(255, 255, 255));
        criarFuncionario2.setText("Enviar");
        criarFuncionario2.setBorderPainted(false);
        criarFuncionario2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        criarFuncionario2.setFocusPainted(false);
        criarFuncionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(criarFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sair_criarFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sair_criarFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(criarFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void recebeListaFuncionarios(listaFuncionarios listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;

        if (this.listaFuncionarios.getNAtualElementos() > 0) {
            Id_ContaFuncionario = this.listaFuncionarios.ultimoItem(0).getIdFuncionario() + 1;
        }
    }

    public void recebeListaProdutos(listaProdutos listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void recebeConta(Conta_Cliente Conta_Cliente) {
        this.Conta_Cliente = Conta_Cliente;
    }
    private void enderecoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoFuncionarioActionPerformed

    private void nomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncionarioActionPerformed

    private void cargoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoFuncionarioActionPerformed

    private void cpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFuncionarioActionPerformed

    }//GEN-LAST:event_cpfFuncionarioActionPerformed

    private void criarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarFuncionarioActionPerformed
        if (!"".equals(nomeFuncionario.getText()) && !"   .   .   -  ".equals(cpfFuncionario.getText()) && !"".equals(enderecoFuncionario.getText()) && !"(  )      -    ".equals(telefoneFuncionario.getText())) {

            if (senhaFuncionario.getText().equals(verificarSenhaFuncionario.getText()) && !senhaFuncionario.getText().equals("")) {
                Funcionario = new Funcionario(nomeFuncionario.getText(), cpfFuncionario.getText(), enderecoFuncionario.getText(), telefoneFuncionario.getText(),
                        String.valueOf(cargoFuncionario.getSelectedItem()));

                listaFuncionarios.inserirItem(new Conta_Funcionario(Id_ContaFuncionario++, Funcionario, senhaFuncionario.getText()));
                JOptionPane.showMessageDialog(null, Funcionario.toString(), "Funcionário cadastrado!", WIDTH);
                nomeFuncionario.setText("");
                cpfFuncionario.setText("");
                enderecoFuncionario.setText("");
                telefoneFuncionario.setText("");
                senhaFuncionario.setText("");
                verificarSenhaFuncionario.setText("");
                cargoFuncionario.setSelectedItem("Cozinheiro(a)");
            } else {
                JOptionPane.showMessageDialog(null, "Senhas informadas incorretamente!", "Erro", WIDTH);
                senhaFuncionario.setText("");
                verificarSenhaFuncionario.setText("");
            }

        } else {
            GlassPanePopup.showPopup(new interface_mensagen());
        }
    }//GEN-LAST:event_criarFuncionarioActionPerformed

    private void sair_criarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_criarFuncionarioActionPerformed
        interface_exibirFuncionarios exibirFuncionarios = new interface_exibirFuncionarios();
        exibirFuncionarios.setVisible(true);
        exibirFuncionarios.recebeListaFuncionarios(listaFuncionarios);
        exibirFuncionarios.recebeListaProdutos(listaProdutos);
        exibirFuncionarios.recebeConta(Conta_Cliente);
        this.dispose();
    }//GEN-LAST:event_sair_criarFuncionarioActionPerformed

    private void sair_criarFuncionario2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sair_criarFuncionario2MouseEntered
        sair_criarFuncionario2.setBackground(new Color(237, 237, 237));
    }//GEN-LAST:event_sair_criarFuncionario2MouseEntered

    private void sair_criarFuncionario2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sair_criarFuncionario2MouseExited
        sair_criarFuncionario2.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_sair_criarFuncionario2MouseExited
    public javax.swing.JFormattedTextField getCpfFuncionario() {
        return this.cpfFuncionario;
    }

    public javax.swing.JFormattedTextField getTelefoneFuncionario() {
        return this.telefoneFuncionario;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cargoFuncionario;
    private javax.swing.JFormattedTextField cpfFuncionario;
    private javax.swing.JButton criarFuncionario2;
    private javax.swing.JTextField enderecoFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomeFuncionario;
    private javax.swing.JButton sair_criarFuncionario2;
    private javax.swing.JPasswordField senhaFuncionario;
    private javax.swing.JFormattedTextField telefoneFuncionario;
    private javax.swing.JPasswordField verificarSenhaFuncionario;
    // End of variables declaration//GEN-END:variables
}
