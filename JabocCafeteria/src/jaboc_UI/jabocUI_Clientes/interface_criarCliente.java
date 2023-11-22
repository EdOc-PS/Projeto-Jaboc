package jaboc_UI.jabocUI_Clientes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import jaboc_Biblioteca.glasspanepopup.GlassPanePopup;
import jaboc_Classes.Cliente;
import jaboc_Classes.Conta_Cliente;
import jaboc_Classes.listaFuncionarios;
import jaboc_Classes.listaProdutos;
import jaboc_UI.jabocUI_Administrador.interface_Menu;
import jaboc_UI.jabocUI_Utilidades.interface_popUpmensagen;
import jaboc_UI.jabocUI_Utilidades.interface_popUpSenha;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author guilh
 */
public class interface_criarCliente extends javax.swing.JFrame {

    /**
     * Creates new form interfaceCliente
     */
    public interface_criarCliente() {
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

        jLabel8 = new javax.swing.JLabel();
        textField1 = new jaboc_UI.jabocUI_Utilidades.TextField();
        textField2 = new jaboc_UI.jabocUI_Utilidades.TextField();
        textField3 = new jaboc_UI.jabocUI_Utilidades.TextField();
        textField4 = new jaboc_UI.jabocUI_Utilidades.TextField();
        textField5 = new jaboc_UI.jabocUI_Utilidades.TextField();
        textField6 = new jaboc_UI.jabocUI_Utilidades.TextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bVoltar = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        buttonCirculo1 = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        jLabel5 = new javax.swing.JLabel();
        panel1 = new jaboc_UI.jabocUI_Utilidades.Panel();
        nomeCliente = new jaboc_UI.jabocUI_Utilidades.TextField();
        enderecoCliente = new jaboc_UI.jabocUI_Utilidades.TextField();
        cpfCliente = new jaboc_UI.jabocUI_Utilidades.TextField();
        telefoneCliente = new jaboc_UI.jabocUI_Utilidades.TextField();
        panel2 = new jaboc_UI.jabocUI_Utilidades.Panel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        senhaCliente = new jaboc_UI.jabocUI_Utilidades.PasswordField();
        verificarSenhaCliente = new jaboc_UI.jabocUI_Utilidades.PasswordField();
        panel3 = new jaboc_UI.jabocUI_Utilidades.Panel();
        jLabel6 = new javax.swing.JLabel();
        loginAcess = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(164, 144, 124));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 510));

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo4.png"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        bVoltar.setBackground(new java.awt.Color(252, 252, 252));
        bVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_back.png"))); // NOI18N
        bVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        buttonCirculo1.setBackground(new java.awt.Color(79, 84, 101));
        buttonCirculo1.setForeground(new java.awt.Color(252, 252, 252));
        buttonCirculo1.setText("Cadastrar");
        buttonCirculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCirculo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(buttonCirculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCirculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        buttonCirculo1.getAccessibleContext().setAccessibleName("Criar conta");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_user.png"))); // NOI18N
        jLabel5.setText(" CRIAR CONTA");

        panel1.setBackground(new java.awt.Color(141, 123, 104));

        nomeCliente.setText(" Nome:");
        nomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeClienteFocusLost(evt);
            }
        });
        nomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteActionPerformed(evt);
            }
        });

        enderecoCliente.setText(" Endereço:");
        enderecoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enderecoClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enderecoClienteFocusLost(evt);
            }
        });
        enderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoClienteActionPerformed(evt);
            }
        });

        cpfCliente.setText(" CPF:");
        cpfCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfClienteFocusLost(evt);
            }
        });
        cpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteActionPerformed(evt);
            }
        });

        telefoneCliente.setText(" Telefone:");
        telefoneCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefoneClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefoneClienteFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefoneCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(telefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(enderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(141, 123, 104));

        jLabel16.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(79, 84, 101));
        jLabel16.setText("Senha:");

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(79, 84, 101));
        jLabel17.setText("Repita a senha:");

        senhaCliente.setText(" Senha:");
        senhaCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaClienteFocusLost(evt);
            }
        });

        verificarSenhaCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                verificarSenhaClienteFocusGained(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(verificarSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verificarSenhaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        panel3.setBackground(new java.awt.Color(252, 252, 252));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Quer criar uma conta?");

        loginAcess.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        loginAcess.setForeground(new java.awt.Color(153, 0, 153));
        loginAcess.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginAcess.setText("Clique aqui");
        loginAcess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginAcess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginAcessMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginAcessMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginAcessMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(loginAcess, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(loginAcess))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JTextField CPF() {
        try {
            javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter(" ###.###.###-##");
            return new javax.swing.JFormattedTextField(cpf);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");

            return new JTextField();
        }
    }

    private JTextField Telefone() {
        try {
            javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter(" (##) #####-####");
            return new javax.swing.JFormattedTextField(cpf);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
            return new JTextField();
        }
    }

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        interface_Menu i_Menu = new interface_Menu();
        i_Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        bVoltar.setBackground(new Color(237, 237, 237));
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        bVoltar.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bVoltarMouseExited

    private void enderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoClienteActionPerformed

    private void buttonCirculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCirculo1ActionPerformed
        if (!"".equals(nomeCliente.getText()) && !"    .   .   -  ".equals(cpfCliente.getText()) && !"".equals(enderecoCliente.getText())
                && !" (  )      -    ".equals(telefoneCliente.getText())) {

            if (String.valueOf(senhaCliente.getPassword()).equals(String.valueOf(verificarSenhaCliente.getPassword())) && !String.valueOf(senhaCliente.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "ID da conta: " + IdConta + "\n" + Cliente.toString(), "Conta cadastrada!", WIDTH);

                interface_Cardapio i_Cardapio = new interface_Cardapio();
                i_Cardapio.setVisible(true);
                i_Cardapio.recebeConta(Conta_Cliente);
                this.dispose();

            } else {
                GlassPanePopup.showPopup(new interface_popUpSenha());
                senhaCliente.setText("");
                verificarSenhaCliente.setText("");
            }
        } else {
            GlassPanePopup.showPopup(new interface_popUpmensagen());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCirculo1ActionPerformed

    private void loginAcessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginAcessMouseClicked
        interface_criarCliente i_cCliente = new interface_criarCliente();
        i_cCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginAcessMouseClicked

    private void loginAcessMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginAcessMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAcessMouseEntered

    private void loginAcessMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginAcessMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAcessMousePressed




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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interface_criarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_criarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_criarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_criarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_criarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bVoltar;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo buttonCirculo1;
    private jaboc_UI.jabocUI_Utilidades.TextField cpfCliente;
    private jaboc_UI.jabocUI_Utilidades.TextField enderecoCliente;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel loginAcess;
    private jaboc_UI.jabocUI_Utilidades.TextField nomeCliente;
    private jaboc_UI.jabocUI_Utilidades.Panel panel1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel2;
    private jaboc_UI.jabocUI_Utilidades.Panel panel3;
    private jaboc_UI.jabocUI_Utilidades.PasswordField senhaCliente;
    private jaboc_UI.jabocUI_Utilidades.TextField telefoneCliente;
    private jaboc_UI.jabocUI_Utilidades.TextField textField1;
    private jaboc_UI.jabocUI_Utilidades.TextField textField2;
    private jaboc_UI.jabocUI_Utilidades.TextField textField3;
    private jaboc_UI.jabocUI_Utilidades.TextField textField4;
    private jaboc_UI.jabocUI_Utilidades.TextField textField5;
    private jaboc_UI.jabocUI_Utilidades.TextField textField6;
    private jaboc_UI.jabocUI_Utilidades.PasswordField verificarSenhaCliente;
    // End of variables declaration//GEN-END:variables
}
