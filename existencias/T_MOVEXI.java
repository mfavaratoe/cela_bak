/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos.existencias;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "exi_movexi")
@NamedQueries({
    @NamedQuery(name = "T_MOVEXI.findAll", query = "SELECT t FROM T_MOVEXI t")})
public class T_MOVEXI implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected T_MOVEXIPK t_MOVEXIPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "canIng", precision = 12, scale = 3)
    private BigDecimal canIng;
    @Column(name = "valIng", precision = 15, scale = 2)
    private BigDecimal valIng;
    @Column(name = "canSal", precision = 12, scale = 3)
    private BigDecimal canSal;
    @Column(name = "valSal", precision = 15, scale = 2)
    private BigDecimal valSal;
    @Column(name = "canSad", precision = 12, scale = 3)
    private BigDecimal canSad;
    @Column(name = "valSad", precision = 15, scale = 2)
    private BigDecimal valSad;
    @Column(name = "cosUni", precision = 15, scale = 2)
    private BigDecimal cosUni;
    @Size(max = 15)
    @Column(name = "codDoc", length = 15)
    private String codDoc;
    @Column(name = "fecDoc")
    @Temporal(TemporalType.DATE)
    private Date fecDoc;
    @Column(name = "fecCont")
    @Temporal(TemporalType.DATE)
    private Date fecCont;
    @Size(max = 15)
    @Column(name = "docRef", length = 15)
    private String docRef;
    @Size(max = 15)
    @Column(name = "stocComp", length = 15)
    private String stocComp;
    @Size(max = 15)
    @Column(name = "estadoId", length = 15)
    private String estadoId;
    @JoinColumn(name = "codPro", referencedColumnName = "codPro", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T_MAEPRO tMaepro;
    @JoinColumn(name = "codAlm", referencedColumnName = "codAlm", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T_MAEALM tMaealm;

    public T_MOVEXI() {
    }

    public T_MOVEXI(T_MOVEXIPK t_MOVEXIPK) {
        this.t_MOVEXIPK = t_MOVEXIPK;
    }

    public T_MOVEXI(String codPro, String codAlm) {
        this.t_MOVEXIPK = new T_MOVEXIPK(codPro, codAlm);
    }

    public T_MOVEXIPK getT_MOVEXIPK() {
        return t_MOVEXIPK;
    }

    public void setT_MOVEXIPK(T_MOVEXIPK t_MOVEXIPK) {
        this.t_MOVEXIPK = t_MOVEXIPK;
    }

    public BigDecimal getCanIng() {
        return canIng;
    }

    public void setCanIng(BigDecimal canIng) {
        this.canIng = canIng;
    }

    public BigDecimal getValIng() {
        return valIng;
    }

    public void setValIng(BigDecimal valIng) {
        this.valIng = valIng;
    }

    public BigDecimal getCanSal() {
        return canSal;
    }

    public void setCanSal(BigDecimal canSal) {
        this.canSal = canSal;
    }

    public BigDecimal getValSal() {
        return valSal;
    }

    public void setValSal(BigDecimal valSal) {
        this.valSal = valSal;
    }

    public BigDecimal getCanSad() {
        return canSad;
    }

    public void setCanSad(BigDecimal canSad) {
        this.canSad = canSad;
    }

    public BigDecimal getValSad() {
        return valSad;
    }

    public void setValSad(BigDecimal valSad) {
        this.valSad = valSad;
    }

    public BigDecimal getCosUni() {
        return cosUni;
    }

    public void setCosUni(BigDecimal cosUni) {
        this.cosUni = cosUni;
    }

    public String getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(String codDoc) {
        this.codDoc = codDoc;
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

    public String getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(String estadoId) {
        this.estadoId = estadoId;
    }

    public T_MAEPRO getTMaepro() {
        return tMaepro;
    }

    public void setTMaepro(T_MAEPRO tMaepro) {
        this.tMaepro = tMaepro;
    }

    public T_MAEALM getTMaealm() {
        return tMaealm;
    }

    public void setTMaealm(T_MAEALM tMaealm) {
        this.tMaealm = tMaealm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t_MOVEXIPK != null ? t_MOVEXIPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_MOVEXI)) {
            return false;
        }
        T_MOVEXI other = (T_MOVEXI) object;
        if ((this.t_MOVEXIPK == null && other.t_MOVEXIPK != null) || (this.t_MOVEXIPK != null && !this.t_MOVEXIPK.equals(other.t_MOVEXIPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_MOVEXI[ t_MOVEXIPK=" + t_MOVEXIPK + " ]";
    }
    
}
