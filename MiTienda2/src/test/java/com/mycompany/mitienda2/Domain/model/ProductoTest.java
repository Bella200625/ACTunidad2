/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.model;
import com.mycompany.mitienda2.Domain.enums.*;
import com.mycompany.mitienda2.Domain.valueobjects.*;
import com.mycompany.mitienda2.Domain.exceptions.ProductoException; 
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import com.mycompany.mitienda2.Domain.Services.ServicioTecnicoSpecification;
/**
 *
 * @author mezab
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class  ProductoTest {
    
    @Test
    public void test1_IDvacio() {
        
        assertThatThrownBy(() -> 
            new Producto( "", "COD123", ProductoCategoriaEnum.MONITOR,  
                    "Monitor Gamer", "Modelo X", "Monitor 144hz", 
                    new Precio(1000.0),DisponibilidadAlquilerEnum.DISPONIBLE_PARA_ALQUILER, null, null
            ))
        .isInstanceOf(ProductoException.class) // Verifica el tipo de excepción
        .hasMessageContaining("ID");          // Verifica que el mensaje mencione 'ID' 
    }
    
    @Test
    
    public void test2 (){
            assertThatThrownBy(() -> 
            new Producto("A11", "COD123", ProductoCategoriaEnum.MONITOR,  
                    "Monitor Gamer", "Modelo X", "Monitor 144hz",  
                    new Precio(0.0),DisponibilidadAlquilerEnum.DISPONIBLE_PARA_ALQUILER, null, null
            )
        )
         .isInstanceOf(IllegalArgumentException.class) 
        .hasMessageContaining("positivo");
    }
    
   

    @Test
    void impresoraAplicaAServicioTecnico() {
        Producto impresora = new Producto(
                "A22",
                "COD001",ProductoCategoriaEnum.IMPRESORA, "Impresora HP", "LaserJet 1010",
                "Impresora láser monocromática",new Precio(500.0),DisponibilidadAlquilerEnum.NO_SE_ALQUILA, null,null
        );

        assertTrue(ServicioTecnicoSpecification.aplicaServicioTecnico(impresora),
                "Las impresoras deben aplicar a servicio técnico");
    }

    @Test
    void monitorNoAplicaAServicioTecnico() {
        Producto monitor = new Producto(
                "A33", "COD002",ProductoCategoriaEnum.MONITOR,"Monitor Gamer","Modelo X","Monitor 144hz", new Precio(1000.0),
                DisponibilidadAlquilerEnum.DISPONIBLE_PARA_ALQUILER,null, null
        );

        assertFalse(ServicioTecnicoSpecification.aplicaServicioTecnico(monitor),
                "Un monitor no debería aplicar a servicio técnico");
    }
}

//@Test 
//public void test1_IDvacio(){
//
//    Producto producto1 = new Producto("", "COD123", ProductoCategoriaEnum.MONITOR, 
//            "Monitor Gamer", "Modelo X", "Monitor 144hz", new Precio(1000.0), 
//            DisponibilidadAlquilerEnum.DISPONIBLE_PARA_ALQUILER, null, null); 
//
//    
//    

   
//   public static void main(String[] args) {
//       
//       //
//        Producto producto1 = new Producto(
//            "", "COD123", ProductoCategoriaEnum.MONITOR, "Monitor Gamer", "Modelo X", "Monitor 144hz", new Precio(1000.0), DisponibilidadAlquilerEnum.DISPONIBLE_PARA_ALQUILER, null, null); 
//   
//        System.out.println(producto1.toString());
//        
//        
//         Producto producto2 = new Producto(
//            "2", "COD123", ProductoCategoriaEnum.MONITOR, "Monitor Gamer", "Modelo X", "Monitor 144hz", new Precio(1000.0), DisponibilidadAlquilerEnum.DISPONIBLE_PARA_ALQUILER, null, null); 
//   
//        System.out.println(producto2.toString());
//          
//        
//    }
   
   



   


 


