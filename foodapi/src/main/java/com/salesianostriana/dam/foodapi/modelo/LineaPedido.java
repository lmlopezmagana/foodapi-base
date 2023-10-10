package com.salesianostriana.dam.foodapi.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LineaPedido {

    @Id
    @ManyToOne
    private Pedido pedido;

    @Id
    @GeneratedValue
    private Long codLinea;

    private double precioUnitario;

    private int cantidad;

    @ManyToOne
    private Producto producto;

    public LineaPedidoPK getId() { // Nos devuelve la PK completa
        return new LineaPedidoPK(pedido, codLinea);
    }

    public void setId(LineaPedidoPK pk) { // Podemos settear la PK compelta
        this.pedido = pk.getPedido();
        this.codLinea = pk.getCodLinea();
    }





}
