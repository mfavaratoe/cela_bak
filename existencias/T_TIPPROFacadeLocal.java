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
 * @author Administrador
 */
@Local
public interface T_TIPPROFacadeLocal {

    void create(T_TIPPRO t_TIPPRO);

    void edit(T_TIPPRO t_TIPPRO);

    void remove(T_TIPPRO t_TIPPRO);

    T_TIPPRO find(Object id);

    List<T_TIPPRO> findAll();

    List<T_TIPPRO> findRange(int[] range);
    
    String auto_cod();

    int count();
}
