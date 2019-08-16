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
public class T_MOVEXIPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "codPro", nullable = false, length = 15)
    private String codPro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "codAlm", nullable = false, length = 15)
    private String codAlm;

    public T_MOVEXIPK() {
    }

    public T_MOVEXIPK(String codPro, String codAlm) {
        this.codPro = codPro;
        this.codAlm = codAlm;
    }

    public String getCodPro() {
        return codPro;
    }

    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }

    public String getCodAlm() {
        return codAlm;
    }

    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPro != null ? codPro.hashCode() : 0);
        hash += (codAlm != null ? codAlm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_MOVEXIPK)) {
            return false;
        }
        T_MOVEXIPK other = (T_MOVEXIPK) object;
        if ((this.codPro == null && other.codPro != null) || (this.codPro != null && !this.codPro.equals(other.codPro))) {
            return false;
        }
        if ((this.codAlm == null && other.codAlm != null) || (this.codAlm != null && !this.codAlm.equals(other.codAlm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_MOVEXIPK[ codPro=" + codPro + ", codAlm=" + codAlm + " ]";
    }
    
}
