/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.existencias;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface T_NECESIDADFacadeLocal {

    void create(T_NECESIDAD t_NECESIDAD);

    void edit(T_NECESIDAD t_NECESIDAD);

    void remove(T_NECESIDAD t_NECESIDAD);

    T_NECESIDAD find(Object id);

    String findByPedidoAmacenProducto(String pedido, Integer ptovta, String producto);
    List<T_NECESIDAD> findByPedido(String pedido);
    List<T_NECESIDAD> findByPedidoArticulo(String pedido, Integer ptovta);
    List<T_NECESIDAD> findAlmacen(String pedido); // UNIQUE
    List<T_NECESIDAD> findPtoVta(String pedido)  ;
    
    List<T_NECESIDAD> findAll();

    List<T_NECESIDAD> findRange(int[] range);

    int count();
}
