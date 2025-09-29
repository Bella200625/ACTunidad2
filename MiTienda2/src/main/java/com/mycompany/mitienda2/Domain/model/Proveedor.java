/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.model;
import com.mycompany.mitienda2.Domain.exceptions.ProveedorException;
/**
 *
 * @author mezab
 */
public class Proveedor {
    private String idProveedor;
    private String NIF;
    private String direccion; 

    public Proveedor(String idProveedor, String NIF, String direccion) {
        if (idProveedor == null || idProveedor.isBlank())
            throw new ProveedorException ("El ID del proveedor no puede ser vacio."); 
            if (NIF == null || NIF.isBlank())
                throw new ProveedorException("El nif del proveedor no puede ser vacio");
                if (direccion == null || direccion.isBlank())
                    throw new ProveedorException("El nif del proveedor no puede ser vacio");
        this.idProveedor = idProveedor;
        this.NIF = NIF;
        this.direccion = direccion;
    }
    
    //metodos 
    
    public void ActuaizarNIF (String NIF){
    if (NIF == null || NIF.isBlank())
        throw new ProveedorException ("El nif del proveedor no puede ser vacio");
             this.NIF = NIF;
    }
    
    public void ActuaizarDireccion (String direccion){
    if (direccion == null || direccion.isBlank())
        throw new ProveedorException ("La direcciion del proveedor no puede ser vacio");
             this.direccion = direccion;
    }
    
    public String getIdProveedor() {
        return idProveedor;
    }

    public String getNIF() {
        return NIF;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}
