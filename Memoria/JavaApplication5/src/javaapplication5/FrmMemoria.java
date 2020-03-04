package javaapplication5;


public class FrmMemoria extends javax.swing.JFrame {

    int[] numeros = new int[16];
    int posicion;
    int posicion2;
    int aleatorio;
    int ultimo;
    int penultimo;
    int antepenultimo;
    int contador=1;
    int condicion;
    int click = 0;
    int posantepenultima;
    int pospenultima;
    int posultima;
    int cond;
    

    
    public FrmMemoria() 
    {
        initComponents();
        vectorAleatorio();      
    }
 
    void vectorAleatorio()
    {   
        posicion = 1;
        posicion2 = 0;
        aleatorio = 0;
        condicion = 0;
        numeros[0] = (int)(Math.random()*8);
        
        while (posicion <= 15)
        {
            System.out.print("las posisicones 1: \n");
            System.out.print(posicion + "\n");
            condicion = 0;
            posicion2 = 0;
            aleatorio = (int)(Math.random()*8);  
            System.out.print("aleatorio antes: "+ aleatorio + "\n");
            System.out.print("las posisicones 2: \n");
            while(posicion > posicion2)
            {
                if(aleatorio == numeros[posicion2])
                {
                    condicion++;
                }  
                System.out.print(posicion2 + "\n");
                posicion2++;
            }
            
            if(condicion < 2)
            {
                System.out.print("aleatorio: "+ aleatorio + "\n");
                numeros[posicion2] = aleatorio;
                posicion++;
            }
        }
        for(contador = 0 ; contador <= 15 ; contador++)
        {
            System.out.print(numeros[contador]);
        }
    } 
    
    void adivino(int posi)
    {
        switch(posi)
        {
            case 1: btn1.setEnabled(false);
                    break;
            case 2: btn2.setEnabled(false);
                    break;
            case 3: btn3.setEnabled(false);
                    break;
            case 4: btn4.setEnabled(false);
                    break;
            case 5: btn5.setEnabled(false);
                    break;
            case 6: btn6.setEnabled(false);
                    break;
            case 7: btn7.setEnabled(false);
                    break;
            case 8: btn8.setEnabled(false);
                    break;
            case 9: btn9.setEnabled(false);
                    break;
            case 10:btn10.setEnabled(false);
                    break;
            case 11:btn11.setEnabled(false);
                    break;
            case 12:btn12.setEnabled(false);
                    break;
            case 13:btn13.setEnabled(false);
                    break;
            case 14:btn14.setEnabled(false);
                    break;
            case 15:btn15.setEnabled(false);
                    break;
            case 16:btn16.setEnabled(false);
                    break;
        }

    }
    
