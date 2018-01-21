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
import vista.Ventana;
import sun.audio.*;
/**
 *
 * @author DavidMorales
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       
        String sonido="musica/fondo.wav";
        InputStream in = new FileInputStream(sonido);
        AudioStream au = new AudioStream(in);
        AudioPlayer.player.start(au);
        
        Ventana v = new Ventana();
        
       
    }
    
}
