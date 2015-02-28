/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea1videoclub;

import java.time.temporal.Temporal;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Kimberly
 */
public class Ventana extends javax.swing.JFrame {
    private ArrayList <VideoClub> listaVideoClubs;
    private boolean cargaPeliculasActualizadas = true;
    
    
    public Ventana() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        listaVideoClubs = new ArrayList();
        
        
        //ciclo para cargar el combobox que contiene los años para el registro de peliculas
        int annoActual = 2015;
        while(annoActual >= 1930){
            comboAnnos.addItem(annoActual);
            annoActual--;
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_NombrePeli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_genero = new javax.swing.JTextField();
        spinerNumCopias = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboEscogerVideo = new javax.swing.JComboBox();
        botonGuardarPeli = new javax.swing.JButton();
        botonImprimirPelis = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreClub = new javax.swing.JTextField();
        txtUbicacionVideo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        guardarVideos = new javax.swing.JButton();
        comboAnnos = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        comboVideoEliminar = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboEliminarPelicula = new javax.swing.JComboBox();
        botonEliminar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("Registro de películas:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Género:");

        txt_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_generoActionPerformed(evt);
            }
        });

        spinerNumCopias.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Año:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Número de copias:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Video Club:");

        botonGuardarPeli.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonGuardarPeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.jpg"))); // NOI18N
        botonGuardarPeli.setText("Agregar");
        botonGuardarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarPeliActionPerformed(evt);
            }
        });

        botonImprimirPelis.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonImprimirPelis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/print.jpg"))); // NOI18N
        botonImprimirPelis.setText("Imprimir");
        botonImprimirPelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimirPelisActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel8.setText("Registro de Video Clubes:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Ubicación:");

        guardarVideos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        guardarVideos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon-guardar.jpg"))); // NOI18N
        guardarVideos.setText("Guardar");
        guardarVideos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarVideosActionPerformed(evt);
            }
        });

        comboAnnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAnnosActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel11.setText("Eliminar pelicula:");

        comboVideoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVideoEliminarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Video club:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Película:");

        botonEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/videoclub-1.jpg"))); // NOI18N

        botonSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gifs-animados-is-delich-099599.gif"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(193, 193, 193)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(230, 230, 230)
                        .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel9)
                        .addGap(111, 111, 111)
                        .addComponent(txtNombreClub, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(117, 117, 117)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboAnnos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboEscogerVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spinerNumCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(guardarVideos))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(189, 189, 189)
                            .addComponent(txt_NombrePeli, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82)
                            .addComponent(jLabel10)
                            .addGap(97, 97, 97)
                            .addComponent(txtUbicacionVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addComponent(jLabel7)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botonImprimirPelis)
                .addGap(24, 24, 24)
                .addComponent(botonGuardarPeli)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12)))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboVideoEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEliminarPelicula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEliminar)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel14)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jLabel8))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9))
                    .addComponent(txtNombreClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_NombrePeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtUbicacionVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(221, 221, 221))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(comboVideoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(comboEliminarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinerNumCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardarVideos)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboAnnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEscogerVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGuardarPeli)
                            .addComponent(botonImprimirPelis)
                            .addComponent(botonSalir)
                            .addComponent(botonEliminar))
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void txt_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_generoActionPerformed

    private void botonGuardarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarPeliActionPerformed
        // TODO add your handling code here:
        String nombrePelicula = txt_NombrePeli.getText();
        String generoPelicula = txt_genero.getText();
        int numeroCopias=(int) spinerNumCopias.getValue();
        String IDP = txt_ID.getText();

        if(nombrePelicula.equals("")){
            JOptionPane.showMessageDialog(this, "No hay nombre para la pelicula");
            return;
        }
        else if(generoPelicula.equals("")){
            JOptionPane.showMessageDialog(this, "No hay genero para la pelicula");
            return;
        }
        else if(IDP.equals("")){
            JOptionPane.showMessageDialog(this, "No existe un ID");
            return;
        }
        else{
            Pelicula nuevaPeli = new Pelicula(generoPelicula,(int) comboAnnos.getSelectedItem(), nombrePelicula, numeroCopias, IDP);
            int videoSeleccionado= comboEscogerVideo.getSelectedIndex();
            VideoClub videoSelecc = listaVideoClubs.get(videoSeleccionado);
            videoSelecc.agregarPelicula(nuevaPeli);
            actualizarPeliculas();

        }

        txtNombreClub.setText("");
        txtUbicacionVideo.setText("");
        txt_ID.setText("");
        txt_NombrePeli.setText("");
        txt_genero.setText("");

    }//GEN-LAST:event_botonGuardarPeliActionPerformed

    private void botonImprimirPelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimirPelisActionPerformed
        // TODO add your handling code here:

        if (listaVideoClubs.isEmpty()){
            JOptionPane.showMessageDialog(this, "No hay elementos");
        }

        else {

            int tamannoListaVideos = listaVideoClubs.size();

            for (int i=0; i<tamannoListaVideos; i++){
                VideoClub video = listaVideoClubs.get(i);
                System.out.println(video.getNombre() + ":" );

                if (video.obtenerListaPeliculas().isEmpty()){
                    System.out.println("No posee peliculas");
                }

                video.obtenerListaPeliculas().stream().forEach((pelicula) -> {
                    System.out.println(pelicula.toString());
                });

            }
    }//GEN-LAST:event_botonImprimirPelisActionPerformed
    }
   public void actualizarPeliculas(){
      
        comboEliminarPelicula.removeAllItems();
        String descripcion;
        int videoSelec = comboVideoEliminar.getSelectedIndex();
        VideoClub vid = listaVideoClubs.get(videoSelec);
        if(vid.obtenerListaPeliculas().size()>0){
            for(Pelicula tempP: vid.obtenerListaPeliculas()){
                descripcion = tempP.getNombre();
                comboEliminarPelicula.addItem(descripcion);
            }
        }
        
       
   }
    public void actualizarVideos(){
        comboEscogerVideo.removeAllItems();
        String descripcion;
        for(VideoClub videoSeleccionado : listaVideoClubs){
            descripcion = videoSeleccionado.getNombre();
            comboEscogerVideo.addItem(descripcion);
        }
        
        comboVideoEliminar.removeAllItems();
        
        for(VideoClub videoEliminar : listaVideoClubs){
            descripcion = videoEliminar.getNombre();
            comboVideoEliminar.addItem(descripcion);    
        }
        
        
        
}
    
    private void guardarVideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarVideosActionPerformed
        // TODO add your handling code here:
        String nomVideo = txtNombreClub.getText();
        String ubicacionVideo = txtUbicacionVideo.getText();

        if (nomVideo.equals("")){
            JOptionPane.showMessageDialog(this, "Nombre vacío");
        }
        else if (ubicacionVideo.equals("")){
            JOptionPane.showMessageDialog(this, "No hay ubicacion");
        }
        else{
            VideoClub nuevoVideo = new VideoClub(nomVideo, ubicacionVideo);
            
            listaVideoClubs.add(nuevoVideo);
           cargaPeliculasActualizadas = false; 
           actualizarVideos();
           cargaPeliculasActualizadas= true;
           txtNombreClub.setText("");
           txtUbicacionVideo.setText("");
           
        }
        
        
    }//GEN-LAST:event_guardarVideosActionPerformed

    private void comboAnnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnnosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboAnnosActionPerformed

    private void comboVideoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVideoEliminarActionPerformed
        // TODO add your handling code here:
        if(cargaPeliculasActualizadas ==true){
            actualizarPeliculas();
        }
    }//GEN-LAST:event_comboVideoEliminarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if(-1 == comboEscogerVideo.getSelectedIndex()){
            JOptionPane.showMessageDialog(this,"No hay video club seleccionado");
        }
        else if(-1==comboEliminarPelicula.getSelectedIndex()){
            JOptionPane.showMessageDialog(this,"No hay pelicula seleccionada");
        }
        else{
        int videoActual = comboEscogerVideo.getSelectedIndex();
        int peliculaActual = comboEliminarPelicula.getSelectedIndex();
        VideoClub videoSelecc =listaVideoClubs.get(videoActual);
        videoSelecc.obtenerListaPeliculas().remove(peliculaActual);
        
        actualizarPeliculas();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardarPeli;
    private javax.swing.JButton botonImprimirPelis;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox comboAnnos;
    private javax.swing.JComboBox comboEliminarPelicula;
    private javax.swing.JComboBox comboEscogerVideo;
    private javax.swing.JComboBox comboVideoEliminar;
    private javax.swing.JButton guardarVideos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spinerNumCopias;
    private javax.swing.JTextField txtNombreClub;
    private javax.swing.JTextField txtUbicacionVideo;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_NombrePeli;
    private javax.swing.JTextField txt_genero;
    // End of variables declaration//GEN-END:variables
}
