/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Jugador;

/**
 *
 * @author Pedro
 */
public class BaseDatos {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SnakePU");
    
    public boolean insertarJugador(Jugador j) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(j);
        em.getTransaction().commit();
        return true;
    }
    
    public List<Jugador> cargarJugadorList() {
        List<Jugador> retorno = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        retorno = em.createQuery("SELECT j FROM Jugador j ORDER BY j.id").getResultList();
        //em.getTransaction().commit();
        return retorno;
    }
    
}
