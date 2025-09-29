/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.model;
import com.mycompany.mitienda2.Domain.exceptions.ProductoException; 
import com.mycompany.mitienda2.Domain.valueobjects.*;
import com.mycompany.mitienda2.Domain.enums.ProductoCategoriaEnum;
import com.mycompany.mitienda2.Domain.enums.DisponibilidadAlquilerEnum;
/**
 *
 * @author mezab
 */
public class Producto {
    // Identidad única
        private final String idProducto;
        private final String codigo;    
        private String nombre;
        private String modelo;
        private String descripcion;
        //ENUM
        private ProductoCategoriaEnum categoria;
        private DisponibilidadAlquilerEnum disponibleAlquiler;
        //AGREGADO RAIZ
        private Precio precio;
        private ProductoAlquiler alquiler;
        private ProductoAltaTecnologia altaTecnologia;
        
        // Constructor con validacion y variantes 
    public Producto(String idProducto, String codigo, ProductoCategoriaEnum categoria, String nombre, String modelo, String descripcion,Precio precio,DisponibilidadAlquilerEnum disponibleAlquiler,  ProductoAlquiler alquiler,ProductoAltaTecnologia altaTecnologia ) {
        
            if (idProducto == null || idProducto.isBlank())
                throw new ProductoException("El ID del Producto no puede estar vacío.");

                if (codigo == null || codigo.isBlank())
                    throw new ProductoException("El código del producto no puede estar vacío.");
                    if (categoria == null)
                        throw new ProductoException("La categoría es obligatoria.");
                        if (nombre == null || nombre.isBlank())
                            throw new ProductoException("El nombre es obligatorio.");
                            if (modelo == null || modelo.isBlank())
                                throw new ProductoException("El modelo es obligatorio.");
                                if (precio == null)
                                    throw new ProductoException("E precio no puede estar vacio.");
                                

            this.idProducto = idProducto;
            this.codigo = codigo;
            this.categoria = categoria; 
            this.nombre = nombre;
            this.modelo = modelo;
            this.descripcion = descripcion;
            this.disponibleAlquiler = disponibleAlquiler; 
            this.precio = precio;
            this.alquiler = alquiler;                    
            this.altaTecnologia = altaTecnologia;
    }

    // Métodos
   
    public void Rename(String nuevoNombre) {
        if (nuevoNombre == null || nuevoNombre.isBlank())
            throw new ProductoException ("El nombre no puede estar vacío.");
                this.nombre = nuevoNombre;
    }
    //actualizamos el precio del producto y nos aseguramos que no sea nulo
    public void precioActualizado(Precio newPrecio) {
        if (newPrecio == null)
            throw new ProductoException ("El nombre no puede estar vacío.");
                this.precio = newPrecio;
    }
    //metodo para asignar o reemplaza la información de alta tecnología del producto

     public void asignarAltaTec(ProductoAltaTecnologia newAlta) {
        if (newAlta == null)
            throw new ProductoException ("El nombre no puede estar vacío.");
                this.altaTecnologia = newAlta;
    }
     //metodo para actualizar la informacion del alquiler asignado a un producto
      public void actualizarAlquiler(ProductoAlquiler newAlquiler) {
        if (newAlquiler == null)
            throw new ProductoException("El alquiler no puede ser nulo");
                this.alquiler = newAlquiler;
}

    // Cambiar categoría del producto
    public void cambiarCategoria(ProductoCategoriaEnum nuevaCategoria) {
        if (nuevaCategoria == null)
            throw new ProductoException("La categoría no puede ser nula.");
        this.categoria = nuevaCategoria;
    }
    
    // Cambiar la disponibilidad de alquiler
    public void actualizarDisponibilidad(DisponibilidadAlquilerEnum nuevaDisponibilidad) {
        if (nuevaDisponibilidad == null)
            throw new ProductoException("La disponibilidad de alquiler no puede ser nula.");
        this.disponibleAlquiler = nuevaDisponibilidad;
    }
  
    
            // Getters

            public String getIdProducto() {
                return idProducto;
            }
            public String getCodigo() {
                return codigo;
            }

            public ProductoCategoriaEnum getCategoria() {
                return categoria;
            }

            public DisponibilidadAlquilerEnum getDisponibleAlquiler() {
                return disponibleAlquiler;
            }

            public Precio getPrecio() {
                return precio;
            }

            public ProductoAlquiler getAlquiler() {
                return alquiler;
            }

            public ProductoAltaTecnologia getAltaTecnologia() {
                return altaTecnologia;
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
