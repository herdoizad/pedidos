/*
 * XPERTO CONTROL
 * Sistema: XpertoV1
 * Creado: 10/02/2026  21:18:17
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

package ec.edu.iti.pedidos.main;

import ec.edu.iti.pedidos.DAO.ClienteDAO;
import ec.edu.iti.pedidos.model.Cliente;
import java.util.List;

/**
 *
 * @author david
 */
public class Pedidos {

    public static void main(String[] args) {
        ClienteDAO cliente = new ClienteDAO();
        List<Cliente> listaClientes = cliente.listarTodo();
        for(Cliente c : listaClientes){
            System.out.println(c.getCliCedula());
            System.out.println(c.getCliNombre());
        }
    }
}
