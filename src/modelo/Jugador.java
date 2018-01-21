/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Pedro
 */
@Entity
public class Jugador implements Serializable {
    
    @Id
    private long id;
    private String nombre;
    private String nivel;
    private int score;

    public Jugador() {
    }

    public Jugador(String nombre, String nivel) {
        this.id = 0;
        this.nombre = nombre;
        this.nivel = nivel;
        this.score = 0;
    }
    
    public Jugador(long id, String nombre, String nivel, int score) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    
}
