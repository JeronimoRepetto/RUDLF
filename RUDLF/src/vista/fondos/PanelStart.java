/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.fondos;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author jeron
 */
public class PanelStart extends javax.swing.JPanel {

    /**
     * Creates new form PanelStart
     */
    public PanelStart() {
        initComponents();
        Dimension tamaño = getToolkit().getScreenSize();
        int a = (int) tamaño.getWidth();
        int b = (int) tamaño.getHeight();
        this.setSize(a, 573);
        
    }
    
    public void paint(Graphics g){
    
        Dimension tam = getSize();
        ImageIcon fondo = new ImageIcon(getClass().getResource("/imagen/Fondo.jpg"));
        g.drawImage(fondo.getImage(),0,0,getWidth(), getHeight(),null);
        setOpaque(false);
        super.paintComponent(g);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
