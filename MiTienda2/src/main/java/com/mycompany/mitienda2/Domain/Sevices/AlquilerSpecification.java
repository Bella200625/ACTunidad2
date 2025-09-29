/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mitienda2.Domain.Sevices;

/**
 *
 * @author mezab
 */
import com.mycompany.mitienda2.Domain.enums.ProductoCategoriaEnum;
import com.mycompany.mitienda2.Domain.model.Producto;

/**
  esta clase es la regla para saber si un producto se puede alquilar
  solo monitores y discos duros entran en esta regla
*/
public class AlquilerSpecification {

    /**
     otra vez lo hago static por que es como una funcion suelta
     no necesito un objeto de la clase, la idea es solo preguntar
     si se puede alquilar o no y ya

     igual uso el enum ProductoCategoriaEnum porque asi es mas claro
     queda tipado y no hay error de letras o espacios como pasa con String
    */
    public static boolean esAlquilable(Producto producto) {
        return producto.getCategoria() == ProductoCategoriaEnum.MONITOR
            || producto.getCategoria() == ProductoCategoriaEnum.DISCO_DURO;
    }
}
