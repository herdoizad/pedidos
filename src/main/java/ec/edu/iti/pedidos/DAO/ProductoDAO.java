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

import ec.edu.iti.pedidos.model.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author david
 */
public class ProductoDAO {

    /**
     * Mñetodo que lista todos los productos
     *
     * @return Lista de productos
     */
    public List<Producto> listarTodo() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PedidosPU");
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("select p from Producto p", Producto.class).getResultList();
        } catch (Exception ex) {
            System.out.println("Error al recuperar producto. " + ex);
        }

        em.close();
        return null;
    }

    public List<Producto> buscarPorCodigo(Integer codigo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PedidosPU");
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("select p from Producto p where p.proCodigo = :var", Producto.class)
                    .setParameter("var", codigo)
                    .getResultList();
        } catch (Exception ex) {
            System.out.println("Error al recuperar producto. " + ex);
        }

        em.close();
        return null;
    }

    /**
     * Método para buscar un producto por nombre
     *
     * @param nombre String con el nombre
     * @return Lista de Productos
     */
    public List<Producto> buscarPorNombre(String nombre) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PedidosPU");
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery(
                    "select p from Producto p where LOWER(p.proNombre) like :nombre", Producto.class)
                    .setParameter("nombre", "%" + nombre.toLowerCase() + "%")
                    .getResultList();

        } finally {
            em.close();
        }
    }

    /**
     * Método que inserta un producto
     *
     * @param producto Objeto de tipo Producto
     */
    public void insertar(Producto producto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PedidosPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        try {
            em.persist(producto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error al insertar un producto. " + ex);
            em.getTransaction().rollback();
        }

        em.close();
    }

    /**
     * Método que actualiza un producto
     *
     * @param producto Objeto de tipo Producto
     */
    public void actualizar(Producto producto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PedidosPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        try {
            em.merge(producto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error al modificar un producto. " + ex);
            em.getTransaction().rollback();
        }

        em.close();
    }

    /**
     * Método que elimina un producto
     *
     * @param producto Objeto de tipo Producto
     */
    public void eliminar(Producto producto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PedidosPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        try {
            producto = em.merge(producto);
            em.remove(producto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Error al eliminar un producto. " + ex);
            em.getTransaction().rollback();
        }

        em.close();
    }

}
