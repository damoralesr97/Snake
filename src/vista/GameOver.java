package vista;

import Controlador.EventoMenu;
import Controlador.EventoPuntuacion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class GameOver extends JFrame{

    private JPanel panel;
    private JLabel fondo;
    private JButton guardar;
    private JTextField nombre;
    
    public GameOver(){
        this.setTitle("GUARDAR PUNTUACION");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(2);
        this.setResizable(false);
        this.initComp();
    }
    
    public void initComp(){
         //Panel
        this.panel=new JPanel(new BorderLayout());              
        this.panel.setSize(this.getSize());
        //Fondo
        this.fondo=new JLabel();
        this.fondo.setIcon(new ImageIcon("imagenes/GameOver.png"));
        this.panel.add(this.fondo);
        //Boton
        this.guardar=new JButton("Guardar Puntuacion");
        this.guardar.setBorder(new LineBorder(Color.BLACK));
        this.guardar.setFont(new Font("Arial",Font.PLAIN,20));
        this.guardar.setForeground(Color.white);
        this.guardar.setBounds(165,400,180,30);    
        this.guardar.setBackground(Color.gray);
        //Texto con el nombre
        this.nombre=new JTextField();
        this.nombre.setBounds(180,360,150,25);
        
        //ActionListener Botones
        this.guardar.addActionListener(new EventoPuntuacion(this));
        
        //Agregar a la ventana
        this.add(this.nombre);
        this.add(this.guardar);
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

    public JButton getGuardar() {
        return guardar;
    }

    public void setGuardar(JButton guardar) {
        this.guardar = guardar;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }
    
}
