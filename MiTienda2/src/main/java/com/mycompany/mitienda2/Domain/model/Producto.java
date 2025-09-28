/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.model;
import com.mycompany.mitienda2.Domain.exceptions.ProductoException; 
/**
 *
 * @author mezab
 */
public class Producto {
    // Identidad única
        private final String idProducto;
        private final String codigo;       
        private String categoria;
        private String nombre;
        private String modelo;
        private String descripcion;

        // Constructor con validacion y variantes 
    public Producto(String idProducto, String codigo, String categoria, String nombre, String modelo, String descripcion) {
        
            if (idProducto == null || idProducto.isBlank())
                throw new ProductoException("El ID del cliente no puede estar vacío.");

                if (codigo == null || codigo.isBlank())
                    throw new ProductoException("El código del producto no puede estar vacío.");
                    if (categoria == null || categoria.isBlank())
                        throw new ProductoException("La categoría es obligatoria.");
                        if (nombre == null || nombre.isBlank())
                            throw new ProductoException("El nombre es obligatorio.");
                            if (modelo == null || modelo.isBlank())
                                throw new ProductoException("El modelo es obligatorio.");

            this.idProducto = idProducto;
            this.codigo = codigo;
            this.categoria = categoria;
            this.nombre = nombre;
            this.modelo = modelo;
            this.descripcion = (descripcion == null) ? "" : descripcion;
    }

    // Métodos para actualizar datos con validación
    public void Rename(String nuevoNombre) {
        if (nuevoNombre == null || nuevoNombre.isBlank())
            throw new ProductoException ("El nombre no puede estar vacío.");
                this.nombre = nuevoNombre;
    }


            // Getters

            public String getIdCliente() {
                return idProducto;
            }
            public String getCodigo() {
                return codigo;
            }

            public String getCategoria() {
                return categoria;
            }

            public String getNombre() {
                return nombre;
            }

            public String getModelo() {
                return modelo;
            }

            public String getDescripcion() {
                return descripcion;
    }
    
}
