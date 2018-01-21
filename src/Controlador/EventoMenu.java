package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JPanel;
import snake.GestionDato;
import vista.PanelPrincipal;
import vista.VentanaAyuda;
import vista.VentanaDificultad;
import vista.VentanaJugador;
import vista.VentanaMenu;
//import vista.VentanaRanking;

public class EventoMenu implements ActionListener {

    private VentanaMenu ventana;

    public EventoMenu(VentanaMenu ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.ventana.getJugar())) {
            PanelPrincipal panel=new PanelPrincipal(this.ventana.getgD());
            panel.setVisible(true);
        }
        if (e.getSource().equals(this.ventana.getRanking())) {
            VentanaJugador vJ = new VentanaJugador(this.ventana.getgD());
            vJ.setVisible(true);
        }
        if (e.getSource().equals(this.ventana.getAyuda())) {
            VentanaAyuda vAyuda = new VentanaAyuda();
            vAyuda.setVisible(true);
        }

    }

}
