package vista;

import Controlador.EventoNivel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class VentanaDificultad extends JFrame{
    private JPanel panel;
    private JLabel fondo;
    private JButton facil;
    private JButton medio;
    private JButton dificil;

    public VentanaDificultad(){
        this.setTitle("DIFFICULTY");
        this.setSize(300,300);
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
        this.fondo.setIcon(new ImageIcon("imagenes/Dificultad.png"));
        this.panel.add(this.fondo);
        //Boton
        this.facil=new JButton("FACIL");
        this.facil.setBorder(new LineBorder(Color.BLACK));
        this.facil.setFont(new Font("Arial",Font.PLAIN,24));
        this.facil.setForeground(Color.white);
        this.facil.setBounds(100,70,130,30);    
        this.facil.setBackground(Color.gray);
        
        this.medio=new JButton("MEDIO");
        this.medio.setBorder(new LineBorder(Color.BLACK));
        this.medio.setFont(new Font("Arial",Font.PLAIN,24));
        this.medio.setForeground(Color.white);
        this.medio.setBounds(100,140,130,30);    
        this.medio.setBackground(Color.gray);
        
        this.dificil=new JButton("DIFICIL");
        this.dificil.setBorder(new LineBorder(Color.black));
        this.dificil.setFont(new Font("Arial",Font.PLAIN,24));
        this.dificil.setForeground(Color.white);
        this.dificil.setBounds(100,210,130,30);    
        this.dificil.setBackground(Color.gray);
        
        //ActionListener Botones
        
        this.facil.addActionListener(new EventoNivel(this));
        this.medio.addActionListener(new EventoNivel(this));
        this.dificil.addActionListener(new EventoNivel(this));
        
        //Agregar a la ventana
        this.add(this.facil);
        this.add(this.medio);
        this.add(this.dificil);
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

    public JButton getFacil() {
        return facil;
    }

    public void setFacil(JButton facil) {
        this.facil = facil;
    }

    public JButton getMedio() {
        return medio;
    }

    public void setMedio(JButton medio) {
        this.medio = medio;
    }

    public JButton getDificil() {
        return dificil;
    }

    public void setDificil(JButton dificil) {
        this.dificil = dificil;
    }
    
}
