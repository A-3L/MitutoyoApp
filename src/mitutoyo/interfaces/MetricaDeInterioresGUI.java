/**
 * AppMitutoyo is an application to show how works the implementation of the library JGuiExtensible
 * that develops a reusable gui pattern.
 * 
 * Copyright (C) 2022 Alberto Eiriz Lopez
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
*/
package mitutoyo.interfaces;

import mitutoyo.Utilidades;
import mitutoyo.data.MetricaDeInteriores;
import jguiextensible.JGuiSimple;

/**
 * This class creates a graphical interface for the data structure with the same name
 * 
 * @author a31r1z
 */
public class MetricaDeInterioresGUI extends JGuiSimple {

    private static final long serialVersionUID = 1L;

    private final MetricaDeInteriores metDeInt = new MetricaDeInteriores();
    
    /**
     * Creates new form MetricaInterior
     */
    public MetricaDeInterioresGUI() {
        
      
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

        jguiMetricaDeInteriores = new jguiextensible.JGuiSimple();
        lblRangoInterior = new javax.swing.JLabel();
        lblMedida_R = new javax.swing.JLabel();
        lblMedida_f = new javax.swing.JLabel();
        lblMedida_g = new javax.swing.JLabel();
        lblMetricaInterior = new javax.swing.JLabel();
        lblPuntosMediciion = new javax.swing.JLabel();
        jftxRangoInterior = new javax.swing.JFormattedTextField();
        jftxMedida_f = new javax.swing.JFormattedTextField();
        jftxMedida_g = new javax.swing.JFormattedTextField();
        jftxMedida_R = new javax.swing.JFormattedTextField();
        jftxMetricaInterior = new javax.swing.JFormattedTextField();
        jcboxPuntosMedicion = new javax.swing.JComboBox<>();

        setName("Metrica de Interiores"); // NOI18N
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jguiMetricaDeInteriores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Metrica de interiores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bitstream Vera Sans", 1, 12))); // NOI18N
        jguiMetricaDeInteriores.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        jguiMetricaDeInteriores.setName("Metrica de Interiores"); // NOI18N

        lblRangoInterior.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblRangoInterior.setText("Rango interior (mm)");

        lblMedida_R.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblMedida_R.setText("R (mm)");

        lblMedida_f.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblMedida_f.setText("f (mm)");

        lblMedida_g.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblMedida_g.setText("g (mm)");

        lblMetricaInterior.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblMetricaInterior.setText("Metrica interior desde");

        lblPuntosMediciion.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblPuntosMediciion.setText("Puntos de medicion");

        jftxRangoInterior.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxRangoInterior.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxRangoInterior.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxMedida_f.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxMedida_f.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxMedida_f.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxMedida_g.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxMedida_g.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxMedida_g.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxMedida_R.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxMedida_R.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxMedida_R.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxMetricaInterior.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxMetricaInterior.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxMetricaInterior.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jcboxPuntosMedicion.setFont(new java.awt.Font("URW Gothic", 1, 11)); // NOI18N
        jcboxPuntosMedicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "1", "2", "3" }));

        javax.swing.GroupLayout jguiMetricaDeInterioresLayout = new javax.swing.GroupLayout(jguiMetricaDeInteriores);
        jguiMetricaDeInteriores.setLayout(jguiMetricaDeInterioresLayout);
        jguiMetricaDeInterioresLayout.setHorizontalGroup(
            jguiMetricaDeInterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jguiMetricaDeInterioresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jguiMetricaDeInterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMetricaInterior)
                    .addComponent(lblRangoInterior)
                    .addComponent(lblPuntosMediciion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jguiMetricaDeInterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jguiMetricaDeInterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jftxMetricaInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jftxRangoInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcboxPuntosMedicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jguiMetricaDeInterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedida_R)
                    .addComponent(lblMedida_f)
                    .addComponent(lblMedida_g))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jguiMetricaDeInterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jftxMedida_R, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxMedida_f, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxMedida_g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jguiMetricaDeInterioresLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jftxMedida_R, jftxMedida_f, jftxMedida_g, jftxMetricaInterior, jftxRangoInterior});

        jguiMetricaDeInterioresLayout.setVerticalGroup(
            jguiMetricaDeInterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jguiMetricaDeInterioresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jguiMetricaDeInterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRangoInterior, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jftxRangoInterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedida_R, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jftxMedida_R, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jguiMetricaDeInterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMetricaInterior, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jftxMetricaInterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedida_f, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jftxMedida_f, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jguiMetricaDeInterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPuntosMediciion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcboxPuntosMedicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedida_g, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jftxMedida_g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jguiMetricaDeInteriores);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jcboxPuntosMedicion;
    private javax.swing.JFormattedTextField jftxMedida_R;
    private javax.swing.JFormattedTextField jftxMedida_f;
    private javax.swing.JFormattedTextField jftxMedida_g;
    private javax.swing.JFormattedTextField jftxMetricaInterior;
    private javax.swing.JFormattedTextField jftxRangoInterior;
    private jguiextensible.JGuiSimple jguiMetricaDeInteriores;
    private javax.swing.JLabel lblMedida_R;
    private javax.swing.JLabel lblMedida_f;
    private javax.swing.JLabel lblMedida_g;
    private javax.swing.JLabel lblMetricaInterior;
    private javax.swing.JLabel lblPuntosMediciion;
    private javax.swing.JLabel lblRangoInterior;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Validates the data inserted in the diferent widgets of the gui
     * 
     * @return true of false if data inserted in the fields are valid
     */
    @Override
    protected boolean validateData( ) {
    
        return Utilidades.matcher(jftxRangoInterior, "Rango interior", this)
                && Utilidades.matcher(jftxMedida_R, "Medida_R", this)
                && Utilidades.matcher(jftxMetricaInterior, "MetricaInterior", this)
                && Utilidades.matcher(jftxMedida_f, "Medida_f", this)
                && Utilidades.matcher(jcboxPuntosMedicion, "Puntos de Medicion", this)
                && Utilidades.matcher(jftxMedida_g, "Medida_g", this);
    } 
    
    /**
     * Saves the data inserted in the gui
     */
    @Override
      protected void saveData() {
          
        metDeInt.setMedida_R(Integer.valueOf(String.valueOf(jftxMedida_R.getValue())));
        metDeInt.setMedida_f(Integer.valueOf(String.valueOf(jftxMedida_f.getValue())));
        metDeInt.setMedida_g(Integer.valueOf(String.valueOf(jftxMedida_g.getValue())));
        metDeInt.setRangoInterior(Integer.valueOf(String.valueOf(jftxRangoInterior.getValue())));
        metDeInt.setMetricaInterior(Integer.valueOf(String.valueOf(jftxMetricaInterior.getValue())));
        metDeInt.setPuntosDeMedicion(Integer.valueOf(String.valueOf(jcboxPuntosMedicion.getSelectedItem())));

        metDeInt.guardarDatos();
      }
    
     /**
     * Cleans the data inserted in the widgets of the gui
     */
    @Override
      protected void cleanData() {
          
          jftxMedida_R.setValue(null);
          jftxMedida_f.setValue(null);
          jftxMedida_g.setValue(null);
          jftxRangoInterior.setValue(null);
          jftxMetricaInterior.setValue(null);
          jcboxPuntosMedicion.setSelectedIndex(0);
          
          metDeInt.borrarDatos();       
      }
      
      /**
     * Updates the value of diferent widgets notified by other component whose name is id.
     * 
     * @param id name of the component that notifies a change in his value
     * @param value value that changes
     */
    @Override
    protected void updateChanges(String id, Object value) {
      
        System.out.println("Actualizando RangoInterior");
        
          switch(id) {
                 case "rangoMedida" -> {jftxRangoInterior.setText(String.valueOf(value)); }
        }
      
    }  
}
