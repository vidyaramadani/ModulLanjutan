
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class banklagi extends javax.swing.JFrame {

    /**
     * Creates new form banklagi
     */
    public banklagi() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabel1.setText("BANK APA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setText("Selamat Datang ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 50, 240, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 2, 14)); // NOI18N
        jLabel3.setText("ATM BNI SYARIAH-BOJONEGORO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 80, 230, 50);

        jLabel4.setText("Masukkan 4 Digit PIN Anda!");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 180, 160, 30);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 210, 80, 23);

        setBounds(0, 0, 415, 414);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            boolean l = false;
            do{
                String str = JOptionPane.showInputDialog(null, "Masukkan 4 Digit PIN Anda:",
                        "ATM BNI SYARIAH-BOJONEGORO",0);
                int pin = Integer.parseInt(str);
                int counter = 0;
                counter+=1; //menghitung kesempatan login
                
                
                if(pin==1234)//cek pin
                    do{
                        str= JOptionPane.showInputDialog(null,"[1]Informasi "
                                + "Saldo \n[2]Penyetoran \n[3]Penarikan "
                                + "\n[4]Petunjuk \n[5]Keluar \n\nMasukkan "
                                + "Pilihan Menu:","Pilihan Transaksi",3);
                    int choice = Integer.parseInt(str);
                    }  
                    while (l==l);
                else if (counter<3){
                    int a = 0;
                    //jika pin salah
                    a--;
                    //menghitung kesalahan login dan memberikan kesempatan login
                    JOptionPane.showMessageDialog(null, "pin salah!\nPastikan PIN yang anda masukkan benar","ERROR",0);
                    JOptionPane.showMessageDialog(null, "\nKesempatan login "+a+"kali lagi"+"\n");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Untuk bantuan Nasabah, \nsilahkan menghubungi call center 555123(Gratis)","Kartu ATM anda diblokir!",0);
                    System.exit(0);
                }
            }
            while (l==l);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Kesalahan !\nPastikan kode yang anda masukkan berformat benar! \nProgram Keluar!\nTerimakasih","ERROR",0);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(banklagi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(banklagi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(banklagi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(banklagi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new banklagi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}