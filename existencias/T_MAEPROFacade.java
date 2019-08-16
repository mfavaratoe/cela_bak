/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos.existencias;

import java.util.Iterator;
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
public class T_MAEPROFacade extends AbstractFacade<T_MAEPRO> implements T_MAEPROFacadeLocal {
    
    @PersistenceContext(unitName = "cela-ejbPU") EntityManager em;
        
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }    
    
    public T_MAEPROFacade() {
        super(T_MAEPRO.class);
    }
        public List<T_MAEPRO> findAll() {
        String query = "select o from T_MAEPRO as o order by o.nomPro   "; 
        Query q = em.createQuery(query);
        return (q.getResultList());
    }
    public String findUnimedByproductoId(String productoId)  {
        String query = "select o.unidmed from T_MAEPRO as o where o.codPro=:id1 "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", productoId);
        return (q.getSingleResult().toString());
    }
    public List<T_MAEPRO> findByClase(String clase)  {
        String query = "select o from T_MAEPRO as o where o.tipPro.abrTipPro LIKE :id1  order by o.nomPro   "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", clase);
        return (q.getResultList());
    }

    public List<T_MAEPRO> findByNotClase(String clase)  {
        String query = "select o from T_MAEPRO as o where o.tipPro.abrTipPro NOT LIKE :id1 and o.estado ='1' order by o.nomPro   "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", clase);
        return (q.getResultList());
    }
    public List<T_MAEPRO> findSinFormula()  {
        String query = "select o from  T_MAEPRO as o "
                    + " where o.codPro not in ( select f.tMaepro.codPro from T_StdFormula f )"
                    + " and o.tipPro.clasepro not like 'C' "; // clase "C" insumos
        Query q = em.createQuery(query);
        return (q.getResultList());
    }
    
    
    public Integer secuencia(T_TIPPRO tipo)  {
        String query = "select MAX(SUBSTRING(o.codPro,4)) from T_MAEPRO as o where o.tipPro=:id1 "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", tipo);
        if (q.getResultList().get(0) != null ) {
            return (Integer.parseInt((String) q.getSingleResult()));        
        } else {
            return 0 ;
        }
    }
}
