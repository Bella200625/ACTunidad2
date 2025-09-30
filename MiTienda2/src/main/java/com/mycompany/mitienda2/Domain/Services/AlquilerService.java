/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.Services;

/**
 *
 * @author mezab
 */

import com.mycompany.mitienda2.Domain.model.Producto;
import com.mycompany.mitienda2.Domain.enums.ProductoCategoriaEnum;
import java.util.List;
import java.util.stream.Collectors;

public class AlquilerService {

//     este metodo recibe una lista de productos
//     y se encarga de revisar uno por uno cuáles cumplen con la condicione de ser alquilables
//     la condición de negocio que tenemos es que solo se pueden alquilar monitores y discos duros
//     entonces se hace un filtro para dejar únicamente esos productos y devolverlos en una nueva lista
    public List<Producto> listarProductosAlquilables(List<Producto> productos) {
        return productos.stream()
                .filter(p -> p.getCategoria() == ProductoCategoriaEnum.MONITOR
                          || p.getCategoria() == ProductoCategoriaEnum.DISCO_DURO)
                .collect(Collectors.toList());
    }
}
