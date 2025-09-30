/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.Services;

/**
 *
 * @author mezab
 */
import com.mycompany.mitienda2.Domain.enums.ProductoCategoriaEnum;
import com.mycompany.mitienda2.Domain.model.Producto;

/**
  esta clase es como la regla para ver si un producto aplica a servicio tecnico
  en este caso solo impresoras tienen eso
*/
public class ServicioTecnicoSpecification {

    /**
     uso static aqui por que puedo usarla con 
     solo llamar directamente el ServicioTecnicoSpecification

     y uso el enum ProductoCategoriaEnum por lo que ya estan definidos los valores y ps es mas seguro
    */
        public static boolean aplicaServicioTecnico(Producto producto) {
                 return producto.getCategoria() == ProductoCategoriaEnum.IMPRESORA;
    }
}

/* 
public class ServicioTecnicoSpecification implements Specification<Producto> {

    @Override
    public boolean isSatisfiedBy(Producto producto) {
        return producto.getCategoria() == ProductoCategoriaEnum.IMPRESORA;
    }
}
*/
