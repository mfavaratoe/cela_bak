/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos.existencias;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "exi_notdet")
@NamedQueries({
    @NamedQuery(name = "T_NOTDET.findAll", query = "SELECT t FROM T_NOTDET t")})
public class T_NOTDET implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected T_NOTDETPK t_NOTDETPK;
    @Size(max = 15)
    @Column(name = "tipMov", length = 15)
    private String tipMov;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "codPro", nullable = false, length = 15)
    private String codPro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "canEnt", precision = 12, scale = 3)
    private Double canEnt;
    @Size(max = 15)
    @Column(name = "docRef", length = 15)
    private String docRef;
    @Size(max = 15)
    @Column(name = "stocComp", length = 15)
    private String stocComp;
    @Size(max = 10)
    @Column(name = "codProCons", length = 10)
    private String codProCons;
    @Column(name = "canEntCons", precision = 12, scale = 3)
    private Double canEntCons;
    @Size(max = 45)
    @Column(name = "creacionUsuario", length = 45)
    private String creacionUsuario;
    @Column(name = "creacionFecha")
    @Temporal(TemporalType.DATE)
    private Date creacionFecha;
    @Size(max = 45)
    @Column(name = "modificacionUsuario", length = 45)
    private String modificacionUsuario;
    @Column(name = "modificacionFecha")
    @Temporal(TemporalType.DATE)
    private Date modificacionFecha;
    @Column(name = "cosUni", precision = 15, scale = 6)
    private Double cosUni;
    
    @JoinColumns({
        @JoinColumn(name = "codAlm", referencedColumnName = "codAlm", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "claMov", referencedColumnName = "claMov", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "numMov", referencedColumnName = "numMov", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private T_NOTCAB tNotcab;
    
    @JoinColumn(name = "codPro", referencedColumnName = "codPro", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T_MAEPRO tMaepro;

    public T_NOTDET() {
    }

    public T_NOTDET(T_NOTDETPK t_NOTDETPK) {
        this.t_NOTDETPK = t_NOTDETPK;
    }

    public T_NOTDET(T_NOTDETPK t_NOTDETPK, String codPro) {
        this.t_NOTDETPK = t_NOTDETPK;
        this.codPro = codPro;
    }

    public T_NOTDET(String codAlm, String claMov, int numMov, int numSec) {
        this.t_NOTDETPK = new T_NOTDETPK(codAlm, claMov, numMov, numSec);
    }

    public T_NOTDETPK getT_NOTDETPK() {
        return t_NOTDETPK;
    }

    public void setT_NOTDETPK(T_NOTDETPK t_NOTDETPK) {
        this.t_NOTDETPK = t_NOTDETPK;
    }

    public String getTipMov() {
        return tipMov;
    }

    public void setTipMov(String tipMov) {
        this.tipMov = tipMov;
    }

    public String getCodPro() {
        return codPro;
    }

    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }

    public Double getCanEnt() {
        return canEnt;
    }

    public void setCanEnt(Double canEnt) {
        this.canEnt = canEnt;
    }

    public String getDocRef() {
        return docRef;
    }

    public void setDocRef(String docRef) {
        this.docRef = docRef;
    }

    public String getStocComp() {
        return stocComp;
    }

    public void setStocComp(String stocComp) {
        this.stocComp = stocComp;
    }

    public String getCodProCons() {
        return codProCons;
    }

    public void setCodProCons(String codProCons) {
        this.codProCons = codProCons;
    }

    public Double getCanEntCons() {
        return canEntCons;
    }

    public void setCanEntCons(Double canEntCons) {
        this.canEntCons = canEntCons;
    }

    public String getCreacionUsuario() {
        return creacionUsuario;
    }

    public void setCreacionUsuario(String creacionUsuario) {
        this.creacionUsuario = creacionUsuario;
    }

    public Date getCreacionFecha() {
        return creacionFecha;
    }

    public void setCreacionFecha(Date creacionFecha) {
        this.creacionFecha = creacionFecha;
    }

    public String getModificacionUsuario() {
        return modificacionUsuario;
    }

    public void setModificacionUsuario(String modificacionUsuario) {
        this.modificacionUsuario = modificacionUsuario;
    }

    public Date getModificacionFecha() {
        return modificacionFecha;
    }

    public void setModificacionFecha(Date modificacionFecha) {
        this.modificacionFecha = modificacionFecha;
    }

    public T_NOTCAB getTNotcab() {
        return tNotcab;
    }

    public void setTNotcab(T_NOTCAB tNotcab) {
        this.tNotcab = tNotcab;
    }

    public T_MAEPRO getTMaepro() {
        return tMaepro;
    }

    public void setTMaepro(T_MAEPRO tMaepro) {
        this.tMaepro = tMaepro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t_NOTDETPK != null ? t_NOTDETPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_NOTDET)) {
            return false;
        }
        T_NOTDET other = (T_NOTDET) object;
        if ((this.t_NOTDETPK == null && other.t_NOTDETPK != null) || (this.t_NOTDETPK != null && !this.t_NOTDETPK.equals(other.t_NOTDETPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_NOTDET[ t_NOTDETPK=" + t_NOTDETPK + " ]";
    }

    public Double getCosUni() {
        return cosUni;
    }

    public void setCosUni(Double cosUni) {
        this.cosUni = cosUni;
    }

    public T_NOTCAB gettNotcab() {
        return tNotcab;
    }

    public void settNotcab(T_NOTCAB tNotcab) {
        this.tNotcab = tNotcab;
    }

    public T_MAEPRO gettMaepro() {
        return tMaepro;
    }

    public void settMaepro(T_MAEPRO tMaepro) {
        this.tMaepro = tMaepro;
    }
    
}
