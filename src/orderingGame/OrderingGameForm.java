/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingGame;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author bcturner
 */
public class OrderingGameForm extends javax.swing.JFrame {

    int numeratorNumber1;
    int numeratorNumber2;
    int numeratorNumber3;
    int numeratorNumber4;
    int score =0;
    
    public OrderingGameForm() {
        initComponents();
        
        nextQuestionButton.setVisible(false);
        newGameButton.setVisible(false);
        
        Random gen = new Random();
        int denominatorNumber = gen.nextInt(9)+4;
        
        denominator1.setText(""+denominatorNumber);
        denominator2.setText(""+denominatorNumber);
        denominator3.setText(""+denominatorNumber);
        denominator4.setText(""+denominatorNumber);
        
        int numeratorRange = denominatorNumber;
        
         numeratorNumber1 = gen.nextInt(numeratorRange)+1;
         numeratorNumber2 = gen.nextInt(numeratorRange)+1;
        while(numeratorNumber1 == numeratorNumber2){
            numeratorNumber2 = gen.nextInt(numeratorRange)+1;
        }
         numeratorNumber3 = gen.nextInt(numeratorRange)+1;
        while((numeratorNumber1 == numeratorNumber2) || (numeratorNumber2 == numeratorNumber3) || (numeratorNumber1 == numeratorNumber3)){
            
            numeratorNumber3 = gen.nextInt(numeratorRange)+1;
        }
         numeratorNumber4 = gen.nextInt(numeratorRange)+1;
        while((numeratorNumber1 == numeratorNumber2) || (numeratorNumber2 == numeratorNumber3) || (numeratorNumber1 == numeratorNumber3) || (numeratorNumber1 == numeratorNumber4) || (numeratorNumber2 == numeratorNumber4) || (numeratorNumber3 == numeratorNumber4)){
         numeratorNumber4 = gen.nextInt(numeratorRange)+1;
        }
        
        while((numeratorNumber1 < numeratorNumber2) && (numeratorNumber2 < numeratorNumber3) && (numeratorNumber3 < numeratorNumber4)){
        numeratorNumber4 = gen.nextInt(numeratorRange)+1;
        }
        
        numerator1.setText(""+numeratorNumber1);
        numerator2.setText(""+numeratorNumber2);
        numerator3.setText(""+numeratorNumber3);
        numerator4.setText(""+numeratorNumber4);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inOrder = new javax.swing.JButton();
        nextQuestionButton = new javax.swing.JButton();
        newGameButton = new javax.swing.JButton();
        goodJobLion = new javax.swing.JLabel();
        userMessage = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        scoreNumLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        numerator1 = new javax.swing.JLabel();
        numerator2 = new javax.swing.JLabel();
        numerator3 = new javax.swing.JLabel();
        numerator4 = new javax.swing.JLabel();
        denominator1 = new javax.swing.JLabel();
        denominator2 = new javax.swing.JLabel();
        denominator3 = new javax.swing.JLabel();
        denominator4 = new javax.swing.JLabel();
        divider1 = new javax.swing.JLabel();
        divider2 = new javax.swing.JLabel();
        divider3 = new javax.swing.JLabel();
        divider4 = new javax.swing.JLabel();
        blockLabel1 = new javax.swing.JLabel();
        lArrow3 = new javax.swing.JLabel();
        rArrow1 = new javax.swing.JLabel();
        blockLabel2 = new javax.swing.JLabel();
        rArrow2 = new javax.swing.JLabel();
        blockLabel3 = new javax.swing.JLabel();
        lArrow2 = new javax.swing.JLabel();
        blockLabel4 = new javax.swing.JLabel();
        lArrow4 = new javax.swing.JLabel();
        rArrow3 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 401));
        setMinimumSize(new java.awt.Dimension(610, 401));
        setPreferredSize(new java.awt.Dimension(610, 401));
        setSize(new java.awt.Dimension(660, 401));
        getContentPane().setLayout(null);

        inOrder.setText("Done!");
        inOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inOrderMouseClicked(evt);
            }
        });
        getContentPane().add(inOrder);
        inOrder.setBounds(480, 350, 81, 29);

        nextQuestionButton.setText("Next Question");
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextQuestionButton);
        nextQuestionButton.setBounds(460, 350, 120, 29);

        newGameButton.setText("New Game");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newGameButton);
        newGameButton.setBounds(470, 350, 97, 29);

        goodJobLion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/smallLion.png"))); // NOI18N
        getContentPane().add(goodJobLion);
        goodJobLion.setBounds(130, 10, 90, 110);
        goodJobLion.getAccessibleContext().setAccessibleName("goodJobLion");

        userMessage.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        userMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(userMessage);
        userMessage.setBounds(210, 30, 180, 30);

        scoreLabel.setText("Score :");
        getContentPane().add(scoreLabel);
        scoreLabel.setBounds(480, 20, 42, 16);

        scoreNumLabel.setText("0");
        getContentPane().add(scoreNumLabel);
        scoreNumLabel.setBounds(530, 20, 8, 16);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"))); // NOI18N
        getContentPane().add(backButton);
        backButton.setBounds(10, 10, 70, 53);

        numerator1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numerator1);
        numerator1.setBounds(50, 160, 50, 20);

        numerator2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numerator2);
        numerator2.setBounds(200, 160, 50, 20);

        numerator3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numerator3);
        numerator3.setBounds(350, 160, 50, 20);

        numerator4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(numerator4);
        numerator4.setBounds(500, 160, 50, 20);

        denominator1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(denominator1);
        denominator1.setBounds(50, 200, 50, 20);

        denominator2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(denominator2);
        denominator2.setBounds(200, 200, 50, 20);

        denominator3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(denominator3);
        denominator3.setBounds(350, 200, 50, 20);

        denominator4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(denominator4);
        denominator4.setBounds(500, 200, 50, 20);

        divider1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/divider.png"))); // NOI18N
        getContentPane().add(divider1);
        divider1.setBounds(490, 180, 70, 18);

        divider2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/divider.png"))); // NOI18N
        getContentPane().add(divider2);
        divider2.setBounds(40, 180, 70, 18);

        divider3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/divider.png"))); // NOI18N
        getContentPane().add(divider3);
        divider3.setBounds(190, 180, 70, 18);

        divider4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/divider.png"))); // NOI18N
        getContentPane().add(divider4);
        divider4.setBounds(340, 180, 70, 18);

        blockLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/blockPanel.png"))); // NOI18N
        getContentPane().add(blockLabel1);
        blockLabel1.setBounds(10, 110, 140, 150);

        lArrow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leftArrow.png"))); // NOI18N
        lArrow3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lArrow3MouseClicked(evt);
            }
        });
        getContentPane().add(lArrow3);
        lArrow3.setBounds(310, 260, 60, 50);

        rArrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rightArrow.png"))); // NOI18N
        rArrow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rArrow1MouseClicked(evt);
            }
        });
        getContentPane().add(rArrow1);
        rArrow1.setBounds(80, 260, 60, 50);

        blockLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/blockPanel.png"))); // NOI18N
        getContentPane().add(blockLabel2);
        blockLabel2.setBounds(160, 110, 140, 150);

        rArrow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rightArrow.png"))); // NOI18N
        rArrow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rArrow2MouseClicked(evt);
            }
        });
        getContentPane().add(rArrow2);
        rArrow2.setBounds(230, 260, 60, 50);

        blockLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/blockPanel.png"))); // NOI18N
        getContentPane().add(blockLabel3);
        blockLabel3.setBounds(310, 110, 140, 150);

        lArrow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leftArrow.png"))); // NOI18N
        lArrow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lArrow2MouseClicked(evt);
            }
        });
        getContentPane().add(lArrow2);
        lArrow2.setBounds(160, 260, 60, 50);

        blockLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/blockPanel.png"))); // NOI18N
        getContentPane().add(blockLabel4);
        blockLabel4.setBounds(460, 110, 140, 150);

        lArrow4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leftArrow.png"))); // NOI18N
        lArrow4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lArrow4MouseClicked(evt);
            }
        });
        getContentPane().add(lArrow4);
        lArrow4.setBounds(460, 260, 60, 50);

        rArrow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rightArrow.png"))); // NOI18N
        rArrow3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rArrow3MouseClicked(evt);
            }
        });
        getContentPane().add(rArrow3);
        rArrow3.setBounds(380, 260, 60, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 609, 401);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rArrow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rArrow2MouseClicked
        int temp1 = numeratorNumber2;
        int temp2 = numeratorNumber3;
        numeratorNumber2 = temp2;
        numeratorNumber3 = temp1;
        
        numerator2.setText(""+numeratorNumber2);
        numerator3.setText(""+numeratorNumber3);
        this.repaint();
    }//GEN-LAST:event_rArrow2MouseClicked

    private void lArrow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lArrow2MouseClicked
        int temp1 = numeratorNumber1;
        int temp2 = numeratorNumber2;
        numeratorNumber1 = temp2;
        numeratorNumber2 = temp1;
        
        numerator1.setText(""+numeratorNumber1);
        numerator2.setText(""+numeratorNumber2);
        this.repaint();
    }//GEN-LAST:event_lArrow2MouseClicked

    private void lArrow4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lArrow4MouseClicked
        int temp1 = numeratorNumber3;
        int temp2 = numeratorNumber4;
        numeratorNumber3 = temp2;
        numeratorNumber4 = temp1;
        
        numerator3.setText(""+numeratorNumber3);
        numerator4.setText(""+numeratorNumber4);
        this.repaint();
    }//GEN-LAST:event_lArrow4MouseClicked

    private void rArrow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rArrow1MouseClicked
        int temp1 = numeratorNumber1;
        int temp2 = numeratorNumber2;
        numeratorNumber1 = temp2;
        numeratorNumber2 = temp1;
        
        numerator1.setText(""+numeratorNumber1);
        numerator2.setText(""+numeratorNumber2);
        this.repaint();
        
    }//GEN-LAST:event_rArrow1MouseClicked

    private void lArrow3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lArrow3MouseClicked
        int temp1 = numeratorNumber2;
        int temp2 = numeratorNumber3;
        numeratorNumber2 = temp2;
        numeratorNumber3 = temp1;
        
        numerator2.setText(""+numeratorNumber2);
        numerator3.setText(""+numeratorNumber3);
        this.repaint();
        
    }//GEN-LAST:event_lArrow3MouseClicked

    private void inOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inOrderMouseClicked
        if((numeratorNumber1 < numeratorNumber2) && (numeratorNumber2 < numeratorNumber3) && (numeratorNumber3 < numeratorNumber4)){
           System.out.println("Right!");
           userMessage.setVisible(true);
           userMessage.setForeground(Color.green);
           userMessage.setText("Correct!!");
           score++;
           scoreNumLabel.setText(""+score);
           inOrder.setVisible(false);
           nextQuestionButton.setVisible(true);
           
           if(score == 5){
               userMessage.setText("YOU WIN!");
               nextQuestionButton.setVisible(false);
               newGameButton.setVisible(true);
               
           }
           
           
           
        }
        else{
           userMessage.setForeground(Color.red);
           userMessage.setText("Try Again");
        }
    }//GEN-LAST:event_inOrderMouseClicked

    private void rArrow3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rArrow3MouseClicked
        int temp1 = numeratorNumber3;
        int temp2 = numeratorNumber4;
        numeratorNumber3 = temp2;
        numeratorNumber4 = temp1;
        
        numerator3.setText(""+numeratorNumber3);
        numerator4.setText(""+numeratorNumber4);
        this.repaint();
    }//GEN-LAST:event_rArrow3MouseClicked

    private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionButtonActionPerformed
        reset();
    }//GEN-LAST:event_nextQuestionButtonActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        reset();
        score =0;
        scoreNumLabel.setText(""+score);
    }//GEN-LAST:event_newGameButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OrderingGameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderingGameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderingGameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderingGameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderingGameForm().setVisible(true);
            }
        });
    }
    
    public void reset(){
        
        nextQuestionButton.setVisible(false);
        inOrder.setVisible(true);
        userMessage.setText("");
        
        Random gen = new Random();
        int denominatorNumber = gen.nextInt(9)+4;
        
        denominator1.setText(""+denominatorNumber);
        denominator2.setText(""+denominatorNumber);
        denominator3.setText(""+denominatorNumber);
        denominator4.setText(""+denominatorNumber);
        
        int numeratorRange = denominatorNumber;
        
         numeratorNumber1 = gen.nextInt(numeratorRange)+1;
         numeratorNumber2 = gen.nextInt(numeratorRange)+1;
        while(numeratorNumber1 == numeratorNumber2){
            numeratorNumber2 = gen.nextInt(numeratorRange)+1;
        }
         numeratorNumber3 = gen.nextInt(numeratorRange)+1;
        while((numeratorNumber1 == numeratorNumber2) || (numeratorNumber2 == numeratorNumber3) || (numeratorNumber1 == numeratorNumber3)){
            
            numeratorNumber3 = gen.nextInt(numeratorRange)+1;
        }
         numeratorNumber4 = gen.nextInt(numeratorRange)+1;
        while((numeratorNumber1 == numeratorNumber2) || (numeratorNumber2 == numeratorNumber3) || (numeratorNumber1 == numeratorNumber3) || (numeratorNumber1 == numeratorNumber4) || (numeratorNumber2 == numeratorNumber4) || (numeratorNumber3 == numeratorNumber4)){
         numeratorNumber4 = gen.nextInt(numeratorRange)+1;
        }
        numerator1.setText(""+numeratorNumber1);
        numerator2.setText(""+numeratorNumber2);
        numerator3.setText(""+numeratorNumber3);
        numerator4.setText(""+numeratorNumber4);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel blockLabel1;
    private javax.swing.JLabel blockLabel2;
    private javax.swing.JLabel blockLabel3;
    private javax.swing.JLabel blockLabel4;
    private javax.swing.JLabel denominator1;
    private javax.swing.JLabel denominator2;
    private javax.swing.JLabel denominator3;
    private javax.swing.JLabel denominator4;
    private javax.swing.JLabel divider1;
    private javax.swing.JLabel divider2;
    private javax.swing.JLabel divider3;
    private javax.swing.JLabel divider4;
    private javax.swing.JLabel goodJobLion;
    private javax.swing.JButton inOrder;
    private javax.swing.JLabel lArrow2;
    private javax.swing.JLabel lArrow3;
    private javax.swing.JLabel lArrow4;
    private javax.swing.JButton newGameButton;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JLabel numerator1;
    private javax.swing.JLabel numerator2;
    private javax.swing.JLabel numerator3;
    private javax.swing.JLabel numerator4;
    private javax.swing.JLabel rArrow1;
    private javax.swing.JLabel rArrow2;
    private javax.swing.JLabel rArrow3;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreNumLabel;
    private javax.swing.JLabel userMessage;
    // End of variables declaration//GEN-END:variables
}
