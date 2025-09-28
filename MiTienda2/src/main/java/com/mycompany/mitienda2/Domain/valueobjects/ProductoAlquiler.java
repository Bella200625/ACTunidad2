/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.valueobjects;

/**
 *
 * @author mezab
 */
public final class ProductoAlquiler {
    //atrinbuto del vo Producto alquiler
    private final double precioPorHora;
    //constructor 
    public ProductoAlquiler(double precioPorHora) {
        if (precioPorHora <= 0) {
            throw new IllegalArgumentException("El precio por hora debe ser mayor a 0");
        }
        this.precioPorHora = precioPorHora;
    }
// get de precio por hora
        public double getPrecioPorHora() {
            return precioPorHora;
    }
}