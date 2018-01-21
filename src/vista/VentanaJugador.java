/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Jugador;
import snake.GestionDato;

public class VentanaJugador extends JFrame {
    
    private GestionDato gD;
    private JPanel panel;
    private JScrollPane scroll;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private Object[] encabezado;
    private Object[][] datos;

    public VentanaJugador(GestionDato gD) {
        
        super("TOP JUGADORES");
        this.gD = gD;
        this.panel = new JPanel(new BorderLayout());
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.encabezado = new Object[4];
        this.encabezado[0] = "#";
        this.encabezado[1] = "Nombre";
        this.encabezado[2] = "Nivel";
        this.encabezado[3] = "Puntaje";
        
        this.datos = cargarDatosTabla(this.gD.getJugadorList().size(), 4);
        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        
        this.panel.add(scroll);
        this.add(this.panel);
        
    }
    public Object[][] cargarDatosTabla(int m, int n) {       
        Object[][] retorno = new Object[m][n];
        
        int i = 0;
        for(Jugador j: this.gD.getJugadorList()) {
            retorno[i][0] = i+1;
            retorno[i][1] = j.getNombre();
            retorno[i][2] = j.getNivel();
            retorno[i][3] = j.getScore();
        } 
        return retorno; 
    }
    
    
}


