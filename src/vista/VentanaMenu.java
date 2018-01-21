package vista;

import Controlador.EventoMenu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import snake.GestionDato;

public class VentanaMenu extends JFrame {

    private JPanel panel;
    private JLabel fondo;
    private JButton jugar;
    private JButton ranking;
    private JButton ayuda;
    private GestionDato gD;

    public VentanaMenu(GestionDato gD) {
        this.setTitle("SNAKE - MENU");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.initComp();
        this.setVisible(true);
        this.gD=gD;
    }

    public void initComp() {
        //Panel
        this.panel = new JPanel(new BorderLayout());
        this.panel.setSize(this.getSize());
        //Fondo
        this.fondo = new JLabel();
        this.fondo.setIcon(new ImageIcon("imagenes/Menu.png"));
        this.panel.add(this.fondo);
        //Boton
        this.jugar = new JButton("MODO DE JUEGO");
        this.jugar.setBorder(new LineBorder(Color.BLACK));
        this.jugar.setFont(new Font("Arial", Font.PLAIN, 18));
        this.jugar.setForeground(Color.white);
        this.jugar.setBounds(156, 160, 180, 50);
        this.jugar.setBackground(Color.gray);

        this.ranking = new JButton("RANKING");
        this.ranking.setBorder(new LineBorder(Color.BLACK));
        this.ranking.setFont(new Font("Arial", Font.PLAIN, 24));
        this.ranking.setForeground(Color.white);
        this.ranking.setBounds(156, 240, 180, 50);
        this.ranking.setBackground(Color.gray);

        this.ayuda = new JButton("AYUDA");
        this.ayuda.setBorder(new LineBorder(Color.black));
        this.ayuda.setFont(new Font("Arial", Font.PLAIN, 24));
        this.ayuda.setForeground(Color.white);
        this.ayuda.setBounds(156, 320, 180, 50);
        this.ayuda.setBackground(Color.gray);

        //ActionListener Botones
        this.jugar.addActionListener(new EventoMenu(this));
        this.ranking.addActionListener(new EventoMenu(this));
        this.ayuda.addActionListener(new EventoMenu(this));

        //Agregar a la ventana
        this.add(this.jugar);
        this.add(this.ranking);
        this.add(this.ayuda);
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

    public JButton getJugar() {
        return jugar;
    }

    public void setJugar(JButton jugar) {
        this.jugar = jugar;
    }

    public JButton getRanking() {
        return ranking;
    }

    public void setRanking(JButton ranking) {
        this.ranking = ranking;
    }

    public JButton getAyuda() {
        return ayuda;
    }

    public void setAyuda(JButton ayuda) {
        this.ayuda = ayuda;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

}
