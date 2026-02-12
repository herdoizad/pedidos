package ec.edu.iti.pedidos.model;

import ec.edu.iti.pedidos.model.Pedido;
import ec.edu.iti.pedidos.model.Producto;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-02-10T21:45:30", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(DetallePedido.class)
public class DetallePedido_ { 

    public static volatile SingularAttribute<DetallePedido, Integer> depCodigo;
    public static volatile SingularAttribute<DetallePedido, BigDecimal> depCantidad;
    public static volatile SingularAttribute<DetallePedido, Pedido> pedido;
    public static volatile SingularAttribute<DetallePedido, Producto> producto;
    public static volatile SingularAttribute<DetallePedido, BigDecimal> depSubtotal;

}