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
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author david
 */
@Entity
@Table(name = "pedido")
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ped_numero")
    private Integer pedNumero;
    @Basic(optional = false)
    @Column(name = "ped_fecha")
    @Temporal(TemporalType.DATE)
    private Date pedFecha;
    @Basic(optional = false)
    @Column(name = "ped_total")
    private BigDecimal pedTotal;
    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
    private List<DetallePedido> detallePedidoList;
    @JoinColumn(name = "pedi_cliente", referencedColumnName = "cli_codigo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(Integer pedNumero) {
        this.pedNumero = pedNumero;
    }

    public Integer getPedNumero() {
        return pedNumero;
    }

    public void setPedNumero(Integer pedNumero) {
        this.pedNumero = pedNumero;
    }

    public Date getPedFecha() {
        return pedFecha;
    }

    public void setPedFecha(Date pedFecha) {
        this.pedFecha = pedFecha;
    }

    public BigDecimal getPedTotal() {
        return pedTotal;
    }

    public void setPedTotal(BigDecimal pedTotal) {
        this.pedTotal = pedTotal;
    }

    public List<DetallePedido> getDetallePedidoList() {
        return detallePedidoList;
    }

    public void setDetallePedidoList(List<DetallePedido> detallePedidoList) {
        this.detallePedidoList = detallePedidoList;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedNumero != null ? pedNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.pedNumero == null && other.pedNumero != null) || (this.pedNumero != null && !this.pedNumero.equals(other.pedNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.iti.pedidos.model.Pedido[ pedNumero=" + pedNumero + " ]";
    }
    
}
