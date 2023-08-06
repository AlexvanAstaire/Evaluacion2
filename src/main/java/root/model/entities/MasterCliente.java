/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.model.entities;

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
 * @author fv192
 */
@Entity
@Table(name = "master_clientes")
@NamedQueries({
    @NamedQuery(name = "MasterCliente.findAll", query = "SELECT m FROM MasterCliente m"),
    @NamedQuery(name = "MasterCliente.findByCliIdentificacion", query = "SELECT m FROM MasterCliente m WHERE m.cliIdentificacion = :cliIdentificacion"),
    @NamedQuery(name = "MasterCliente.findByCliNombres", query = "SELECT m FROM MasterCliente m WHERE m.cliNombres = :cliNombres"),
    @NamedQuery(name = "MasterCliente.findByCliApellidos", query = "SELECT m FROM MasterCliente m WHERE m.cliApellidos = :cliApellidos"),
    @NamedQuery(name = "MasterCliente.findByRut", query = "SELECT m FROM MasterCliente m WHERE m.rut = :rut"),
    @NamedQuery(name = "MasterCliente.findByCiudad", query = "SELECT m FROM MasterCliente m WHERE m.ciudad = :ciudad")})
public class MasterCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cli_identificacion")
    private String cliIdentificacion;
    @Size(max = 2147483647)
    @Column(name = "cli_nombres")
    private String cliNombres;
    @Size(max = 2147483647)
    @Column(name = "cli_apellidos")
    private String cliApellidos;
    @Size(max = 2147483647)
    @Column(name = "rut")
    private String rut;
    @Size(max = 2147483647)
    @Column(name = "ciudad")
    private String ciudad;

    public MasterCliente() {
    }

    public MasterCliente(String cliIdentificacion) {
        this.cliIdentificacion = cliIdentificacion;
    }

    public String getCliIdentificacion() {
        return cliIdentificacion;
    }

    public void setCliIdentificacion(String cliIdentificacion) {
        this.cliIdentificacion = cliIdentificacion;
    }

    public String getCliNombres() {
        return cliNombres;
    }

    public void setCliNombres(String cliNombres) {
        this.cliNombres = cliNombres;
    }

    public String getCliApellidos() {
        return cliApellidos;
    }

    public void setCliApellidos(String cliApellidos) {
        this.cliApellidos = cliApellidos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliIdentificacion != null ? cliIdentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasterCliente)) {
            return false;
        }
        MasterCliente other = (MasterCliente) object;
        if ((this.cliIdentificacion == null && other.cliIdentificacion != null) || (this.cliIdentificacion != null && !this.cliIdentificacion.equals(other.cliIdentificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "root.model.entities.MasterCliente[ cliIdentificacion=" + cliIdentificacion + " ]";
    }
    
}
