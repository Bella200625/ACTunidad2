/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.Specification;

/**
 *
 * @author mezab
 */
import com.mycompany.mitienda2.Domain.enums.ProductoCategoriaEnum;
import com.mycompany.mitienda2.Domain.model.*;
import com.mycompany.mitienda2.Domain.enums.*;

/**
  esta clase es la regla para saber si un producto se puede alquilar
  solo monitores y discos duros entran en esta regla
*/
public class AlquilerSpecification implements Specification<Producto> {
    @Override
    public boolean isSatisfiedBy(Producto producto) {
        ProductoCategoriaEnum cat = producto.getCategoria();
        return cat == ProductoCategoriaEnum.MONITOR || cat == ProductoCategoriaEnum.DISCO_DURO;
    }
}
    /**
    
    */
    
