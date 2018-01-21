/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import modelo.Jugador;
import vista.PanelPrincipal;

import vista.Ventana;
import sun.audio.*;
import vista.VentanaJugador;
import vista.VentanaMenu;
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        String sonido="musica/fondo.wav";
        InputStream in = new FileInputStream(sonido);
        AudioStream au = new AudioStream(in);
        AudioPlayer.player.start(au);

        BaseDatos bD = new BaseDatos();
        
        List<Jugador> jL = new ArrayList<Jugador>(bD.cargarJugadorList());
        GestionDato gD = new GestionDato(jL);
        VentanaMenu ventana=new VentanaMenu(gD);       
       
    }
    
}
