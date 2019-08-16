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
public interface T_PEDCABFacadeLocal {

    void create(T_PEDCAB t_PEDCAB);

    void edit(T_PEDCAB t_PEDCAB);

    void remove(T_PEDCAB t_PEDCAB);

    T_PEDCAB find(Object id);

    List<T_PEDCAB> findAll();

    List<T_PEDCAB> findRange(int[] range);

    int count();
    
}
