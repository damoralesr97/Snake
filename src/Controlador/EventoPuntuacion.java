package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GameOver;

public class EventoPuntuacion implements ActionListener{

    private GameOver ventana;

    public EventoPuntuacion(GameOver ventana) {
        this.ventana = ventana;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Evento para guardar los jugadores
        if(e.getSource().equals(this.ventana.getGuardar())){
            String texto=this.ventana.getNombre().getText();
        }
    }
    
}
