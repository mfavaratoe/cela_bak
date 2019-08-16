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
@Table(name = "exi_pedmat")
@NamedQueries({
    @NamedQuery(name = "T_PEDMAT.findAll", query = "SELECT t FROM T_PEDMAT t")})
public class T_PEDMAT implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected T_PEDMATPK t_PEDMATPK;
    @Column(name = "fecPed")
    @Temporal(TemporalType.DATE)
    private Date fecPed;
    @Size(max = 15)
    @Column(name = "codAlm", length = 15)
    private String codAlm;
    @Size(max = 45)
    @Column(name = "origen", length = 45)
    private String origen;
    @Size(max = 45)
    @Column(name = "destino", length = 45)
    private String destino;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "canAtendida", precision = 15, scale = 3)
    private BigDecimal canAtendida;
    @Size(max = 15)
    @Column(name = "ordenId", length = 15)
    private String ordenId;
    @Column(name = "fecaut")
    @Temporal(TemporalType.DATE)
    private Date fecaut;
    @Column(name = "pedSit")
    private Integer pedSit;
    @Column(name = "canPed", precision = 15, scale = 3)
    private BigDecimal canPed;
    @Column(name = "estrabid")
    private Integer estrabid;
    @Column(name = "idordd")
    private Integer idordd;
    

    
    @JoinColumn(name = "codProd", referencedColumnName = "codPro", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T_MAEPRO tMaepro;

    public T_PEDMAT() {
    }

    public T_PEDMAT(T_PEDMATPK t_PEDMATPK) {
        this.t_PEDMATPK = t_PEDMATPK;
    }

    public T_PEDMAT(int pedidoId, int secuencia, String codProd) {
        this.t_PEDMATPK = new T_PEDMATPK(pedidoId, secuencia, codProd);
    }

    public T_PEDMATPK getT_PEDMATPK() {
        return t_PEDMATPK;
    }

    public void setT_PEDMATPK(T_PEDMATPK t_PEDMATPK) {
        this.t_PEDMATPK = t_PEDMATPK;
    }

    public Date getFecPed() {
        return fecPed;
    }

    public void setFecPed(Date fecPed) {
        this.fecPed = fecPed;
    }

    public String getCodAlm() {
        return codAlm;
    }

    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public BigDecimal getCanAtendida() {
        return canAtendida;
    }

    public void setCanAtendida(BigDecimal canAtendida) {
        this.canAtendida = canAtendida;
    }

    public String getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(String ordenId) {
        this.ordenId = ordenId;
    }

    public Date getFecaut() {
        return fecaut;
    }

    public void setFecaut(Date fecaut) {
        this.fecaut = fecaut;
    }

    public Integer getPedSit() {
        return pedSit;
    }

    public void setPedSit(Integer pedSit) {
        this.pedSit = pedSit;
    }

    public BigDecimal getCanPed() {
        return canPed;
    }

    public void setCanPed(BigDecimal canPed) {
        this.canPed = canPed;
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
        hash += (t_PEDMATPK != null ? t_PEDMATPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_PEDMAT)) {
            return false;
        }
        T_PEDMAT other = (T_PEDMAT) object;
        if ((this.t_PEDMATPK == null && other.t_PEDMATPK != null) || (this.t_PEDMATPK != null && !this.t_PEDMATPK.equals(other.t_PEDMATPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_PEDMAT[ t_PEDMATPK=" + t_PEDMATPK + " ]";
    }

    public Integer getEstrabid() {
        return estrabid;
    }

    public void setEstrabid(Integer estrabid) {
        this.estrabid = estrabid;
    }

    public Integer getIdordd() {
        return idordd;
    }

    public void setIdordd(Integer idordd) {
        this.idordd = idordd;
    }
    
}
