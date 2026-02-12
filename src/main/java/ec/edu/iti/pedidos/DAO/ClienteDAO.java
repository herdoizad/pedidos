/*
 * XPERTO CONTROL
 * Sistema: XpertoV1
 * Creado: 10/02/2026  21:49:01
 * 
 * Los contenidos de este archivo son propiedad privada  y estan 
 * protegidos por la licencia "XPERTO LICENCIA".
 * 
 * No se puede utilizar, reproducir o copiar el contenido de este 
 * archivo sin la respectiva autorizacion de sus creadores.
 * 
 * Copyright (C) 2026 XPERTO 
 * Todos los derechos reservados.
 */
package ec.edu.iti.pedidos.DAO;

import ec.edu.iti.pedidos.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author david
 */
public class ClienteDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PedidosPU");
    EntityManager em = emf.createEntityManager();

    public List<Cliente> listarTodo() {
        try {
            return em.createQuery("select c from Cliente c", Cliente.class).getResultList();
        } catch (Exception ex) {
            System.out.println("Error al recuperar cliente. " + ex);
        }

        em.close();
        return null;
    }
    
    public void insertar(Cliente cliente) {
        em.getTransaction().begin();
        try {
           em.persist(cliente);
           em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error al insertar un cliente. " + ex);
            em.getTransaction().rollback();
        }

        em.close();
    }
    
    public void actualizar(Cliente cliente) {
        em.getTransaction().begin();
        try {
           em.merge(cliente);
           em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error al insertar un cliente. " + ex);
            em.getTransaction().rollback();
        }

        em.close();
    }
    
    public void eliminar(Cliente cliente) {
        em.getTransaction().begin();
        try {
           cliente = em.merge(cliente);
           em.remove(cliente);
           em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error al insertar un cliente. " + ex);
            em.getTransaction().rollback();
        }

        em.close();
    }
    
}
