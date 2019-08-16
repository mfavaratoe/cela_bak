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
public interface T_MAEPROFacadeLocal {

    void create(T_MAEPRO t_MAEPRO);

    void edit(T_MAEPRO t_MAEPRO);

    void remove(T_MAEPRO t_MAEPRO);

    T_MAEPRO find(Object id);

    List<T_MAEPRO> findAll();
    List<T_MAEPRO> findSinFormula();
    
    List<T_MAEPRO> findByClase(String clase);
    List<T_MAEPRO> findByNotClase(String clase);
    public String findUnimedByproductoId(String productoId);
    
    
    public Integer secuencia(T_TIPPRO tipo);
    

    
}
