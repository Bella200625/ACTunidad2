/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.events;

/**
 *
 * @author mezab
 */
import java.time.Instant;
public class ProductoVendido {
     // Identificador único del producto que fue vendido
    private final String productoId;

    // Identificador único del cliente que realizó la compra
    private final String clienteId;

    // Precio final de la venta
    private final double precio;

    // Fecha en la que ocurrió el evento de venta
    private final Instant fecha;

    // Constructor con validaciones de reglas de negocio
    public ProductoVendido (String productoId, String clienteId, double precio, Instant fecha) {
        if (productoId == null || productoId.isBlank())
            throw new IllegalArgumentException("El ID del producto no puede estar vacío");
        if (clienteId == null || clienteId.isBlank())
            throw new IllegalArgumentException("El ID del cliente no puede estar vacío");
        if (precio <= 0)
            throw new IllegalArgumentException("El precio debe ser mayor que 0");
        if (fecha == null)
            fecha = Instant.now();

        this.productoId = productoId;
        this.clienteId = clienteId;
        this.precio = precio;
        this.fecha = fecha;
    }
//get
    public String getProductoId() {
        return productoId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public double getPrecio() {
        return precio;
    }

    public Instant getFecha() {
        return fecha;
    }

  
}
