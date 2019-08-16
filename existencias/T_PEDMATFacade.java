/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos.existencias;

import java.util.Date;
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
public class T_PEDMATFacade extends AbstractFacade<T_PEDMAT> implements T_PEDMATFacadeLocal {
    
    @PersistenceContext(unitName = "cela-ejbPU") EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
// reeempazar em por getEntityManager()

    public T_PEDMATFacade() {
        super(T_PEDMAT.class);
    }
    
    public void borraPedidosDelPeriodo(String periodoId)  {
        String query = "DELETE FROM T_PEDMAT as o WHERE o.origen = :id1  "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", periodoId);
        q.executeUpdate();
    }
    public void borraOrden(String ordenId)  {
        String query = "DELETE FROM T_PEDMAT as o WHERE o.ordenId = :id1  "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", ordenId);
        q.executeUpdate();
    }
    public int numPed()  {  // ULTIMO NUMERO CONSECUTIVO
        String query = "select MAX(o.t_PEDMATPK.pedidoId) from T_PEDMAT as o  "; 
        Query q = em.createQuery(query);
        if (q.getResultList().get(0) != null ) {
            return  (int) q.getSingleResult();        
        } else {
            return 1 ;
        }
    }
    
    public List<T_PEDMAT> find_filtro_detalle(String almacen, String situacion, String desde, String hasta ) {
        String query = "select o from T_PEDMAT as o where 1 = 1 ";
        if (almacen != null && !almacen.equals("-") && !almacen.equals("") && !almacen.equals("0")) {
            query += " and o.codAlm=:id1 ";
        }
        if (situacion != null &&  !situacion.equals("0")) {
            query += " and o.pedSit=:id2 ";
        }
        Query q = em.createQuery(query);
            q.setParameter("id1", almacen);
            q.setParameter("id2", Integer.parseInt(situacion));
            List<T_PEDMAT> result = q.getResultList();
        return result;        
    }
    public List<T_PEDMAT> findPendientes() {
            String query = "select o from T_PEDMAT as o where (o.canPed - o.canAtendida) >= 0 ";
            Query q = em.createQuery(query);
        return  q.getResultList();
    }
    
}
