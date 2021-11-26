import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Exercicio3 extends javax.swing.JFrame {
    Random r = new Random();
    private int num;
    
    public Exercicio3() {
        initComponents();
        this.num = r.nextInt(1000);
        this.num = (this.num == 0) ? 1: this.num;
    }
    public void setRandomNum(){
        this.num = r.nextInt(1000);
        this.num = (this.num == 0) ? 1: this.num;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        cxNumero = new javax.swing.JTextField();
        enviarBotao = new javax.swing.JButton();
        labelTexto = new javax.swing.JLabel();
        labelProximo = new javax.swing.JLabel();
        labelMaiorMenor = new javax.swing.JLabel();
        novoJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cxNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumeroActionPerformed(evt);
            }
        });

        enviarBotao.setText("Adivinhar!");
        enviarBotao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enviarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBotaoActionPerformed(evt);
            }
        });

        labelTexto.setText("Adivinhe o número inteiro no intervalo de 1 à 1000");

        labelProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        novoJogo.setText("Novo Jogo");
        novoJogo.setBorderPainted(false);
        novoJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        novoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTexto)
                    .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMaiorMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(enviarBotao)))
                        .addGap(120, 120, 120))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(novoJogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(novoJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(labelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enviarBotao)
                .addGap(18, 18, 18)
                .addComponent(labelProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMaiorMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cxNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumeroActionPerformed

    }//GEN-LAST:event_cxNumeroActionPerformed

    private void enviarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBotaoActionPerformed
        String num0 = cxNumero.getText();
        ImageIcon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/img/verificar.png"))); 
        if (!num0.isEmpty() && num0.chars().allMatch(Character :: isDigit)){
            int num1 = Integer.parseInt(num0);
            if (num1 == this.num){
                JOptionPane.showMessageDialog(this, "Você acertou!", "Parabéns!", JOptionPane.QUESTION_MESSAGE, figura);
                cxNumero.setBackground(Color.white);
                cxNumero.setEnabled(false);
                enviarBotao.setEnabled(false);
                labelProximo.setText("");
                labelMaiorMenor.setText("");
            }
            else if (num1 >= this.num - 20 && num1 <= this.num + 20){
                cxNumero.setBackground(Color.red);
                cxNumero.setForeground(Color.white);
                labelProximo.setText("Você está perto!");
                if (num1 > this.num){
                    labelMaiorMenor.setText("Tente um número menor. ");
                }
                else {
                    labelMaiorMenor.setText("Tente um número maior. ");
                }
            }
            else{
                cxNumero.setBackground(Color.blue);
                cxNumero.setForeground(Color.white);
                labelProximo.setText("Você está distante do número!");
                if (num1 > this.num){
                    labelMaiorMenor.setText("Tente um número menor. ");
                }
                else {
                    labelMaiorMenor.setText("Tente um número maior. ");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Valor inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_enviarBotaoActionPerformed

    private void novoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoJogoActionPerformed
        setRandomNum();
        cxNumero.setEnabled(true);
        cxNumero.setText("");
        enviarBotao.setEnabled(true);
        labelMaiorMenor.setText("");
        labelProximo.setText("");
        cxNumero.setBackground(Color.white);
        cxNumero.setForeground(Color.black);
    }//GEN-LAST:event_novoJogoActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cxNumero;
    private javax.swing.JButton enviarBotao;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelMaiorMenor;
    private javax.swing.JLabel labelProximo;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JButton novoJogo;
    // End of variables declaration//GEN-END:variables
}
