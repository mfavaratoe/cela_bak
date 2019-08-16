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
 * @author Administrador
 */
@Stateless
public class T_NOTDETFacade extends AbstractFacade<T_NOTDET> implements T_NOTDETFacadeLocal {
    
    @PersistenceContext(unitName = "cela-ejbPU") EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }    
    
// reeempazar em por getEntityManager()
    public T_NOTDETFacade() {
        super(T_NOTDET.class);
    }
    
    public List<T_NOTDET> findAll(String alm, String cla, int num)  {
        String query = "select o from T_NOTDET as o where o.t_NOTDETPK.codAlm=:id1 and o.t_NOTDETPK.claMov=:id2 and o.t_NOTDETPK.numMov=:id3 and o.modificacionUsuario IS NULL "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", alm);
        q.setParameter("id2", cla);
        q.setParameter("id3", num);
        return (q.getResultList());
    }
    
    public T_NOTDET findDet(String alm, String cla, int num, int sec) {
        String query = "select o from T_NOTDET as o where o.t_NOTDETPK.codAlm=:id1 and o.t_NOTDETPK.claMov=:id2 and o.t_NOTDETPK.numMov=:id3 and o.t_NOTDETPK.numSec=:id4 ";
        Query q = em.createQuery(query);
        q.setParameter("id1", alm);
        q.setParameter("id2", cla);
        q.setParameter("id3", num);
        q.setParameter("id4", sec);
        return (T_NOTDET)(q.getResultList().get(0));
    }    
    public Integer correlativo(String alm, String cla, int num)  {
        String query = "select MAX(o.t_NOTDETPK.numSec)  from T_NOTDET as o where o.t_NOTDETPK.codAlm=:id1 and o.t_NOTDETPK.claMov=:id2 and o.t_NOTDETPK.numMov=:id3 "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", alm);
        q.setParameter("id2", cla);
        q.setParameter("id3", num);
        if (q.getResultList().get(0) != null ) {
            return (Integer) q.getSingleResult();        
        } else {
            return 1 ;
        }
    }
    public List<T_NOTDET> findAllMovimientos()  {
        String query = "select o from T_NOTDET as o where o.tNotcab.estadoId='1'  "; 
        Query q = em.createQuery(query);
        return (q.getResultList());
    }
}
