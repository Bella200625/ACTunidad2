/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.model;
import com.mycompany.mitienda2.Domain.enums.*;
import com.mycompany.mitienda2.Domain.valueobjects.*;
import com.mycompany.mitienda2.Domain.exceptions.ProductoException; 
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import com.mycompany.mitienda2.Domain.Specification.ServicioTecnicoSpecification;
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
    
    public void test2_Precio (){
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
    void    Test3_impresoraAplicaAServicioTecnico() {
    // en este test armamos una impresora
    // luego le preguntamos a la especificacion si aplica a servicio tecnico
    // como la regla dice que si aplica pues el resultado deberia salir true
    
        Producto impresora = new Producto(
                "A22",
                "COD001",ProductoCategoriaEnum.IMPRESORA, "Impresora HP", "LaserJet 1010",
                "Impresora láser",new Precio(500.0),DisponibilidadAlquilerEnum.NO_SE_ALQUILA, null,null
        );

        ServicioTecnicoSpecification spec = new ServicioTecnicoSpecification();

    assertTrue(spec.isSatisfiedBy(impresora),
            "La categoría " + impresora.getCategoria() + " debería aplicar a servicio técnico");
}
    @Test
    void Test4_monitorNoAplicaAServicioTecnico() {
  // ahora probamos con un monitor
    // la idea es pasarle ese monitor a la misma funcion
    // pero aqui la respuesta deberia ser false porque monitores no aplican
    
        Producto monitor = new Producto(
                "A33", "COD002",ProductoCategoriaEnum.MONITOR,"Monitor Gamer","Modelo X","Monitor 144hz", new Precio(1000.0),
                DisponibilidadAlquilerEnum.DISPONIBLE_PARA_ALQUILER,null, null
        );

       ServicioTecnicoSpecification spec = new ServicioTecnicoSpecification();

    assertFalse(spec.isSatisfiedBy(monitor),
            "La categoría " + monitor.getCategoria() + " no debería aplicar a servicio técnico");
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
   
   



//public class AlquilerServiceConMockTest {
//
//    @Test
//    void deberiaFiltrarProductosAlquilables_UsandoMockRepositorio() {
//        // 1. Creamos un mock del repositorio (simula ser un ProductoRepository real).
//        ProductoRepository repoMock = Mockito.mock(ProductoRepository.class);
//
//        // 2. Creamos algunos productos de ejemplo (algunos alquilables y otros no).
        //        Producto monitor = new Producto("1", "COD1", ProductoCategoriaEnum.MONITOR, "Monitor LG", "2023", "Monitor gamer", null, null, null, null);
        //        Producto discoDuro = new Producto("2", "COD2", ProductoCategoriaEnum.DISCO_DURO, "HDD Seagate", "2TB", "Disco de 2TB", null, null, null, null);
        //        Producto impresora = new Producto("3", "COD3", ProductoCategoriaEnum.IMPRESORA, "HP Deskjet", "Ink", "Impresora multifuncional", null, null, null, null);
//
//        // 3. Configuramos el mock: cuando alguien llame a findAll(), devolverá nuestra lista de prueba.
//                when(repoMock.findAll()).thenReturn(Arrays.asList(monitor, discoDuro, impresora));
//
//        // 4. Pasamos el mock al servicio en lugar de un repositorio real.
//                AlquilerService alquilerService = new AlquilerService(repoMock);
//
//        // 5. Ejecutamos el método que queremos probar.
//                List<Producto> alquilables = alquilerService.listarProductosAlquilables();
//
//        // 6. Verificamos que solo se devuelvan los productos correctos (monitor y disco duro).
//               assertEquals(2, alquilables.size());
//    }
//}



 


}