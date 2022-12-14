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

import mitutoyo.data.Funciones;
import jguiextensible.JGuiSimple;

/**
 * This class creates a graphical interface for the data structure with the same name
 * 
 * @author a31r1z
 */
public class FuncionesGUI extends JGuiSimple {

    private static final long serialVersionUID = 1L;
    
    private final Funciones funciones = new Funciones();

    /**
     * Creates new form NewBeanForm
     */
    public FuncionesGUI() {
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

        jguiFunciones = new jguiextensible.JGuiSimple();
        jchkSelectorZeroAbs = new javax.swing.JCheckBox();
        jchkFuncionTolerancia = new javax.swing.JCheckBox();
        jchkCambioSentidoContaje = new javax.swing.JCheckBox();
        jchkValoracionGoNg = new javax.swing.JCheckBox();
        jchkAjusteFino = new javax.swing.JCheckBox();
        jchkBloqueo = new javax.swing.JCheckBox();

        setName("Funciones"); // NOI18N
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jguiFunciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funciones opcionales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bitstream Vera Sans", 1, 12))); // NOI18N
        jguiFunciones.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jchkSelectorZeroAbs.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        jchkSelectorZeroAbs.setText("Selector ZERO/ABS");

        jchkFuncionTolerancia.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        jchkFuncionTolerancia.setText("Funcion de tolerancia");

        jchkCambioSentidoContaje.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        jchkCambioSentidoContaje.setText("Cambio sentido contaje");

        jchkValoracionGoNg.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        jchkValoracionGoNg.setText("Valoracion GO/+-NG");

        jchkAjusteFino.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        jchkAjusteFino.setText("Ajuste fino");

        jchkBloqueo.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        jchkBloqueo.setText("Bloqueo");

        javax.swing.GroupLayout jguiFuncionesLayout = new javax.swing.GroupLayout(jguiFunciones);
        jguiFunciones.setLayout(jguiFuncionesLayout);
        jguiFuncionesLayout.setHorizontalGroup(
            jguiFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jguiFuncionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jguiFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchkSelectorZeroAbs)
                    .addComponent(jchkCambioSentidoContaje)
                    .addComponent(jchkValoracionGoNg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jguiFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchkAjusteFino)
                    .addComponent(jchkFuncionTolerancia)
                    .addComponent(jchkBloqueo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jguiFuncionesLayout.setVerticalGroup(
            jguiFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jguiFuncionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jguiFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jguiFuncionesLayout.createSequentialGroup()
                        .addComponent(jchkSelectorZeroAbs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchkCambioSentidoContaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchkValoracionGoNg))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jguiFuncionesLayout.createSequentialGroup()
                        .addComponent(jchkFuncionTolerancia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchkAjusteFino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchkBloqueo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jguiFunciones);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jchkAjusteFino;
    private javax.swing.JCheckBox jchkBloqueo;
    private javax.swing.JCheckBox jchkCambioSentidoContaje;
    private javax.swing.JCheckBox jchkFuncionTolerancia;
    private javax.swing.JCheckBox jchkSelectorZeroAbs;
    private javax.swing.JCheckBox jchkValoracionGoNg;
    private jguiextensible.JGuiSimple jguiFunciones;
    // End of variables declaration//GEN-END:variables
 
    /**
     * Validates the data inserted in the diferent widgets of the gui
     * 
     * @return true of false if data inserted in the fields are valid
     */
     @Override
    protected boolean validateData() {
            
        return true;
    }
    
    /**
     * Saves the data inserted in the gui
     */
    @Override
    protected void saveData() {
        
        funciones.setAjusteFino(jchkAjusteFino.isSelected());
        funciones.setBloqueo(jchkBloqueo.isSelected());
        funciones.setCambioSentidoContaje(jchkCambioSentidoContaje.isSelected());
        funciones.setFuncionTolerancia(jchkFuncionTolerancia.isSelected());
        funciones.setSelectorZeroAbs(jchkSelectorZeroAbs.isSelected());
        funciones.setValoracionGoNg(jchkValoracionGoNg.isSelected());
        
        funciones.guardarDatos();
    }
    
    /**
     * Cleans the data inserted in the widgets of the gui
     */
    @Override
    protected void cleanData() {
        
       jchkAjusteFino.setSelected(false);
       jchkBloqueo.setSelected(false);
       jchkCambioSentidoContaje.setSelected(false);
       jchkFuncionTolerancia.setSelected(false);
       jchkSelectorZeroAbs.setSelected(false);
       jchkValoracionGoNg.setSelected(false);
       
       funciones.borrarDatos();
    }
    
    /**
     * Updates the value of diferent widgets notified by other component whose name is id.
     * 
     * @param id name of the component that notifies a change in his value
     * @param value value that changes
     */
      @Override
     protected void updateChanges(String id, Object value) {}

}
