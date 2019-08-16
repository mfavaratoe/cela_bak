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
public interface T_MOVEXIFacadeLocal {

    void create(T_MOVEXI t_MOVEXI);

    void edit(T_MOVEXI t_MOVEXI);

    void remove(T_MOVEXI t_MOVEXI);

    T_MOVEXI find(Object id);

    List<T_MOVEXI> findAll();

    List<T_MOVEXI> findRange(int[] range);

    int count();
}
