/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jaboc_UI.Cardapio;

import jaboc_BancoDeDados.Modelo.DAO_Pedido;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JScrollBar;
import jaboc_Biblioteca.outras.ModernScrollBarUI;
import jaboc_Classes.Pedido;
import jaboc_Classes.Produto;
import java.time.LocalDate;
import java.util.List;
import net.miginfocom.swing.MigLayout;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author eeuar
 */
public class interface_Carrinho extends javax.swing.JPanel {

    DAO_Pedido daoPedido = new DAO_Pedido();
    List<Produto> carrinho;
    LocalDate dataAtual = LocalDate.now(); // pega a data atual
    interface_Cardapio i_Cardapio;

    /**
     * Creates new form interface_carrinho
     */
    public interface_Carrinho() {
        initComponents();
        setOpaque(false);
        JScrollBar bar = scrollCarrinho.getVerticalScrollBar();
        bar.setOpaque(false);
        bar.setForeground(new Color(223, 204, 251));
        bar.setPreferredSize(new Dimension(8, 5));
        bar.setUI(new ModernScrollBarUI());
        panelCarrinho.setLayout(new MigLayout("inset 0, fillx, wrap", "[fill]"));
    }

    public void addCarrinho() {
        for (int i = 0; i < carrinho.size(); i++) {
            panelCarrinho.add(new interface_itemCarrinho(carrinho.get(i).getNomeProduto(), carrinho.get(i).getTipoProduto(),
                    String.valueOf(carrinho.get(i).getPrecoProduto())));
        };
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        g2.dispose();
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bPopUp = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        panel1 = new jaboc_UI.jabocUI_Utilidades.Panel();
        carrinhotxt = new javax.swing.JLabel();
        bPopUpExit = new jaboc_UI.jabocUI_Utilidades.ButtonCirculo();
        panelP = new jaboc_UI.jabocUI_Utilidades.Panel();
        scrollCarrinho = new javax.swing.JScrollPane();
        panelCarrinho = new javax.swing.JPanel();
        finalizarPedido = new jaboc_UI.jabocUI_Utilidades.Button();

        bPopUp.setBackground(new java.awt.Color(250, 112, 112));
        bPopUp.setForeground(new java.awt.Color(255, 255, 255));
        bPopUp.setText("X");

        panel1.setBackground(new java.awt.Color(247, 245, 251));

        carrinhotxt.setBackground(new java.awt.Color(79, 84, 101));
        carrinhotxt.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); // NOI18N
        carrinhotxt.setForeground(new java.awt.Color(79, 84, 101));
        carrinhotxt.setText("Carrinho");

        bPopUpExit.setBackground(new java.awt.Color(250, 112, 112));
        bPopUpExit.setForeground(new java.awt.Color(255, 255, 255));
        bPopUpExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/x.png"))); // NOI18N
        bPopUpExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bPopUpExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPopUpExitActionPerformed(evt);
            }
        });

        panelP.setBackground(new java.awt.Color(247, 245, 251));

        scrollCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        scrollCarrinho.setBorder(null);
        scrollCarrinho.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelCarrinho.setBackground(new java.awt.Color(247, 245, 251));

        javax.swing.GroupLayout panelCarrinhoLayout = new javax.swing.GroupLayout(panelCarrinho);
        panelCarrinho.setLayout(panelCarrinhoLayout);
        panelCarrinhoLayout.setHorizontalGroup(
            panelCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        panelCarrinhoLayout.setVerticalGroup(
            panelCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        scrollCarrinho.setViewportView(panelCarrinho);

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        finalizarPedido.setBackground(new java.awt.Color(223, 204, 251));
        finalizarPedido.setForeground(new java.awt.Color(79, 84, 101));
        finalizarPedido.setText("Finalizar pedido");
        finalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(carrinhotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                        .addComponent(bPopUpExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bPopUpExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carrinhotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(panelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bPopUpExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPopUpExitActionPerformed
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_bPopUpExitActionPerformed

    private void finalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarPedidoActionPerformed

        for (Produto produto : carrinho) {
            String tipo = produto.getTipoProduto();
            String nome = produto.getNomeProduto();
            double preco = produto.getPrecoProduto();

            Pedido itemPedido = new Pedido(0, "Enviado", dataAtual.toString(), tipo, nome, preco);
            daoPedido.insert(itemPedido);
        }
        GlassPanePopup.closePopupLast();
        i_Cardapio.dispose();
        interface_finalizadoCardapio i_finalizado = new interface_finalizadoCardapio();
        i_finalizado.setVisible(true);


    }//GEN-LAST:event_finalizarPedidoActionPerformed
    public void receber(interface_Cardapio i_Cardapio) {
        this.i_Cardapio = i_Cardapio;
    }

    public void recebeCarrinho(List<Produto> itensCarrinho) {
        this.carrinho = itensCarrinho;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bPopUp;
    private jaboc_UI.jabocUI_Utilidades.ButtonCirculo bPopUpExit;
    private javax.swing.JLabel carrinhotxt;
    private jaboc_UI.jabocUI_Utilidades.Button finalizarPedido;
    private jaboc_UI.jabocUI_Utilidades.Panel panel1;
    private javax.swing.JPanel panelCarrinho;
    private jaboc_UI.jabocUI_Utilidades.Panel panelP;
    private javax.swing.JScrollPane scrollCarrinho;
    // End of variables declaration//GEN-END:variables
}
