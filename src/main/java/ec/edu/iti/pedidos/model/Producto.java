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
import java.math.BigDecimal;
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
@Table(name = "producto")
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pro_codigo")
    private Integer proCodigo;
    @Basic(optional = false)
    @Column(name = "pro_nombre")
    private String proNombre;
    @Basic(optional = false)
    @Column(name = "pro_precio")
    private BigDecimal proPrecio;
    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
    private List<DetallePedido> detallePedidoList;

    public Producto() {
    }

    public Producto(Integer proCodigo) {
        this.proCodigo = proCodigo;
    }

    public Integer getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(Integer proCodigo) {
        this.proCodigo = proCodigo;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public BigDecimal getProPrecio() {
        return proPrecio;
    }

    public void setProPrecio(BigDecimal proPrecio) {
        this.proPrecio = proPrecio;
    }

    public List<DetallePedido> getDetallePedidoList() {
        return detallePedidoList;
    }

    public void setDetallePedidoList(List<DetallePedido> detallePedidoList) {
        this.detallePedidoList = detallePedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proCodigo != null ? proCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.proCodigo == null && other.proCodigo != null) || (this.proCodigo != null && !this.proCodigo.equals(other.proCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.iti.pedidos.model.Producto[ proCodigo=" + proCodigo + " ]";
    }
    
}
