/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jaboc_UI.Pedidos;

import jaboc_BancoDeDados.Modelo.DAO_ContaFuncionario;
import jaboc_BancoDeDados.Modelo.DAO_Pedido;
import jaboc_Biblioteca.outras.ModernScrollBarUI;
import jaboc_Classes.Pedido;
import jaboc_UI.JabocUI_Utilidades.JabocUI_popUp.PopUp_ControlePedido;
import jaboc_UI.JabocUI_Utilidades.JabocUI_popUp.PopUp_GerenciaProdutos;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author eeuar
 */
public class interface_controlePedidos extends javax.swing.JFrame {

    int pedido_Selecionado;

    /**
     * Creates new form interface_controlePedidos
     */
    public interface_controlePedidos() {
        initComponents();
        setLocationRelativeTo(null);
        GlassPanePopup.install(this);

        JScrollBar bar = scrollPedidos.getVerticalScrollBar();
        bar.setOpaque(false);
        bar.setForeground(new Color(223, 204, 251));
        bar.setPreferredSize(new Dimension(10, 5));
        bar.setUI(new ModernScrollBarUI());
        scrollPedidos.setViewportBorder(null);
        scrollPedidos.setBorder(null);
        
        CarregarTotalmenteTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bVoltar = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        panel1 = new jaboc_UI.jabocUI_Utilidades.Panel();
        panel2 = new jaboc_UI.jabocUI_Utilidades.Panel();
        scrollPedidos = new javax.swing.JScrollPane();
        tabelaPedidos = new jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(164, 144, 124));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/i_editar2.png"))); // NOI18N
        jLabel7.setText(" GERENCIAR PEDIDOS");

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/principal/logo4.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel1.setBackground(new java.awt.Color(200, 182, 166));

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        scrollPedidos.setBorder(null);

        tabelaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Pedido", "Data", "Tipo", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPedidos.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabelaPedidos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelaPedidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPedidosMouseClicked(evt);
            }
        });
        scrollPedidos.setViewportView(tabelaPedidos);
        if (tabelaPedidos.getColumnModel().getColumnCount() > 0) {
            tabelaPedidos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaPedidos.getColumnModel().getColumn(2).setPreferredWidth(20);
            tabelaPedidos.getColumnModel().getColumn(3).setPreferredWidth(25);
        }

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        bVoltar.setBackground(new Color(237, 237, 237));
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        bVoltar.setBackground(new Color(252, 252, 252));
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        this.dispose();
        DAO_ContaFuncionario.limparDados_Memoria();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void tabelaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPedidosMouseClicked
        PopUp_ControlePedido PopUP_CP = new PopUp_ControlePedido(this);
        pedido_Selecionado = tabelaPedidos.getSelectedRow();
        int idSelecionado = Integer.parseInt(tabelaPedidos.getValueAt(pedido_Selecionado, 0).toString());

        PopUP_CP.receber(idSelecionado);
        GlassPanePopup.showPopup(PopUP_CP);
    }//GEN-LAST:event_tabelaPedidosMouseClicked
    public void CarregarTotalmenteTabela() {
        
        DAO_Pedido daoPedido = new DAO_Pedido();
        DefaultTableModel pedidos = (DefaultTableModel) tabelaPedidos.getModel();
        for (Pedido p : daoPedido.Listagem()) {
            pedidos.addRow(new Object[]{
                p.getIdPedido(),
                p.getNomePedido(),
                p.getDataPedido(),
                p.getTipoPedido(),
                p.getStatusPedido()
            });
        }
    }

    public JTable getTabelaPedidos(){
        return this.tabelaPedidos;
    }
    
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
            java.util.logging.Logger.getLogger(interface_controlePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_controlePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_controlePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_controlePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_controlePedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bVoltar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private jaboc_UI.jabocUI_Utilidades.Panel panel1;
    private jaboc_UI.jabocUI_Utilidades.Panel panel2;
    private javax.swing.JScrollPane scrollPedidos;
    private jaboc_UI.JabocUI_Utilidades.JabocUI_Classes.Table tabelaPedidos;
    // End of variables declaration//GEN-END:variables
}
