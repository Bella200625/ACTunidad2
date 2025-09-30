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
import com.mycompany.mitienda2.Domain.model.Producto;
/**
  esta clase es la regla para saber si un producto aplica a servicio tecnico
  solo impresoras entran en esta regla
*/
public class ServicioTecnicoSpecification implements Specification<Producto> {
    @Override
    public boolean isSatisfiedBy(Producto producto) {
        ProductoCategoriaEnum cat = producto.getCategoria();
        return cat == ProductoCategoriaEnum.IMPRESORA;
    }
    }