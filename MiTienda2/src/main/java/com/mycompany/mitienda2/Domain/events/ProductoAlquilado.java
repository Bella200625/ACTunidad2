/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.events;

/**
 *
 * @author mezab
 */

// Evento de dominio ProductoAlquilado
public class ProductoAlquilado {

    //Atributos relacionados con entidades o Value Objects

    private final String productoId;   
    private final String clienteId;    
    private final double precioPorHora; 

    // Datos propios del evento 

    private final String fechaAlquiler;   
    private final int horasAlquiladas;    
    private final double totalPagado;      

    // Constructor 
    public ProductoAlquilado(String productoId, String clienteId, double precioPorHora,
                             String fechaAlquiler, int horasAlquiladas, double totalPagado) {
        this.productoId = productoId;
        this.clienteId = clienteId;
        this.precioPorHora = precioPorHora;
        this.fechaAlquiler = fechaAlquiler;
        this.horasAlquiladas = horasAlquiladas;
        this.totalPagado = totalPagado;
    }

    // get
    public String getProductoId() {
        return productoId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public int getHorasAlquiladas() {
        return horasAlquiladas;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    @Override
    public String toString() {
        return "ProductoAlquilado{" + "productoId=" + productoId + ", clienteId=" + clienteId + ", precioPorHora=" + precioPorHora + ", fechaAlquiler=" + fechaAlquiler + ", horasAlquiladas=" + horasAlquiladas + ", totalPagado=" + totalPagado + '}';
    }



}
