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
public interface T_MAEALMFacadeLocal {

    void create(String cia, T_MAEALM t_MAEALM);

    void edit(String cia, T_MAEALM t_MAEALM);

    void remove(String cia, T_MAEALM t_MAEALM);

    T_MAEALM find(String cia, Object id);

    List<T_MAEALM> findAll(String cia );

}
