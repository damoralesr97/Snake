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
import modelo.Comida;

/**
 *
 * @author DavidMorales
 */
public class Ventana extends JFrame implements java.awt.event.KeyListener{
    private JPanel panelJuego;
    private JLabel fondo;
    private Serpiente serpiente;
    private Timer tiempo;
    int ban = 0;
    private Comida comida;
    private int perdio=0;

    
    
    
    public Ventana() {
        this.setTitle("Snake");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.addKeyListener(this);
        
        
        
        this.panelJuego = new JPanel();
        this.panelJuego.setSize(this.getSize());
        this.panelJuego.setLayout(null);
        this.panelJuego.setVisible(true);
        
        this.fondo = new JLabel();
        this.fondo.setSize(this.panelJuego.getSize());
        this.fondo.setIcon(new ImageIcon("imagenes/ne.gif"));
        this.fondo.setVisible(true);
        this.panelJuego.add(this.fondo,0);
        
        this.serpiente = new Serpiente();
        this.panelJuego.add(this.serpiente.getSerpiente().get(0),0);
        
        this.add(this.panelJuego);
        
        this.comida = new Comida();
        this.panelJuego.add(this.comida.getComida(),0);
        
        this.tiempo = new Timer(150, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                for(int i=serpiente.getSerpiente().size()-1;i>0;i--){
                    if(serpiente.getSerpiente().get(0).getLocation().equals(serpiente.getSerpiente().get(i).getLocation())){
                        tiempo.stop();
                    }
                }
                
                
                
                comida.getComi().setBounds(comida.getComida().getBounds());
                serpiente.getSerp().setBounds(serpiente.getSerpiente().get(0).getBounds());
                if(serpiente.getSerpiente().get(0).getX() > 500){
                    perdio=1;
                }
                if(serpiente.getSerpiente().get(0).getX() < 0){
                    perdio=1;
                }
                if(serpiente.getSerpiente().get(0).getY() > 500){
                    perdio=1;
                }
                if(serpiente.getSerpiente().get(0).getY() < 0){
                    perdio=1;
                }
                if(perdio==1){
                    tiempo.stop();
                }
                
                if(comida.getComi().intersects(serpiente.getSerp())){
                    comida.setX(comida.getAleatorio().nextInt(460));
                    comida.setY(comida.getAleatorio().nextInt(460));
                    comida.getComida().setLocation(comida.getX(),comida.getY());
                    
                    
                    //INSERTAR AUIDIO
                    comida.getComida().repaint();
                    Serpiente s = new Serpiente();
                    s.getAux().setLocation(200,200);
                    s.getAux().setSize(20,20);
                    s.getAux().setIcon(new ImageIcon("imagenes/cuerpo.png"));
                    s.getAux().setVisible(true);
                    serpiente.getSerpiente().add(s.getAux());
                    panelJuego.add(serpiente.getSerpiente().get(serpiente.getSerpiente().size()-1),0);
                }
                
                
                
                for(int i=serpiente.getSerpiente().size()-1;i>0;i--){
                    serpiente.getSerpiente().get(i).setLocation(serpiente.getSerpiente().get(i-1).getLocation());
                    serpiente.getSerpiente().get(i).repaint();
                }
                serpiente.getSerpiente().get(0).setLocation(serpiente.getSerpiente().get(0).getX()+serpiente.getX(), serpiente.getSerpiente().get(0).getY()+serpiente.getY());
                
                
            }
        });
        
        
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_UP){
                    //System.out.println("Arriba");
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
                    //System.out.println("Abajo");
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
                    //System.out.println("Izquierda");
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
                    //System.out.println("Derecha");
                    if(serpiente.getSerpiente().get(0).getX() < 500){
                        serpiente.setY(0);
                        serpiente.setX(serpiente.getDesplazamiento());
                        serpiente.getSerpiente().get(0).setIcon(new ImageIcon("imagenes/caraDer.png"));
                    }
                    if(ban==0){
                        tiempo.start();
                        ban=1;
                    }
                }}

    @Override
    public void keyReleased(KeyEvent e) {
    
    }
    
    
    
}
