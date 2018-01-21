/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.util.List;
import modelo.Jugador;

/**
 *
 * @author Pedro
 */
public class GestionDato {
    
    private List<Jugador> jugadorList;

    public GestionDato(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }
    
    public boolean addJugador(Jugador j) {
        return this.jugadorList.add(j);
    }
    
}
