/*
 * XPERTO CONTROL
 * Sistema: XpertoV1
 * Creado: 10/02/2026  21:26:31
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
package ec.edu.iti.pedidos.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author david
 */
@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cli_codigo")
    private Integer cliCodigo;
    @Basic(optional = false)
    @Column(name = "cli_cedula")
    private String cliCedula;
    @Basic(optional = false)
    @Column(name = "cli_nombre")
    private String cliNombre;
    @Basic(optional = false)
    @Column(name = "cli_direccion")
    private String cliDireccion;
    @Basic(optional = false)
    @Column(name = "cli_telefono")
    private String cliTelefono;
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Pedido> pedidoList;

    public Cliente() {
    }

    public Cliente(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public Integer getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliCedula() {
        return cliCedula;
    }

    public void setCliCedula(String cliCedula) {
        this.cliCedula = cliCedula;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getCliDireccion() {
        return cliDireccion;
    }

    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliCodigo != null ? cliCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cliCodigo == null && other.cliCodigo != null) || (this.cliCodigo != null && !this.cliCodigo.equals(other.cliCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.iti.pedidos.model.Cliente[ cliCodigo=" + cliCodigo + " ]";
    }
    
}
