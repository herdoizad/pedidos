package ec.edu.iti.pedidos.model;

import ec.edu.iti.pedidos.model.DetallePedido;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-02-10T21:45:30", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, BigDecimal> proPrecio;
    public static volatile ListAttribute<Producto, DetallePedido> detallePedidoList;
    public static volatile SingularAttribute<Producto, String> proNombre;
    public static volatile SingularAttribute<Producto, Integer> proCodigo;

}