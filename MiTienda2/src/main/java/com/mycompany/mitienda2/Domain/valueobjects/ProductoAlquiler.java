/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.valueobjects;

/**
 *
 * @author mezab
 */
public record ProductoAlquiler(Precio precioHora) {
         public ProductoAlquiler {
            if (precioHora == null) {
                throw new IllegalArgumentException("El precio del alquiler es obligatorio");
        }
    }
}
