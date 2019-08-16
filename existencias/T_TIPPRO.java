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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
@Entity
@Table(name = "exi_tippro" )
@NamedQueries({
    @NamedQuery(name = "T_TIPPRO.findAll", query = "SELECT t FROM T_TIPPRO t")})
public class T_TIPPRO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tipPro", nullable = false, length = 10)
    private String tipPro;
    @Size(max = 15)
    @Column(name = "abrTipPro", length = 15)
    private String abrTipPro;
    @Size(max = 45)
    @Column(name = "nomTipPro", length = 45)
    private String nomTipPro;
    @Size(max = 15)
    @Column(name = "ctactb", length = 15)
    private String ctactb;
    @Size(max = 7)
    @Column(name = "tipexiSUNAT", length = 7)
    private String tipexiSUNAT;
    @Size(max = 7)
    @Column(name = "clasepro", length = 7)
    private String clasepro;
    @Size(max = 7)
    @Column(name = "estado", length = 7)
    private String estado;

    public T_TIPPRO() {
    }

    public T_TIPPRO(String tipPro) {
        this.tipPro = tipPro;
    }

    public String getTipPro() {
        return tipPro;
    }

    public void setTipPro(String tipPro) {
        this.tipPro = tipPro;
    }

    public String getAbrTipPro() {
        return abrTipPro;
    }

    public void setAbrTipPro(String abrTipPro) {
        this.abrTipPro = abrTipPro;
    }

    public String getNomTipPro() {
        return nomTipPro;
    }

    public void setNomTipPro(String nomTipPro) {
        this.nomTipPro = nomTipPro;
    }

    public String getCtactb() {
        return ctactb;
    }

    public void setCtactb(String ctactb) {
        this.ctactb = ctactb;
    }

    public String getTipexiSUNAT() {
        return tipexiSUNAT;
    }

    public void setTipexiSUNAT(String tipexiSUNAT) {
        this.tipexiSUNAT = tipexiSUNAT;
    }

    public String getClasepro() {
        return clasepro;
    }

    public void setClasepro(String clasepro) {
        this.clasepro = clasepro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipPro != null ? tipPro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_TIPPRO)) {
            return false;
        }
        T_TIPPRO other = (T_TIPPRO) object;
        if ((this.tipPro == null && other.tipPro != null) || (this.tipPro != null && !this.tipPro.equals(other.tipPro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_TIPPRO[ tipPro=" + tipPro + " ]";
    }
    
}
