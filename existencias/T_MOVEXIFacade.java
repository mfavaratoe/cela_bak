/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos.existencias;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrador
 */
@Stateless
public class T_MOVEXIFacade extends AbstractFacade<T_MOVEXI> implements T_MOVEXIFacadeLocal {
    
    @PersistenceContext(unitName = "cela-ejbPU") EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
// reeempazar em por getEntityManager()
    public T_MOVEXIFacade() {
        super(T_MOVEXI.class);
    }    
}
