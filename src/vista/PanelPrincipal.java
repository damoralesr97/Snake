/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.Jugador;
import snake.BaseDatos;
import snake.GestionDato;

/**
 *
 * @author Pedro
 */
public class PanelPrincipal extends JFrame implements ActionListener {
    
    private GestionDato gD;
    private JDesktopPane escritorio;
    private JPanel panel;
    private JPanel panelJugador;
    private JMenuBar barraMenu;
    private List<JMenu> menuList;
    private List<JMenuItem> menuItemList;
    private JButton nuevoJuego = new JButton("Nuevo Juego");
    private JComboBox comboDif;
    private JButton puntajes = new JButton("Puntajes");
    private JButton salir = new JButton("Salir");
    private JLabel nombre = new JLabel("Nombre:");
    private JTextField txtNom = new JTextField(15);
    private JButton aceptar = new JButton("Aceptar");
    private String[] datosCombo;
    private Jugador jugador;
    
    public PanelPrincipal(GestionDato gD) {
        
        this.setTitle("Snake");
        this.gD = gD;
        this.setSize(500, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.panel = new JPanel(new GridLayout(4,1));
        this.panel.setBackground(Color.LIGHT_GRAY);
        
        this.datosCombo = new String[3];
        datosCombo[0] = "Facil";
        datosCombo[1] = "Normal";
        datosCombo[2] = "Dificil";
        this.comboDif = new JComboBox(datosCombo);
        this.comboDif.setBackground(Color.green);
        this.comboDif.setName("Dificultad");
 
        this.nuevoJuego.setBackground(Color.GREEN);
        this.puntajes.setBackground(Color.green);
        this.salir.setBackground(Color.red);
        this.salir.setForeground(Color.white);
        
        this.nuevoJuego.addActionListener(this);
        this.puntajes.addActionListener(this);
        this.salir.addActionListener(this);
        
        this.panel.add(this.nuevoJuego);
        this.panel.add(this.comboDif);
        this.panel.add(this.puntajes);
        this.panel.add(this.salir);
        
        
        
        
        this.add(this.panel);
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource().equals(this.nuevoJuego)) {
            this.panelJugador = new JPanel();
            this.panelJugador.add(this.nombre);
            this.panelJugador.add(this.txtNom);
            this.panelJugador.add(this.aceptar);
            this.aceptar.addActionListener(this);
            JDialog nP = new JDialog();
            nP.setLocationRelativeTo(null);
            nP.setTitle("Nuevo Jugador");
            nP.setSize(200, 130);
            nP.add(this.panelJugador);
            nP.setVisible(true);
            
            
        }
        if(ae.getSource().equals(this.puntajes)) {
            System.out.println("Puntajes");
            VentanaJugador vJ = new VentanaJugador(this.gD);
            vJ.setVisible(true);
        }
        if(ae.getSource().equals(this.salir)) {
            
            
            
            
        }
        if(ae.getSource().equals(this.aceptar)) {
            String nombreJ = this.txtNom.getText();
            int sel = this.comboDif.getSelectedIndex();
            String dif = this.datosCombo[sel];
            this.jugador = new Jugador(nombreJ, dif);
            BaseDatos bD = new BaseDatos();
            this.gD.addJugador(jugador);
            bD.insertarJugador(jugador);
            System.out.println("Nuevo Juego");
            Ventana v = new Ventana(jugador);
            
        }
        
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JPanel getPanelJugador() {
        return panelJugador;
    }

    public void setPanelJugador(JPanel panelJugador) {
        this.panelJugador = panelJugador;
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public JButton getNuevoJuego() {
        return nuevoJuego;
    }

    public void setNuevoJuego(JButton nuevoJuego) {
        this.nuevoJuego = nuevoJuego;
    }

    public JComboBox getComboDif() {
        return comboDif;
    }

    public void setComboDif(JComboBox comboDif) {
        this.comboDif = comboDif;
    }

    public JButton getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(JButton puntajes) {
        this.puntajes = puntajes;
    }

    public JButton getSalir() {
        return salir;
    }

    public void setSalir(JButton salir) {
        this.salir = salir;
    }

    public JLabel getNombre() {
        return nombre;
    }

    public void setNombre(JLabel nombre) {
        this.nombre = nombre;
    }

    public JTextField getTxtNom() {
        return txtNom;
    }

    public void setTxtNom(JTextField txtNom) {
        this.txtNom = txtNom;
    }

    public JButton getAceptar() {
        return aceptar;
    }

    public void setAceptar(JButton aceptar) {
        this.aceptar = aceptar;
    }

    public String[] getDatosCombo() {
        return datosCombo;
    }

    public void setDatosCombo(String[] datosCombo) {
        this.datosCombo = datosCombo;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    
    
}
