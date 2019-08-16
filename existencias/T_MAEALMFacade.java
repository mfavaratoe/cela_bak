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

/**
 *
 * @author Administrador
 */
@Stateless
public class T_MAEALMFacade  implements T_MAEALMFacadeLocal {
    
    @PersistenceContext(unitName = "cela-ejbPU")   EntityManager em1;
    @PersistenceContext(unitName = "cela-ejbPU")    EntityManager em2;

    protected EntityManager getEntityManager(String cia) {        
        switch (cia) {
        case "korus":
            return em1;
        case "cela":
            return em2;
        default:
            return em2;
        }        
    }        

    public void create(String cia, T_MAEALM t_MAEALM) {
        getEntityManager(cia).persist(t_MAEALM);
    }

    public void edit(String cia, T_MAEALM t_MAEALM) {
        getEntityManager(cia).merge(t_MAEALM);
    }

    public void remove(String cia, T_MAEALM t_MAEALM) {
        getEntityManager(cia).remove(getEntityManager(cia).merge(t_MAEALM));
    }

    public T_MAEALM find(String cia, Object id) {
        return getEntityManager(cia).find(T_MAEALM.class, id);
    }

    public List<T_MAEALM> findAll(String cia) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager(cia).getCriteriaBuilder().createQuery();
        cq.select(cq.from(T_MAEALM.class));
        return getEntityManager(cia).createQuery(cq).getResultList();
    }
}
