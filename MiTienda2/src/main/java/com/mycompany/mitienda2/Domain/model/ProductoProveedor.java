/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.model;

/**
 *
 * @author bellllllllllllllllllllllllll 
 */
import com.mycompany.mitienda2.Domain.valueobjects.Precio;
import com.mycompany.mitienda2.Domain.exceptions.ProductoProveedorException;
import java.time.LocalDate;

public class ProductoProveedor {
    // Relación con entidades principales
    private final String idProducto;   
    private final String idProveedor;  

    // Atributos propios 
    private LocalDate fechaAdquisicion;
    //VO
    private Precio precioCompra;

    // Constructor con validación
    public ProductoProveedor( String idProducto, String idProveedor,
                             LocalDate fechaAdquisicion, Precio precioCompra) {
            if (idProducto == null || idProducto.isBlank())
                    throw new ProductoProveedorException("El ID de Producto no puede estar vacío");
                if (idProveedor == null || idProveedor.isBlank())
                        throw new ProductoProveedorException("El ID de Proveedor no puede estar vacío");
                    if (fechaAdquisicion == null)
                            throw new ProductoProveedorException("La fecha de adquisición no puede ser nula");
                        if (precioCompra == null)
                                throw new ProductoProveedorException("El precio de compra no puede ser nulo");

        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
        this.fechaAdquisicion = fechaAdquisicion;
        this.precioCompra = precioCompra;
    }

    // Métodos 
    public void actualizarPrecioCompra(Precio Precio) {
        if (Precio == null)
            throw new ProductoProveedorException("El precio de compra no puede ser nulo");
                this.precioCompra = Precio;
    }

    public void actualizarFechaAdquisicion(LocalDate fechaAdquisicion) {
        if (fechaAdquisicion == null)
            throw new ProductoProveedorException("La fecha de adquisición no puede ser nula");
                this.fechaAdquisicion = fechaAdquisicion;
    }

        // Getters
     
        
        public String getIdProducto() {
            return idProducto;
        }
        public String getIdProveedor() {
            return idProveedor;
        }
        public LocalDate getFechaAdquisicion() {
            return fechaAdquisicion;
        }
        public Precio getPrecioCompra() {
            return precioCompra;
    }
}