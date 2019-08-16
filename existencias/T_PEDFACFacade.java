/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.existencias;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author user
 */
@Stateless
public class T_PEDFACFacade extends AbstractFacade<T_PEDFAC> implements T_PEDFACFacadeLocal {

    @PersistenceContext(unitName = "cela-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public T_PEDFACFacade() {
        super(T_PEDFAC.class);
    }
    public List<T_PEDFAC> findBynumped(Integer numped) {
        String query = "select o from T_PEDFAC as o where o.numped.numped =:id1 ";
        Query q = em.createQuery(query);
        q.setParameter("id1", numped);
        return  q.getResultList();
    }
    
}
