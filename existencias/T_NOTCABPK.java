/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos.existencias;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrador
 */
@Embeddable
public class T_NOTCABPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "codAlm", nullable = false, length = 15)
    private String codAlm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "claMov", nullable = false, length = 15)
    private String claMov;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numMov", nullable = false)
    private int numMov;

    public T_NOTCABPK() {
    }

    public T_NOTCABPK(String codAlm, String claMov, int numMov) {
        this.codAlm = codAlm;
        this.claMov = claMov;
        this.numMov = numMov;
    }

    public String getCodAlm() {
        return codAlm;
    }

    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }

    public String getClaMov() {
        return claMov;
    }

    public void setClaMov(String claMov) {
        this.claMov = claMov;
    }

    public int getNumMov() {
        return numMov;
    }

    public void setNumMov(int numMov) {
        this.numMov = numMov;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAlm != null ? codAlm.hashCode() : 0);
        hash += (claMov != null ? claMov.hashCode() : 0);
        hash += (int) numMov;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_NOTCABPK)) {
            return false;
        }
        T_NOTCABPK other = (T_NOTCABPK) object;
        if ((this.codAlm == null && other.codAlm != null) || (this.codAlm != null && !this.codAlm.equals(other.codAlm))) {
            return false;
        }
        if ((this.claMov == null && other.claMov != null) || (this.claMov != null && !this.claMov.equals(other.claMov))) {
            return false;
        }
        if (this.numMov != other.numMov) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_NOTCABPK[ codAlm=" + codAlm + ", claMov=" + claMov + ", numMov=" + numMov + " ]";
    }
    
}
