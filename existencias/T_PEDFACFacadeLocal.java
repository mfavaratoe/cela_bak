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
public interface T_PEDFACFacadeLocal {

    void create(T_PEDFAC t_PEDFAC);

    void edit(T_PEDFAC t_PEDFAC);

    void remove(T_PEDFAC t_PEDFAC);

    T_PEDFAC find(Object id);

    List<T_PEDFAC> findAll();

    List<T_PEDFAC> findRange(int[] range);
    public List<T_PEDFAC> findBynumped(Integer numped) ;

    int count();
    
}
