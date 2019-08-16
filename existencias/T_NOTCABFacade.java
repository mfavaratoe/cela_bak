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
public class T_NOTCABFacade extends AbstractFacade<T_NOTCAB> implements T_NOTCABFacadeLocal {
    
    
    @PersistenceContext(unitName = "cela-ejbPU") EntityManager em;
        
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }    
    
// reeempazar em por getEntityManager()
    public T_NOTCABFacade() {
        super(T_NOTCAB.class);
    }
    public T_NOTCAB find(String alm, String cla, int num) {
        String query = "select o from T_NOTCAB as o where o.t_NOTCABPK.codAlm=:id1 and o.t_NOTCABPK.claMov=:id2 and o.t_NOTCABPK.numMov=:id3 ";
        Query q = em.createQuery(query);
        q.setParameter("id1", alm);
        q.setParameter("id2", cla);
        q.setParameter("id3", num);
        return (T_NOTCAB)(q.getResultList().get(0));
    }
    public List<T_NOTCAB> findAll() {
    return em.createQuery("select object(o) from T_NOTCAB as o").getResultList();
    }
    public int numGui()  {  // ULTIMO NUMERO CONSECUTIVO
        String query = "select MAX(o.t_NOTCABPK.numMov) from T_NOTCAB as o  "; 
        Query q = em.createQuery(query);
        if (q.getResultList().get(0) != null ) {
            return  (int) q.getSingleResult();        
        } else {
            return 100 ;
        }
    }    
    public List<T_NOTCAB> findImprime( List<String> guiasList) {
        String query = "select o from T_NOTCAB as o where o.t_NOTCABPK.numMov IN :id1 ";
        Query q = em.createQuery(query);
        q.setParameter("id1", guiasList);
        return (q.getResultList());
    }
}
