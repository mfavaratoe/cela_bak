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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
@Entity
@Table(name = "exi_peddet")
public class T_PEDDET implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 15)
    @Column(name = "codmat", length = 15)
    private String codmat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "canped", precision = 12)
    private Float canped;
    @Column(name = "canate", precision = 12)
    private Float canate;
    @Column(name = "precio", precision = 12)
    private Float precio;
    @Size(max = 5)
    @Column(name = "tipdoc", length = 5)
    private String tipdoc;
    @Size(max = 15)
    @Column(name = "numdoc", length = 15)
    private String numdoc;
    @Column(name = "ticket")
    private Integer ticket;
    @Size(max = 15)
    @Column(name = "ruc", length = 15)
    private String ruc;
    @Size(max = 45)
    @Column(name = "otros", length = 45)
    private String otros;
    @Size(max = 45)
    @JoinColumn(name = "numped", referencedColumnName = "numped")
    @ManyToOne
    private T_PEDCAB numped;

    public T_PEDDET() {
    }

    public T_PEDDET(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodmat() {
        return codmat;
    }

    public void setCodmat(String codmat) {
        this.codmat = codmat;
    }

    public Float getCanped() {
        return canped;
    }

    public void setCanped(Float canped) {
        this.canped = canped;
    }

    public Float getCanate() {
        return canate;
    }

    public void setCanate(Float canate) {
        this.canate = canate;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }

    public String getNumdoc() {
        return numdoc;
    }

    public void setNumdoc(String numdoc) {
        this.numdoc = numdoc;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public T_PEDCAB getNumped() {
        return numped;
    }

    public void setNumped(T_PEDCAB numped) {
        this.numped = numped;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T_PEDDET)) {
            return false;
        }
        T_PEDDET other = (T_PEDDET) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.existencias.T_PEDDET[ id=" + id + " ]";
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
    
}
