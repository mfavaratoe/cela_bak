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
 * @author user
 */
@Stateless
public class T_PEDCABFacade extends AbstractFacade<T_PEDCAB> implements T_PEDCABFacadeLocal {

    @PersistenceContext(unitName = "cela-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public T_PEDCABFacade() {
        super(T_PEDCAB.class);
    }
    
}
