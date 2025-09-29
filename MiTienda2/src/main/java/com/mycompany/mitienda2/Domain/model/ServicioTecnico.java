/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.model;
/**
 *
 * @author mezab
 */
import com.mycompany.mitienda2.Domain.exceptions.ServicioTecnicoException;
import java.time.LocalDate;

public class ServicioTecnico {
    // Identidad compuesta
    private final String idCliente;
    private final String idProducto;

    // Atributos propios de la relación
    private String detallesServicio;
    private LocalDate fecha;
    
  

    // Constructor con validación
    public ServicioTecnico(String idCliente, String idProducto, String detallesServicio, LocalDate fecha) {
        if (idCliente == null || idCliente.isBlank())
                throw new ServicioTecnicoException("El ID de Cliente no puede estar vacío");
            if (idProducto == null || idProducto.isBlank())
                    throw new ServicioTecnicoException("El ID de Producto no puede estar vacío");
                if (detallesServicio == null || detallesServicio.isBlank())
                        throw new ServicioTecnicoException("Los detalles del servicio no pueden estar vacíos");
                    if (fecha == null)
                            throw new ServicioTecnicoException("La fecha no puede ser nula");

        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.detallesServicio = detallesServicio;
        this.fecha = fecha;
    }

    // Métodos 
 
    public void actualizarDetalles(String nuevosDetalles) {
        if (nuevosDetalles == null || nuevosDetalles.isBlank())
                throw new ServicioTecnicoException("Los detalles del servicio no pueden estar vacíos");
                    this.detallesServicio = nuevosDetalles;
    }

    public void reprogramarFecha(LocalDate nuevaFecha) {
        if (nuevaFecha == null)
                throw new ServicioTecnicoException("La nueva fecha no puede ser nula");
                    this.fecha = nuevaFecha;
    }

        // Get
        public String getIdCliente() {
            return idCliente;
        }
        public String getIdProducto() {
            return idProducto;
        }
        public String getDetallesServicio() {
            return detallesServicio;
        }
        public LocalDate getFecha() {
            return fecha;
        }

   
}