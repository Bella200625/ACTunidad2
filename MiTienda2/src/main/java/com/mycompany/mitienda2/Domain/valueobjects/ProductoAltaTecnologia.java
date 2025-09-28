/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.valueobjects;
import java.time.LocalDate;
//
public final class ProductoAltaTecnologia {
    private final String paisOrigen;
    private final String fabricante;
    //forma estandar para manejar fechas 
    private final LocalDate fechaFabricacion;

    public ProductoAltaTecnologia(String paisOrigen, String fabricante, LocalDate fechaFabricacion) {
        if (paisOrigen == null || paisOrigen.isBlank()) {
            throw new IllegalArgumentException("El país de origen no puede estar vacío.");
            }
            if (fabricante == null || fabricante.isBlank()) {
                throw new IllegalArgumentException("El fabricante no puede estar vacío.");
            }
                if (fechaFabricacion == null || fechaFabricacion.isAfter(LocalDate.now())) {
                    throw new IllegalArgumentException("La fecha de fabricación no puede ser futura.");
                }

        this.paisOrigen = paisOrigen;
        this.fabricante = fabricante;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getFabricante() {
        return fabricante;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }
}