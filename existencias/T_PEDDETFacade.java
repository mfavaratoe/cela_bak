/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.existencias;

import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.lang.model.element.Element;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author user
 */
@Stateless
public class T_PEDDETFacade extends AbstractFacade<T_PEDDET> implements T_PEDDETFacadeLocal {

    @PersistenceContext(unitName = "cela-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public T_PEDDETFacade() {
        super(T_PEDDET.class);
    }
    public List<T_PEDDET> findBynumped(Integer numped) {
        String query = "select o from T_PEDDET as o where o.numped.numped =:id1 ";
        Query q = em.createQuery(query);
        q.setParameter("id1", numped);
        return  q.getResultList();
    }
    public Number total_ped(Integer numped)  {
        String query = "select SUM(o.precio*o.canate) AS importe from T_PEDDET as o where o.numped.numped=:id1 "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", numped);
        if (!q.getResultList().isEmpty() ) {
            Number result = (Number) q.getSingleResult ();
            return(result);
        } else {
            return(0);  
        }
    }
    
}
