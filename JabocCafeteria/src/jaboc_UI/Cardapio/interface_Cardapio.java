/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI.Cardapio;

import jaboc_Biblioteca.outras.ModernScrollBarUI;
import jaboc_UI.Clientes.interface_editarCliente;
import jaboc_UI.Clientes.interface_menuCliente;
import jaboc_UI.JabocUI_Utilidades.JabocUI_popUp.PopUp_mensagem;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import raven.glasspanepopup.DefaultOption;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author 0057138
 */
public class interface_Cardapio extends javax.swing.JFrame {

    public interface_Cardapio() {
        initComponents();
        setLocationRelativeTo(null);
        GlassPanePopup.install(this);

           
        JScrollBar bar = scrollCardapio.getVerticalScrollBar();
        bar.setOpaque(false);
        bar.setForeground(new Color(223, 204, 251));
        bar.setPreferredSize(new Dimension(10, 5));
        bar.setUI(new ModernScrollBarUI());

        scrollCardapio.setViewportBorder(null);
        scrollCardapio.setBorder(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table1 = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        table2 = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        table3 = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        table4 = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        table5 = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bEditar = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        bVoltar = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        bcarrinho = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        jLabel5 = new javax.swing.JLabel();
        panel1 = new jaboc_UI.jabocUI_Utilidades.Panel();
        panel2 = new jaboc_UI.jabocUI_Utilidades.Panel();
        scrollCardapio = new javax.swing.JScrollPane();
        tabelaCardapio = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();
        buttonCirculo1 = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(164, 144, 124));

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo4.png"))); // NOI18N

        bEditar.setBackground(new java.awt.Color(252, 252, 252));
        bEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_editaruser2.png"))); // NOI18N
        bEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEditarMouseExited(evt);
            }
        });
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

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

        bcarrinho.setBackground(new java.awt.Color(255, 255, 255));
        bcarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_carrinho.png"))); // NOI18N
        bcarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bcarrinhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bcarrinhoMouseExited(evt);
            }
        });
        bcarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bcarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bcarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_cardapio1.png"))); // NOI18N
        jLabel5.setText("  CARDÁPIO");

        panel1.setBackground(new java.awt.Color(200, 182, 166));

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        scrollCardapio.setBackground(new java.awt.Color(255, 255, 255));
        scrollCardapio.setBorder(null);

        tabelaCardapio.setBackground(new java.awt.Color(255, 255, 255));
        tabelaCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo", "Quantidade", "Preco"
            }
        ));
        tabelaCardapio.setFocusable(false);
        tabelaCardapio.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaCardapio.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelaCardapio.setShowGrid(false);
        tabelaCardapio.getTableHeader().setReorderingAllowed(false);
        tabelaCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaCardapioMousePressed(evt);
            }
        });
        scrollCardapio.setViewportView(tabelaCardapio);
        if (tabelaCardapio.getColumnModel().getColumnCount() > 0) {
            tabelaCardapio.getColumnModel().getColumn(0).setPreferredWidth(180);
            tabelaCardapio.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabelaCardapio.getColumnModel().getColumn(2).setPreferredWidth(35);
            tabelaCardapio.getColumnModel().getColumn(3).setPreferredWidth(35);
        }

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollCardapio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        buttonCirculo1.setBackground(new java.awt.Color(79, 84, 101));
        buttonCirculo1.setForeground(new java.awt.Color(252, 252, 252));
        buttonCirculo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_recarregar.png"))); // NOI18N
        buttonCirculo1.setText(" Carregar cardápio");
        buttonCirculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCirculo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(buttonCirculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCirculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        interface_editarCliente i_editarCliente = new interface_editarCliente();

        i_editarCliente.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_bEditarActionPerformed

    private void bEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarMouseEntered
        bEditar.setBackground(new Color(210, 224, 251));
    }//GEN-LAST:event_bEditarMouseEntered

    private void bEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarMouseExited
        bEditar.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bEditarMouseExited

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        bVoltar.setBackground(new Color(237, 237, 237));
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        bVoltar.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        interface_menuCliente i_menuCliente = new interface_menuCliente();
        i_menuCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void buttonCirculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCirculo1ActionPerformed
        DefaultTableModel cardapio = (DefaultTableModel) tabelaCardapio.getModel();
        String[] dados = {
            " Teste ",
            " Teste ",
            " Teste ",
            " Teste "};
        cardapio.addRow(dados);

    }//GEN-LAST:event_buttonCirculo1ActionPerformed

    private void bcarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcarrinhoActionPerformed
        GlassPanePopup.showPopup(new interface_Carrinho(), new DefaultOption() {
            @Override
            public float opacity() {
                return 0.2f;
            }
        });
    }//GEN-LAST:event_bcarrinhoActionPerformed

    private void bcarrinhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcarrinhoMouseEntered
        bcarrinho.setBackground(new Color(223, 204, 251));
    }//GEN-LAST:event_bcarrinhoMouseEntered

    private void bcarrinhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcarrinhoMouseExited
        bcarrinho.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bcarrinhoMouseExited

    private void tabelaCardapioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCardapioMousePressed
        GlassPanePopup.showPopup(new PopUp_mensagem());
 }//GEN-LAST:event_tabelaCardapioMousePressed

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
            java.util.logging.Logger.getLogger(interface_Cardapio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_Cardapio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_Cardapio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_Cardapio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_Cardapio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bEditar;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bVoltar;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bcarrinho;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo buttonCirculo1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private jaboc_UI.jabocUI_Utilidades.Panel panel1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel2;
    private javax.swing.JScrollPane scrollCardapio;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table tabelaCardapio;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table table1;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table table2;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table table3;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table table4;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table table5;
    // End of variables declaration//GEN-END:variables
}
