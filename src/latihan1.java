/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sweet.Cakee
 */
public class latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form newww
     */
    public latihan1() {
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
        editnama = new javax.swing.JLabel();
        editkelas = new javax.swing.JLabel();
        editalamat = new javax.swing.JLabel();
        namafield1 = new javax.swing.JTextField();
        kelasfield1 = new javax.swing.JTextField();
        alamatfield1 = new javax.swing.JTextField();
        proses = new javax.swing.JButton();
        hasilnama = new javax.swing.JLabel();
        hasilkelas = new javax.swing.JLabel();
        namafield2 = new javax.swing.JTextField();
        kelasfield2 = new javax.swing.JTextField();
        alamatfield2 = new javax.swing.JTextField();
        hasilalamat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("DATA ISIAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 40, 60, 14);

        editnama.setText("Nama");
        getContentPane().add(editnama);
        editnama.setBounds(40, 70, 60, 14);

        editkelas.setText("Kelas");
        getContentPane().add(editkelas);
        editkelas.setBounds(40, 100, 60, 14);

        editalamat.setText("Alamat");
        getContentPane().add(editalamat);
        editalamat.setBounds(40, 130, 70, 14);

        namafield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namafield1ActionPerformed(evt);
            }
        });
        getContentPane().add(namafield1);
        namafield1.setBounds(150, 70, 110, 20);
        getContentPane().add(kelasfield1);
        kelasfield1.setBounds(150, 100, 110, 20);
        getContentPane().add(alamatfield1);
        alamatfield1.setBounds(150, 130, 110, 20);

        proses.setText("RUN");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        getContentPane().add(proses);
        proses.setBounds(150, 160, 110, 23);

        hasilnama.setText("Nama");
        getContentPane().add(hasilnama);
        hasilnama.setBounds(40, 190, 70, 14);

        hasilkelas.setText("Kelas");
        getContentPane().add(hasilkelas);
        hasilkelas.setBounds(40, 220, 60, 14);
        getContentPane().add(namafield2);
        namafield2.setBounds(150, 190, 110, 20);
        getContentPane().add(kelasfield2);
        kelasfield2.setBounds(150, 220, 110, 20);
        getContentPane().add(alamatfield2);
        alamatfield2.setBounds(150, 250, 110, 20);

        hasilalamat.setText("Alamat");
        getContentPane().add(hasilalamat);
        hasilalamat.setBounds(40, 250, 90, 14);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
    String nama = namafield1.getText();
    namafield2.setText(nama);
    String kelas = kelasfield1.getText();
    kelasfield2.setText(kelas);
    String alamat = alamatfield1.getText();
    alamatfield2.setText(alamat);
    }//GEN-LAST:event_prosesActionPerformed

    private void namafield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namafield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namafield1ActionPerformed

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
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatfield1;
    private javax.swing.JTextField alamatfield2;
    private javax.swing.JLabel editalamat;
    private javax.swing.JLabel editkelas;
    private javax.swing.JLabel editnama;
    private javax.swing.JLabel hasilalamat;
    private javax.swing.JLabel hasilkelas;
    private javax.swing.JLabel hasilnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField kelasfield1;
    private javax.swing.JTextField kelasfield2;
    private javax.swing.JTextField namafield1;
    private javax.swing.JTextField namafield2;
    private javax.swing.JButton proses;
    // End of variables declaration//GEN-END:variables
}
