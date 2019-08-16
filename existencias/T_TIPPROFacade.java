/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos.existencias;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Administrador
 */
@Stateless
public class T_TIPPROFacade extends AbstractFacade<T_TIPPRO> implements T_TIPPROFacadeLocal {
    
    
    @PersistenceContext(unitName = "cela-ejbPU") EntityManager em;
        
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }        
// reeempazar em por getEntityManager()
    public T_TIPPROFacade() {
        super(T_TIPPRO.class);
    }
    public String auto_cod()  {
        Integer cod;
        String query = "select MAX(o.tipPro) from T_TIPPRO as o "; 
        Query q = em.createQuery(query);
        //cod =Integer.parseInt(q.getSingleResult().toString()) + 1;      
        //cod =(Integer) q.getSingleResult();
        if (q.getResultList().get(0) != null ) {
            cod =Integer.parseInt(q.getSingleResult().toString()) + 1;      
            return  String.format("%03d", cod);        
        } else {
            return "001" ;
        }
    }
    
}