    void blanco(int pos)
    {
        switch(pos)
        {
            case 1: btn1.setText("");
                    btn1.setEnabled(true);
                    break;
            case 2: btn2.setText("");
                    btn2.setEnabled(true);
                    break;
            case 3: btn3.setText("");
                    btn3.setEnabled(true);
                    break;
            case 4: btn4.setText("");
                    btn4.setEnabled(true);
                    break;
            case 5: btn5.setText("");
                    btn5.setEnabled(true);
                    break;
            case 6: btn6.setText("");
                    btn6.setEnabled(true);
                    break;
            case 7: btn7.setText("");
                    btn7.setEnabled(true);
                    break;
            case 8: btn8.setText("");
                    btn8.setEnabled(true);
                    break;
            case 9: btn9.setText("");
                    btn9.setEnabled(true);
                    break;
            case 10:btn10.setText("");
                    btn10.setEnabled(true);
                    break;
            case 11:btn11.setText("");
                    btn11.setEnabled(true);
                    break;
            case 12:btn12.setText("");
                    btn12.setEnabled(true);
                    break;
            case 13:btn13.setText("");
                    btn13.setEnabled(true);
                    break;
            case 14:btn14.setText("");
                    btn14.setEnabled(true);
                    break;
            case 15:btn15.setText("");
                    btn15.setEnabled(true);
                    break;
            case 16:btn16.setText("");
                    btn16.setEnabled(true);
                    break;
            case 17:btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                    btn10.setText("");
                    btn11.setText("");
                    btn12.setText("");
                    btn13.setText("");
                    btn14.setText("");
                    btn15.setText("");
                    btn16.setText("");
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(true);
                    btn5.setEnabled(true);
                    btn6.setEnabled(true);
                    btn7.setEnabled(true);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);
                    btn10.setEnabled(true);
                    btn11.setEnabled(true);
                    btn12.setEnabled(true);
                    btn13.setEnabled(true);
                    btn14.setEnabled(true);
                    btn15.setEnabled(true);
                    btn16.setEnabled(true);
                    break;
        }            
    }
    
    void regla(int nbtn)
    {
        int donde = nbtn+1;
        System.out.print("click: " + click + "\n");
        System.out.print("cond: " + cond + "\n\n");
        
        if (cond == 1)
        {
            penultimo = numeros[nbtn];
            pospenultima = donde; 
        }
        if(cond == 2)
        {
            ultimo = numeros[nbtn];
            posultima = donde;
        }
        if(cond == 0)
        {
            if (ultimo == penultimo)
            {
                ultimo = 0;
                penultimo = numeros[nbtn];
                posultima = 0;
                pospenultima = donde;
                click=1;
            }        
            else
            {
                blanco(pospenultima);
                blanco(posultima);  
                ultimo = 0;
                penultimo = numeros[nbtn];
                posultima = 0;
                pospenultima = donde;
                click = 1;
            }
        }
        
        System.out.print("ultimo: " + ultimo + "\n");
        System.out.print("penultimo: " + penultimo + "\n");
        System.out.print("antepenultimo: " + antepenultimo + "\n\n");
        
        System.out.print("posicion ultima: " + posultima + "\n");
        System.out.print("posicion penultima: " + pospenultima + "\n");
        System.out.print("posicion antepenultima: " + posantepenultima + "\n\n");
        
    }
    

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setPreferredSize(new java.awt.Dimension(100, 30));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setPreferredSize(new java.awt.Dimension(100, 30));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setPreferredSize(new java.awt.Dimension(100, 30));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setPreferredSize(new java.awt.Dimension(100, 30));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setPreferredSize(new java.awt.Dimension(100, 30));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setPreferredSize(new java.awt.Dimension(100, 30));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setPreferredSize(new java.awt.Dimension(100, 30));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setPreferredSize(new java.awt.Dimension(100, 30));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setPreferredSize(new java.awt.Dimension(100, 30));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setPreferredSize(new java.awt.Dimension(100, 30));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setPreferredSize(new java.awt.Dimension(100, 30));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setMinimumSize(new java.awt.Dimension(100, 30));
        btn12.setPreferredSize(new java.awt.Dimension(100, 30));
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setPreferredSize(new java.awt.Dimension(100, 30));
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setMinimumSize(new java.awt.Dimension(100, 30));
        btn14.setPreferredSize(new java.awt.Dimension(100, 30));
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.setPreferredSize(new java.awt.Dimension(100, 30));
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setMinimumSize(new java.awt.Dimension(100, 30));
        btn16.setPreferredSize(new java.awt.Dimension(100, 30));
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(btnReset)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnReset)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setText(String.valueOf(numeros[0]));
        click++;
        cond = click%3;
        btn1.setEnabled(false);
        regla(0);        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setText(String.valueOf(numeros[1]));
        click++;
        cond = click%3;
        btn2.setEnabled(false);
        regla(1);                    
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(String.valueOf(numeros[2]));
        click++;
        cond = click%3;
        btn3.setEnabled(false);
        regla(2);                        
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(String.valueOf(numeros[3]));
        click++;
        cond = click%3;
        btn4.setEnabled(false);
        regla(3);             
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(String.valueOf(numeros[4]));
        click++;
        cond = click%3;
        btn5.setEnabled(false);
        regla(4); 
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(String.valueOf(numeros[5]));
        click++;
        cond = click%3;
        btn6.setEnabled(false);
        regla(5);                  
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(String.valueOf(numeros[6]));
        click++;
        cond = click%3;
        btn7.setEnabled(false);
        regla(6);             
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(String.valueOf(numeros[7]));
        click++;
        cond = click%3;
        btn8.setEnabled(false);
        regla(7);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText(String.valueOf(numeros[8]));
        click++;
        cond = click%3;
        btn9.setEnabled(false);
        regla(8);    
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        btn10.setText(String.valueOf(numeros[9]));
        click++;
        cond = click%3;
        btn10.setEnabled(false);
        regla(9);     
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        btn11.setText(String.valueOf(numeros[10]));
        click++;
        cond = click%3;
        btn11.setEnabled(false);
        regla(10);     
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        btn12.setText(String.valueOf(numeros[11]));   
        click++;
        cond = click%3;
        btn12.setEnabled(false);
        regla(11);      
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        btn13.setText(String.valueOf(numeros[12]));
        click++;
        cond = click%3;
        btn13.setEnabled(false);
        regla(12);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        btn14.setText(String.valueOf(numeros[13]));
        click++;
        cond = click%3;
        btn14.setEnabled(false);
        regla(13); 
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        btn15.setText(String.valueOf(numeros[14]));
        click++;
        cond = click%3;
        btn15.setEnabled(false);
        regla(14); 
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        btn16.setText(String.valueOf(numeros[15]));
        click++;
        cond = click%3;
        btn16.setEnabled(false);
        regla(15);       
    }//GEN-LAST:event_btn16ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        blanco(17);
        vectorAleatorio();
        click = 0;
    }//GEN-LAST:event_btnResetActionPerformed

 
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
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
