/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.existencias;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
@Entity
@Table(name = "exi_pedcab", catalog = "cela", schema = "")
@NamedQueries({
    @NamedQuery(name = "T_PEDCAB.findAll", query = "SELECT t FROM T_PEDCAB t")})
public class T_PEDCAB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numped", nullable = false)
    private Integer numped;
    @Column(name = "fecemi")
    @Temporal(TemporalType.DATE)
    private Date fecemi;
    @Column(name = "fecate")
    @Temporal(TemporalType.DATE)
    private Date fecate;
    @Size(max = 250)
    @Column(name = "obsped", length = 250)
    private String obsped;
    @Size(max = 15)
    @Column(name = "estado", length = 15)
    private Integer estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "movilidad", precision = 12)
    private Float movilidad;
    @Column(name = "total", precision = 12)
    private Float total;
    @OneToMany(mappedBy = "numped")
    private Collection<T_PEDFAC> tPEDFACCollection;

    public T_PEDCAB() {
    }

    public T_PEDCAB(Integer numped) {
        this.numped = numped;
    }

    public Integer getNumped() {
        return numped;
    }

    public void setNumped(Integer numped) {
        this.numped = numped;
    }

    public Date getFecemi() {
        return fecemi;
    }

    public void setFecemi(Date fecemi) {
        this.fecemi = fecemi;
    }

    public Date getFecate() {
        return fecate;
    }

    public void setFecate(Date fecate) {
        this.fecate = fecate;
    }

    public String getObsped() {
        return obsped;
    }

    public void setObsped(String obsped) {
        this.obsped = obsped;
    }


    public Float getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(Float movilidad) {
        this.movilidad = movilidad;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Collection<T_PEDFAC> getTPEDFACCollection() {
        return tPEDFACCollection;
    }

    public void setTPEDFACCollection(Collection<T_PEDFAC> tPEDFACCollection) {
        this.tPEDFACCollection = tPEDFACCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numped != null ? numped.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_PEDCAB)) {
            return false;
        }
        T_PEDCAB other = (T_PEDCAB) object;
        if ((this.numped == null && other.numped != null) || (this.numped != null && !this.numped.equals(other.numped))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_PEDCAB[ numped=" + numped + " ]";
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
}
