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
public class T_PEDMATPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "pedidoId", nullable = false)
    private int pedidoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "secuencia", nullable = false)
    private int secuencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "codProd", nullable = false, length = 15)
    private String codProd;

    public T_PEDMATPK() {
    }

    public T_PEDMATPK(int pedidoId, int secuencia, String codProd) {
        this.pedidoId = pedidoId;
        this.secuencia = secuencia;
        this.codProd = codProd;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    public String getCodProd() {
        return codProd;
    }

    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pedidoId;
        hash += (int) secuencia;
        hash += (codProd != null ? codProd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_PEDMATPK)) {
            return false;
        }
        T_PEDMATPK other = (T_PEDMATPK) object;
        if (this.pedidoId != other.pedidoId) {
            return false;
        }
        if (this.secuencia != other.secuencia) {
            return false;
        }
        if ((this.codProd == null && other.codProd != null) || (this.codProd != null && !this.codProd.equals(other.codProd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_PEDMATPK[ pedidoId=" + pedidoId + ", secuencia=" + secuencia + ", codProd=" + codProd + " ]";
    }
    
}
