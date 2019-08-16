/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.existencias;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "exi_maepro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "T_MAEPRO.findAll", query = "SELECT t FROM T_MAEPRO t"),
    @NamedQuery(name = "T_MAEPRO.findByCodPro", query = "SELECT t FROM T_MAEPRO t WHERE t.codPro = :codPro"),
    @NamedQuery(name = "T_MAEPRO.findByNomPro", query = "SELECT t FROM T_MAEPRO t WHERE t.nomPro = :nomPro"),
    @NamedQuery(name = "T_MAEPRO.findByCodequivpro", query = "SELECT t FROM T_MAEPRO t WHERE t.codequivpro = :codequivpro"),
    @NamedQuery(name = "T_MAEPRO.findByAbrnompro", query = "SELECT t FROM T_MAEPRO t WHERE t.abrnompro = :abrnompro"),
    @NamedQuery(name = "T_MAEPRO.findByUnidmed", query = "SELECT t FROM T_MAEPRO t WHERE t.unidmed = :unidmed"),
    @NamedQuery(name = "T_MAEPRO.findByTipexiSUNAT", query = "SELECT t FROM T_MAEPRO t WHERE t.tipexiSUNAT = :tipexiSUNAT"),
    @NamedQuery(name = "T_MAEPRO.findByAfectoIGV", query = "SELECT t FROM T_MAEPRO t WHERE t.afectoIGV = :afectoIGV"),
    @NamedQuery(name = "T_MAEPRO.findByTiptransac", query = "SELECT t FROM T_MAEPRO t WHERE t.tiptransac = :tiptransac"),
    @NamedQuery(name = "T_MAEPRO.findByEstado", query = "SELECT t FROM T_MAEPRO t WHERE t.estado = :estado"),
    @NamedQuery(name = "T_MAEPRO.findByStockMax", query = "SELECT t FROM T_MAEPRO t WHERE t.stockMax = :stockMax"),
    @NamedQuery(name = "T_MAEPRO.findByStockMin", query = "SELECT t FROM T_MAEPRO t WHERE t.stockMin = :stockMin"),
    @NamedQuery(name = "T_MAEPRO.findByCosuni", query = "SELECT t FROM T_MAEPRO t WHERE t.cosuni = :cosuni")})
public class T_MAEPRO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "codPro")
    private String codPro;
    @Size(max = 120)
    @Column(name = "nomPro")
    private String nomPro;
    @Size(max = 15)
    @Column(name = "codequivpro")
    private String codequivpro;
    @Size(max = 8)
    @Column(name = "abrnompro")
    private String abrnompro;
    @Size(max = 7)
    @Column(name = "unidmed")
    private String unidmed;
    @Size(max = 7)
    @Column(name = "tipexiSUNAT")
    private String tipexiSUNAT;
    @Size(max = 7)
    @Column(name = "afectoIGV")
    private String afectoIGV;
    @Size(max = 7)
    @Column(name = "tiptransac")
    private String tiptransac;
    @Size(max = 7)
    @Column(name = "estado")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "stockMax")
    private Double stockMax;
    @Column(name = "stockMin")
    private Double stockMin;
    @Column(name = "cosuni")
    private Float cosuni;
    private Float precio;
    @JoinColumn(name = "tipPro", referencedColumnName = "tipPro")
    @ManyToOne
    private T_TIPPRO tipPro;

    public T_MAEPRO() {
    }

    public T_MAEPRO(String codPro) {
        this.codPro = codPro;
    }

    public String getCodPro() {
        return codPro;
    }

    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }

    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    public String getCodequivpro() {
        return codequivpro;
    }

    public void setCodequivpro(String codequivpro) {
        this.codequivpro = codequivpro;
    }

    public String getAbrnompro() {
        return abrnompro;
    }

    public void setAbrnompro(String abrnompro) {
        this.abrnompro = abrnompro;
    }

    public String getUnidmed() {
        return unidmed;
    }

    public void setUnidmed(String unidmed) {
        this.unidmed = unidmed;
    }

    public String getTipexiSUNAT() {
        return tipexiSUNAT;
    }

    public void setTipexiSUNAT(String tipexiSUNAT) {
        this.tipexiSUNAT = tipexiSUNAT;
    }

    public String getAfectoIGV() {
        return afectoIGV;
    }

    public void setAfectoIGV(String afectoIGV) {
        this.afectoIGV = afectoIGV;
    }

    public String getTiptransac() {
        return tiptransac;
    }

    public void setTiptransac(String tiptransac) {
        this.tiptransac = tiptransac;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getStockMax() {
        return stockMax;
    }

    public void setStockMax(Double stockMax) {
        this.stockMax = stockMax;
    }

    public Double getStockMin() {
        return stockMin;
    }

    public void setStockMin(Double stockMin) {
        this.stockMin = stockMin;
    }

    public Float getCosuni() {
        return cosuni;
    }

    public void setCosuni(Float cosuni) {
        this.cosuni = cosuni;
    }

    public T_TIPPRO getTipPro() {
        return tipPro;
    }

    public void setTipPro(T_TIPPRO tipPro) {
        this.tipPro = tipPro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPro != null ? codPro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_MAEPRO)) {
            return false;
        }
        T_MAEPRO other = (T_MAEPRO) object;
        if ((this.codPro == null && other.codPro != null) || (this.codPro != null && !this.codPro.equals(other.codPro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_MAEPRO[ codPro=" + codPro + " ]";
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
}
