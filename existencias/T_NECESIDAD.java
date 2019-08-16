/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.existencias;

import datos.incidente.Ptovta;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
@Entity
@Table(name = "exi_necesidad" )
@NamedQueries({
    @NamedQuery(name = "T_NECESIDAD.findAll", query = "SELECT t FROM T_NECESIDAD t")})
public class T_NECESIDAD implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 45)
    @Column(name = "pedido", length = 45)
    private String pedido;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad", precision = 22)
    private Double cantidad;
    @Column(name = "estado")
    private Integer estado;
    
    @JoinColumn(name = "idptovta", referencedColumnName = "ptoVtaId")
    @ManyToOne
    private Ptovta idptovta;
    
    @JoinColumn(name = "almacen", referencedColumnName = "codAlm")
    @ManyToOne
    public T_MAEALM almacen;
    
    @JoinColumn(name = "articulo", referencedColumnName = "codPro")
    @ManyToOne
    public T_MAEPRO articulo;

    public T_NECESIDAD() {
    }

    public T_NECESIDAD(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public T_MAEALM getAlmacen() {
        return almacen;
    }

    public void setAlmacen(T_MAEALM almacen) {
        this.almacen = almacen;
    }

    public T_MAEPRO getArticulo() {
        return articulo;
    }

    public void setArticulo(T_MAEPRO articulo) {
        this.articulo = articulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_NECESIDAD)) {
            return false;
        }
        T_NECESIDAD other = (T_NECESIDAD) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_NECESIDAD[ id=" + id + " ]";
    }

    public Ptovta getIdptovta() {
        return idptovta;
    }

    public void setIdptovta(Ptovta idptovta) {
        this.idptovta = idptovta;
    }
    
}
