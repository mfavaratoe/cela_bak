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
public class T_NECESIDADFacade extends AbstractFacade<T_NECESIDAD> implements T_NECESIDADFacadeLocal {
    
    @PersistenceContext(unitName = "cela-ejbPU") EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
// reeempazar em por getEntityManager()
    public T_NECESIDADFacade() {
        super(T_NECESIDAD.class);
    }
    public String findByPedidoAmacenProducto(String pedido, Integer ptovta, String producto)  {
        String query = "select o.cantidad from T_NECESIDAD as o where"
                + " o.pedido  =:id1 AND "
                + " o.idptovta.ptoVtaId  =:id2 AND "
                + " o.articulo.codPro =:id3 ";
                
        Query q = em.createQuery(query);
        q.setParameter("id1", pedido);
        q.setParameter("id2", ptovta);
        q.setParameter("id3", producto);
        
        if (q.getResultList().size() == 1 ) {
            return (q.getSingleResult().toString());    
        } else  if (q.getResultList().size() > 1 ) {
            return "0" ;
        } else {
            return "" ;
        }        
    }
    public List<T_NECESIDAD> findByPedido(String pedido)  {
        String query = "select o from T_NECESIDAD as o"
                + " where o.pedido  =:id1 ORDER BY o.idptovta.ptoVtaId, o.articulo.codPro "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", pedido);
        return (q.getResultList());
    }
    
    
    public List<T_NECESIDAD> findByPedidoArticulo(String pedido, Integer ptovta)  {
        String query = "select o from T_NECESIDAD as o where "
                + "o.pedido  =:id1 AND  o.idptovta.ptoVtaId =:id2 ORDER BY o.articulo.nomPro"; 
        Query q = em.createQuery(query); 
        q.setParameter("id1", pedido);
        q.setParameter("id2", ptovta);
        return (q.getResultList());
    }
    public List<T_NECESIDAD> findAlmacen(String pedido)  {
        String query = "select o from T_NECESIDAD as o"
                + " where o.pedido  =:id1 GROUP BY o.almacen.codAlm "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", pedido);
        return (q.getResultList());
    }
    public List<T_NECESIDAD> findPtoVta(String pedido)  {
        String query = "select o from T_NECESIDAD as o"
                + " where o.pedido  =:id1 GROUP BY o.idptovta.ptoVtaId "; 
        Query q = em.createQuery(query);
        q.setParameter("id1", pedido);
        return (q.getResultList());
    }
}
