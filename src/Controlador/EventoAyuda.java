/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaAyuda;

/**
 *
 * @author stali
 */
public class EventoAyuda implements ActionListener{
    
    private VentanaAyuda ventana;

    public EventoAyuda(VentanaAyuda ventana) {
        this.ventana = ventana;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventana.getBoton())){
            this.ventana.setVisible(false);
        }
        
    }
    
}
