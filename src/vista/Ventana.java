/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Serpiente;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author DavidMorales
 */
public class Ventana extends JFrame {
    private JPanel panelJuego;
    private JLabel fondo;
    private Serpiente serpiente;
    private Timer tiempo;
    int ban = 0;

    public Ventana() {
        this.setTitle("Snake");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        
        this.panelJuego = new JPanel();
        this.panelJuego.setSize(this.getSize());
        this.panelJuego.setLayout(null);
        this.panelJuego.setVisible(true);
        
        this.fondo = new JLabel();
        this.fondo.setSize(this.panelJuego.getSize());
        this.fondo.setIcon(new ImageIcon("imagenes/fondo.png"));
        this.fondo.setVisible(true);
        this.panelJuego.add(this.fondo,0);
        
        this.serpiente = new Serpiente();
        this.panelJuego.add(this.serpiente.getSerpiente().get(0),0);
        
        this.add(this.panelJuego);
        
        this.tiempo = new Timer(300, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                serpiente.getSerpiente().get(0).setLocation(serpiente.getSerpiente().get(0).getX()+serpiente.getX(), serpiente.getSerpiente().get(0).getY()+serpiente.getY());
                serpiente.getSerpiente().get(0).repaint();
                
            }
        });
        
        
        
        
        this.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    System.out.println("Arriba");
                    if(serpiente.getSerpiente().get(0).getY() > 0){
                        serpiente.setY(-(serpiente.getDesplazamiento()));
                        serpiente.setX(0);
                        serpiente.getSerpiente().get(0).setIcon(new ImageIcon("imagenes/caraArriba.png"));
                    }
                    if(ban==0){
                        tiempo.start();
                        ban=1;
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    System.out.println("Abajo");
                    if(serpiente.getSerpiente().get(0).getY() < 500){
                        serpiente.setY(serpiente.getDesplazamiento());
                        serpiente.setX(0);
                        serpiente.getSerpiente().get(0).setIcon(new ImageIcon("imagenes/caraAbajo.png"));
                    }
                    if(ban==0){
                        tiempo.start();
                        ban=1;
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    System.out.println("Izquierda");
                    if(serpiente.getSerpiente().get(0).getX() > 0){
                        serpiente.setY(0);
                        serpiente.setX(-(serpiente.getDesplazamiento()));
                        serpiente.getSerpiente().get(0).setIcon(new ImageIcon("imagenes/caraIzq.png"));
                    }
                    if(ban==0){
                        tiempo.start();
                        ban=1;
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    System.out.println("Derecha");
                    if(serpiente.getSerpiente().get(0).getX() < 500){
                        serpiente.setY(0);
                        serpiente.setX(serpiente.getDesplazamiento());
                        serpiente.getSerpiente().get(0).setIcon(new ImageIcon("imagenes/caraDer.png"));
                    }
                    if(ban==0){
                        tiempo.start();
                        ban=1;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        this.setVisible(true);
    }
    
    
    
}