package ec.edu.iti.pedidos.model;

import ec.edu.iti.pedidos.model.Cliente;
import ec.edu.iti.pedidos.model.DetallePedido;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-02-10T21:45:30", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile ListAttribute<Pedido, DetallePedido> detallePedidoList;
    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile SingularAttribute<Pedido, BigDecimal> pedTotal;
    public static volatile SingularAttribute<Pedido, Date> pedFecha;
    public static volatile SingularAttribute<Pedido, Integer> pedNumero;

}