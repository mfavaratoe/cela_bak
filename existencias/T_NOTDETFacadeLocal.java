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
public interface T_NOTDETFacadeLocal {

    void create(T_NOTDET t_NOTDET);

    void edit(T_NOTDET t_NOTDET);

    void remove(T_NOTDET t_NOTDET);

    T_NOTDET find(Object id);

    List<T_NOTDET> findAll(String alm, String cla, int num);

    public Integer correlativo(String alm, String cla, int num);

    List<T_NOTDET> findRange(int[] range);
    
    public T_NOTDET findDet(String alm, String cla, int num, int sec);
    public List<T_NOTDET> findAllMovimientos() ;

    int count();
}
