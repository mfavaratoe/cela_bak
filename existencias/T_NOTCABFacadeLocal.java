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
public interface T_NOTCABFacadeLocal {

    void create(T_NOTCAB t_NOTCAB);

    void edit(T_NOTCAB t_NOTCAB);

    void remove(T_NOTCAB t_NOTCAB);

    //T_NOTCAB find(Object id);

    public List<T_NOTCAB> findAll();
    List<T_NOTCAB> findRange(int[] range);
    public T_NOTCAB find(String alm, String cla, int num);
    public List<T_NOTCAB> findImprime( List<String> guias) ;
    public int numGui();
    int count();

}
