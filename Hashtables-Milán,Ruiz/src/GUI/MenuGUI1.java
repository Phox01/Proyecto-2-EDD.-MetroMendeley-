/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import Classes.Hashtable;
import Classes.Resumen;
import static GUI.Autores.hashtable;
import static GUI.Autores.hashtable2;
import static GUI.Autores.hashtable3;
import static GUI.Autores.listaAutores;
import static GUI.Autores.listaPalabrasClave;

/**
 *
 * @author enriq
 */
public class MenuGUI1 extends javax.swing.JFrame {

    /**
     * Creates new form MenuGUI
     */
    
    static Hashtable hashtable;
    public MenuGUI1(Hashtable hashtable) {
        initComponents();
        this.hashtable=hashtable;
        setLocationRelativeTo(null);
        
        
        for (int i = 0; i < hashtable.getArray().length; i++) {
            
            
            if(hashtable.getArray()[i]!=null){
                Investigaciones.addItem(hashtable.getArray()[i].getTitle());
            }
        }
        
        
        
        
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
        Investigaciones = new javax.swing.JComboBox<>();
        boton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Investigaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvestigacionesActionPerformed(evt);
            }
        });
        jPanel1.add(Investigaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 280, 40));

        boton.setText("OK");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        jPanel1.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        AreaTexto.setColumns(20);
        AreaTexto.setRows(5);
        jScrollPane1.setViewportView(AreaTexto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 250, 120));

        jLabel1.setText("ANALISIS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 70, -1));

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/obit.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InvestigacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvestigacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvestigacionesActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
     
       String texto=Investigaciones.getSelectedItem().toString();
       String mostrar="";
        
       int numerobusqueda=hashtable.NumeroHashtable(texto);
        
       Resumen res= hashtable.getArray()[numerobusqueda];
       
       String hola= res.getBody();
       String[] dividido1 = hola.split(" ");
       
        System.out.println(res.getKeywords().length);
       
        for (int i = 0; i < res.getKeywords().length; i++) {
            
            int contador =0;
            String palabra=res.getKeywords()[i];
            
            System.out.println(palabra);
            
            
        for (int k = 0; k < dividido1.length; k++) {
            if (dividido1[k].contains(palabra)){
                contador++;
            }
            
            
            
        }
          mostrar=mostrar+"palabra clave : "+palabra+" aparece "+ Integer.toString(contador)+" veces\n";  
            
            
        }
       AreaTexto.setText(mostrar);
       
        
        
    }//GEN-LAST:event_botonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Controlador window4= new Controlador( hashtable, hashtable2, listaPalabrasClave, listaAutores, hashtable3);
        window4.setVisible(true);
        this.setVisible(false);
        
        
        
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
            java.util.logging.Logger.getLogger(MenuGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI1(hashtable).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTexto;
    private javax.swing.JComboBox<String> Investigaciones;
    private javax.swing.JButton boton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
