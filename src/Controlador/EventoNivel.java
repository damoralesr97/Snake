package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Ventana;
import vista.VentanaDificultad;

public class EventoNivel implements ActionListener{
    
    private VentanaDificultad ventana;

    public EventoNivel(VentanaDificultad ventana) {
        this.ventana = ventana;
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventana.getFacil())){
            /*Ventana ventana=new Ventana();
            ventana.setVisible(true);
            this.ventana.setVisible(false);*/
        }
        if(e.getSource().equals(this.ventana.getMedio())){
            /*Ventana ventana=new Ventana();
            ventana.setVisible(true);
            this.ventana.setVisible(false);*/
        }
        if(e.getSource().equals(this.ventana.getDificil())){
            /*Ventana ventana=new Ventana();
            ventana.setVisible(true);
            this.ventana.setVisible(false);*/
        }
        
    }
    
}
