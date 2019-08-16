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
@Table(name = "exi_maealm" )
@NamedQueries({
    @NamedQuery(name = "T_MAEALM.findAll", query = "SELECT t FROM T_MAEALM t")})
public class T_MAEALM implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "codAlm", nullable = false, length = 15)
    private String codAlm;
    @Size(max = 15)
    @Column(name = "abrAlm", length = 15)
    private String abrAlm;
    @Size(max = 45)
    @Column(name = "nomAlm", length = 45)
    private String nomAlm;
    @Size(max = 15)
    @Column(name = "codLoc", length = 15)
    private String codLoc;
    @Column(name = "ingreso")
    private Integer ingreso;
    @Column(name = "salida")
    private Integer salida;
    @Column(name = "direccion", length = 255)
    private String direccion;
    @Column(name = "contacto", length = 255)
    private String contacto;
    @Column(name = "telefono", length = 255)
    private String telefono;

    public T_MAEALM() {
    }

    public T_MAEALM(String codAlm) {
        this.codAlm = codAlm;
    }

    public String getCodAlm() {
        return codAlm;
    }

    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }

    public String getAbrAlm() {
        return abrAlm;
    }

    public void setAbrAlm(String abrAlm) {
        this.abrAlm = abrAlm;
    }

    public String getNomAlm() {
        return nomAlm;
    }

    public void setNomAlm(String nomAlm) {
        this.nomAlm = nomAlm;
    }

    public String getCodLoc() {
        return codLoc;
    }

    public void setCodLoc(String codLoc) {
        this.codLoc = codLoc;
    }

    public Integer getIngreso() {
        return ingreso;
    }

    public void setIngreso(Integer ingreso) {
        this.ingreso = ingreso;
    }

    public Integer getSalida() {
        return salida;
    }

    public void setSalida(Integer salida) {
        this.salida = salida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAlm != null ? codAlm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_MAEALM)) {
            return false;
        }
        T_MAEALM other = (T_MAEALM) object;
        if ((this.codAlm == null && other.codAlm != null) || (this.codAlm != null && !this.codAlm.equals(other.codAlm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_MAEALM[ codAlm=" + codAlm + " ]";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
