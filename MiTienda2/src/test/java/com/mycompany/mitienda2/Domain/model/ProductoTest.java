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
    // aqui lo que hacemos es crear un producto con el id vacio para ver si el constructor
    //  bota la excepcion de dominio ProductoException porque no puede quedar sin id
    
        
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
    // aca le metimos un precio cero al producto
    // porque queremos ver si el value object precio hace su trabajo y no deja pasar eso
    // la gracia es que tire una IllegalArgumentException diciendo que el valor tiene que ser positivo
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
    // en este test armamos una impresora
    // luego le preguntamos a la especificacion si aplica a servicio tecnico
    // como la regla dice que si aplica pues el resultado deberia salir true
    
        Producto impresora = new Producto(
                "A22",
                "COD001",ProductoCategoriaEnum.IMPRESORA, "Impresora HP", "LaserJet 1010",
                "Impresora láser",new Precio(500.0),DisponibilidadAlquilerEnum.NO_SE_ALQUILA, null,null
        );

        assertTrue(ServicioTecnicoSpecification.aplicaServicioTecnico(impresora),
                "Las impresoras deben aplicar a servicio técnico");
    }

    @Test
    void monitorNoAplicaAServicioTecnico() {
  // ahora probamos con un monitor
    // la idea es pasarle ese monitor a la misma funcion
    // pero aqui la respuesta deberia ser false porque monitores no aplican
    
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
   
   



   


 


