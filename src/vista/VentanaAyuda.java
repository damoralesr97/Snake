package vista;

import Controlador.EventoAyuda;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class VentanaAyuda extends JFrame{
    private JPanel panel;
    private JLabel fondo;
    private JLabel texto;
    private JButton boton;

    public VentanaAyuda(){
        this.setTitle("SNAKE AYUDA");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(2);
        this.setResizable(false);
        this.initComp();
        this.setVisible(true);
    }
    
    public void initComp(){
        //Panel
        this.panel=new JPanel(new BorderLayout());              
        this.panel.setSize(this.getSize());
        //Fondo
        this.fondo=new JLabel();
        this.fondo.setIcon(new ImageIcon("imagenes/Ayuda.png"));
        this.panel.add(this.fondo);
        //Label con texto
        this.texto=new JLabel("<html>SNAKE este juego consisten en el recorrido de una serpiente que cuando se alimenta de una manzana aumenta el tamaño de su cuerpo y lalalallalalalalallaalalalalalalalalalalalalalal<br>mas cosas ajasnddasdjlasjdkajsdlkajsldkasldkjaksjd<br><br>con br se dan los saltos de linea<html>");
        this.texto.setBounds(85,100,330,300);
        //Boton
        this.boton=new JButton("ENTENDIDO");
        this.boton.setBorder(new LineBorder(Color.BLACK));
        this.boton.setFont(new Font("Arial",Font.PLAIN,18));
        this.boton.setForeground(Color.white);
        this.boton.setBounds(187,400,120,30);    
        this.boton.setBackground(Color.gray);
        //ActionListener del boton
        this.boton.addActionListener(new EventoAyuda(this));
        //Agregacion
        this.add(this.boton);
        this.add(this.texto);
        this.add(this.panel);
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getFondo() {
        return fondo;
    }

    public void setFondo(JLabel fondo) {
        this.fondo = fondo;
    }

    public JLabel getTexto() {
        return texto;
    }

    public void setTexto(JLabel texto) {
        this.texto = texto;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }
    
    
}
