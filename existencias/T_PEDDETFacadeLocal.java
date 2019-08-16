/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.existencias;

import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface T_PEDDETFacadeLocal {

    void create(T_PEDDET t_PEDDET);

    void edit(T_PEDDET t_PEDDET);

    void remove(T_PEDDET t_PEDDET);

    T_PEDDET find(Object id);

    List<T_PEDDET> findAll();

    List<T_PEDDET> findRange(int[] range);

    int count();
    public List<T_PEDDET> findBynumped(Integer numped) ;
    public Number total_ped(Integer numped)  ;
    
}
