/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.valueobjects;

public final class Precio {
   //atributo
    private final double valor;
  //cohnstructoor
    public Precio(double valor) {
    if (valor < 0) {
       
        throw new IllegalArgumentException("El precio no puede ser negativo");
    }
    this.valor = valor;
    }

    //Get de valor 
    public double getValor() {
        return valor;
    }
    
    
}