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

import jguiextensible.JGuiSimple;
import mitutoyo.data.Especificaciones;

/**
 * This class creates a graphical interface for the data structure with the same name
 * 
 * @author a31r1z
 */
public class EspecificacionesGUI extends JGuiSimple {

    private static final long serialVersionUID = 1L;

    private final Especificaciones especificaciones = new Especificaciones();
    /**
     * Creates new form EspecificacionesGUI
     */
    public EspecificacionesGUI() {
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

        articuloGUI1 = new mitutoyo.interfaces.ArticuloGUI();
        dimensionesGUI1 = new mitutoyo.interfaces.DimensionesGUI();

        setName("Especificaciones"); // NOI18N
        add(articuloGUI1);

        dimensionesGUI1.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        add(dimensionesGUI1);

        getAccessibleContext().setAccessibleName("Especificaciones");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mitutoyo.interfaces.ArticuloGUI articuloGUI1;
    private mitutoyo.interfaces.DimensionesGUI dimensionesGUI1;
    // End of variables declaration//GEN-END:variables
   
    /**
     * Validates the data inserted in the diferent widgets of the gui
     * 
     * @return true of false if data inserted in the fields are valid
     */
    @Override
    protected boolean validateData() {
            
        return articuloGUI1.validateData() && dimensionesGUI1.validateData();
               
   }
    
    /**
     * Saves the data inserted in the gui
     */
    @Override
    protected void saveData() {
        
        articuloGUI1.saveData();
        dimensionesGUI1.saveData();
        
        especificaciones.guardarDatos();
        
  }
  
    /**
     * Cleans the data inserted in the widgets of the gui
     */
    @Override
    protected void cleanData() {
    
      articuloGUI1.cleanData();
      dimensionesGUI1.cleanData();
      
      especificaciones.borrarDatos();
      
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
