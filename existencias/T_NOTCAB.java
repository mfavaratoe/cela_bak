/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos.existencias;

import datos.general.T_CLAMOV;
import datos.general.T_TIPMOV;
import datos.incidente.Ptovta;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "exi_notcab")
@NamedQueries({
    @NamedQuery(name = "T_NOTCAB.findAll", query = "SELECT t FROM T_NOTCAB t")})
public class T_NOTCAB implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected T_NOTCABPK t_NOTCABPK;
    @Column(name = "fecDoc")
    @Temporal(TemporalType.DATE)
    private Date fecDoc;
    @Column(name = "fecCont")
    @Temporal(TemporalType.DATE)
    private Date fecCont;
    @Column(name = "numPed")
    private Integer numPed;
    @Size(max = 15)
    @Column(name = "codFlu", length = 15)
    private String codFlu;
    @Size(max = 10)
    @Column(name = "estadoId", length = 10)
    private String estadoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tNotcab")
    private Collection<T_NOTDET> tNOTDETCollection;
    
    @JoinColumn(name = "claMov", referencedColumnName = "claMov", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T_CLAMOV tClamov;
    
    @JoinColumn(name = "codAlm", referencedColumnName = "codAlm", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T_MAEALM tMaealm;
    
    @JoinColumn(name = "tipMov", referencedColumnName = "tipMov", nullable = false)
    @ManyToOne(optional = false)
    private T_TIPMOV tipMov;

    @JoinColumn(name = "ptovtaId", referencedColumnName = "ptoVtaId", nullable = false)
    @ManyToOne(optional = false)
    private Ptovta ptovtaId;

    public T_NOTCAB() {
    }

    public T_NOTCAB(T_NOTCABPK t_NOTCABPK) {
        this.t_NOTCABPK = t_NOTCABPK;
    }

    public T_NOTCAB(String codAlm, String claMov, int numMov) {
        this.t_NOTCABPK = new T_NOTCABPK(codAlm, claMov, numMov);
    }

    public T_NOTCABPK getT_NOTCABPK() {
        return t_NOTCABPK;
    }

    public void setT_NOTCABPK(T_NOTCABPK t_NOTCABPK) {
        this.t_NOTCABPK = t_NOTCABPK;
    }

    public Date getFecDoc() {
        return fecDoc;
    }

    public void setFecDoc(Date fecDoc) {
        this.fecDoc = fecDoc;
    }

    public Date getFecCont() {
        return fecCont;
    }

    public void setFecCont(Date fecCont) {
        this.fecCont = fecCont;
    }

    public Integer getNumPed() {
        return numPed;
    }

    public void setNumPed(Integer numPed) {
        this.numPed = numPed;
    }

    public String getCodFlu() {
        return codFlu;
    }

    public void setCodFlu(String codFlu) {
        this.codFlu = codFlu;
    }

    public String getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(String estadoId) {
        this.estadoId = estadoId;
    }

    public Collection<T_NOTDET> getTNOTDETCollection() {
        return tNOTDETCollection;
    }

    public void setTNOTDETCollection(Collection<T_NOTDET> tNOTDETCollection) {
        this.tNOTDETCollection = tNOTDETCollection;
    }

    public T_CLAMOV getTClamov() {
        return tClamov;
    }

    public void setTClamov(T_CLAMOV tClamov) {
        this.tClamov = tClamov;
    }

    public T_MAEALM getTMaealm() {
        return tMaealm;
    }

    public void setTMaealm(T_MAEALM tMaealm) {
        this.tMaealm = tMaealm;
    }

    public T_TIPMOV getTipMov() {
        return tipMov;
    }

    public void setTipMov(T_TIPMOV tipMov) {
        this.tipMov = tipMov;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t_NOTCABPK != null ? t_NOTCABPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_NOTCAB)) {
            return false;
        }
        T_NOTCAB other = (T_NOTCAB) object;
        if ((this.t_NOTCABPK == null && other.t_NOTCABPK != null) || (this.t_NOTCABPK != null && !this.t_NOTCABPK.equals(other.t_NOTCABPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_NOTCAB[ t_NOTCABPK=" + t_NOTCABPK + " ]";
    }

    public Ptovta getPtovtaId() {
        return ptovtaId;
    }

    public void setPtovtaId(Ptovta ptovtaId) {
        this.ptovtaId = ptovtaId;
    }
    
}
