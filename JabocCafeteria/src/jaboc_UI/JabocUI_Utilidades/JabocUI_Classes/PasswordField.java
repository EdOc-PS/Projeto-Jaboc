/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaboc_UI.jabocUI_Utilidades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author eeuar
 */
public class PasswordField extends JPasswordField {
    String arm;
    int cont = 1;
    public PasswordField() {
        setOpaque(false);
        setBorder(new EmptyBorder(1, 3, 1, 3));
        setFont(new java.awt.Font("Gill Sans MT", 0, 14));
        setForeground(new Color(153, 153, 153));
        setBackground(new Color(255,255,255));
        setEchoChar((char) 0);

        this.addFocusListener(new FocusListener() {

            @Override       
            public void focusGained(FocusEvent e) {
                if (cont == 1) {
                    arm = getText();
                    cont++;
                }
                if (getText().equals(arm)) {
                    setText("");
                    setEchoChar('*');
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (getText().equals("")) {
                    setText(arm);
                    setEchoChar((char) 0);
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        g2.dispose();

        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
