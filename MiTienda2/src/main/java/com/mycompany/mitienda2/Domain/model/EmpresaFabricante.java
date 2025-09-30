/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.model;
import com.mycompany.mitienda2.Domain.exceptions.EMPfabricanteException;
/**
 *
 * @author mezab
 */
public class EmpresaFabricante {

    // Identidad única
    private final String idFabricante;

    // Atributos
    private String nombre;
    private String direccion;
    private int numeroEmpleados;

    // Constructor con validación
    public EmpresaFabricante(String idFabricante, String nombre, String direccion, int numeroEmpleados) {
        if (idFabricante == null || idFabricante.isBlank()) {
            throw new EMPfabricanteException("El ID del fabricante no puede estar vacío");
        }
            if (nombre == null || nombre.isBlank()) {
                throw new EMPfabricanteException("El nombre del fabricante no puede estar vacío");
            }
                if (direccion == null || direccion.isBlank()) {
                    throw new EMPfabricanteException("La dirección del fabricante no puede estar vacía");
                }
                    if (numeroEmpleados < 1) {
                        throw new EMPfabricanteException("El fabricante debe tener al menos un empleado");
                    }

        this.idFabricante = idFabricante;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEmpleados = numeroEmpleados;
    }

    // Métodos 

    // Cambiar nombre del fabricante
    public void cambiarNombre(String nuevoNombre) {
        if (nuevoNombre == null || nuevoNombre.isBlank()) 
            throw new EMPfabricanteException("El nombre no puede estar vacío");
        
        this.nombre = nuevoNombre;
    }

    // Actualizar la dirección
    public void actualizarDireccion(String nuevaDireccion) {
        if (nuevaDireccion == null || nuevaDireccion.isBlank()) 
            throw new EMPfabricanteException("La dirección no puede estar vacía");
        this.direccion = nuevaDireccion;
    }

    // Actualizar número de empleados
    public void actualizarNumeroEmpleados(int nuevoNumero) {
        if (nuevoNumero < 1) 
            throw new EMPfabricanteException("El fabricante debe tener al menos un empleado");
        this.numeroEmpleados = nuevoNumero;
    }

        // Getters
        public String getIdFabricante() {
            return idFabricante;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public int getNumeroEmpleados() {
            return numeroEmpleados;
        }
    }
