/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author adria
 */
public class AddProd extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddProd
     */
    public AddProd() {
        initComponents();
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
        jButtonPao = new javax.swing.JButton();
        jButtonBebida = new javax.swing.JButton();
        jButtonSalgado = new javax.swing.JButton();
        jButtonDoce = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar produto"));

        jButtonPao.setText("Pao");
        jButtonPao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaoActionPerformed(evt);
            }
        });

        jButtonBebida.setText("Bebida");
        jButtonBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBebidaActionPerformed(evt);
            }
        });

        jButtonSalgado.setText("Salgado");
        jButtonSalgado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalgadoActionPerformed(evt);
            }
        });

        jButtonDoce.setText("Doce");
        jButtonDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoceActionPerformed(evt);
            }
        });

        jLabel1.setText("Qual produto deseja adicionar?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButtonDoce)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonBebida)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalgado)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPao)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDoce)
                    .addComponent(jButtonBebida)
                    .addComponent(jButtonSalgado)
                    .addComponent(jButtonPao))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaoActionPerformed
        new Pao().setVisible(true);
    }//GEN-LAST:event_jButtonPaoActionPerformed

    private void jButtonDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoceActionPerformed
         new Doce().setVisible(true);
    }//GEN-LAST:event_jButtonDoceActionPerformed

    private void jButtonBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBebidaActionPerformed
        new Bebida().setVisible(true);
    }//GEN-LAST:event_jButtonBebidaActionPerformed

    private void jButtonSalgadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalgadoActionPerformed
        new Salgado().setVisible(true);
    }//GEN-LAST:event_jButtonSalgadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBebida;
    private javax.swing.JButton jButtonDoce;
    private javax.swing.JButton jButtonPao;
    private javax.swing.JButton jButtonSalgado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
