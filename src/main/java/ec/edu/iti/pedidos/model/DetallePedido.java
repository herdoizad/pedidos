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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author david
 */
@Entity
@Table(name = "detalle_pedido")
@NamedQueries({
    @NamedQuery(name = "DetallePedido.findAll", query = "SELECT d FROM DetallePedido d")})
public class DetallePedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dep_codigo")
    private Integer depCodigo;
    @Basic(optional = false)
    @Column(name = "dep_cantidad")
    private BigDecimal depCantidad;
    @Basic(optional = false)
    @Column(name = "dep_subtotal")
    private BigDecimal depSubtotal;
    @JoinColumn(name = "dep_pedido", referencedColumnName = "ped_numero")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pedido pedido;
    @JoinColumn(name = "dep_producto", referencedColumnName = "pro_codigo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto producto;

    public DetallePedido() {
    }

    public DetallePedido(Integer depCodigo) {
        this.depCodigo = depCodigo;
    }

    public Integer getDepCodigo() {
        return depCodigo;
    }

    public void setDepCodigo(Integer depCodigo) {
        this.depCodigo = depCodigo;
    }

    public BigDecimal getDepCantidad() {
        return depCantidad;
    }

    public void setDepCantidad(BigDecimal depCantidad) {
        this.depCantidad = depCantidad;
    }

    public BigDecimal getDepSubtotal() {
        return depSubtotal;
    }

    public void setDepSubtotal(BigDecimal depSubtotal) {
        this.depSubtotal = depSubtotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depCodigo != null ? depCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePedido)) {
            return false;
        }
        DetallePedido other = (DetallePedido) object;
        if ((this.depCodigo == null && other.depCodigo != null) || (this.depCodigo != null && !this.depCodigo.equals(other.depCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.iti.pedidos.model.DetallePedido[ depCodigo=" + depCodigo + " ]";
    }
    
}
