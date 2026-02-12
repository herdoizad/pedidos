package ec.edu.iti.pedidos.model;

import ec.edu.iti.pedidos.model.Pedido;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-02-10T21:45:30", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> cliNombre;
    public static volatile SingularAttribute<Cliente, String> cliTelefono;
    public static volatile SingularAttribute<Cliente, String> cliDireccion;
    public static volatile ListAttribute<Cliente, Pedido> pedidoList;
    public static volatile SingularAttribute<Cliente, Integer> cliCodigo;
    public static volatile SingularAttribute<Cliente, String> cliCedula;

}