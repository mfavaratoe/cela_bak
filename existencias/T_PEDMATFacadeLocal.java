/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos.existencias;

import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Administrador
 */
@Local
public interface T_PEDMATFacadeLocal {

    void create(T_PEDMAT t_PEDMAT);

    void edit(T_PEDMAT t_PEDMAT);

    void remove(T_PEDMAT t_PEDMAT);

    T_PEDMAT find(Object id);

    List<T_PEDMAT> findAll();

    List<T_PEDMAT> findRange(int[] range);

    List<T_PEDMAT> findPendientes();
    int count();
    int numPed();
    
    public List<T_PEDMAT> find_filtro_detalle(String almacen, String situacion, String desde, String hasta ) ;
    
    public void borraPedidosDelPeriodo(String periodoId)  ;
    public void borraOrden(String ordenId)  ;
}
