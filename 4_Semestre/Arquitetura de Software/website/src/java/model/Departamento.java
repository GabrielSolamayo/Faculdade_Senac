/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gabriel.esmunoz
 */
@Entity
@Table(name = "departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d"),
    @NamedQuery(name = "Departamento.findByIdDep", query = "SELECT d FROM Departamento d WHERE d.idDep = :idDep"),
    @NamedQuery(name = "Departamento.findByNomeDep", query = "SELECT d FROM Departamento d WHERE d.nomeDep = :nomeDep"),
    @NamedQuery(name = "Departamento.findByFoneDep", query = "SELECT d FROM Departamento d WHERE d.foneDep = :foneDep")})
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDep")
    private String idDep;
    @Basic(optional = false)
    @Column(name = "nomeDep")
    private String nomeDep;
    @Column(name = "foneDep")
    private String foneDep;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamento", fetch = FetchType.EAGER)
    private Collection<Funcionario> funcionarioCollection;

    public Departamento() {
    }

    public Departamento(String idDep) {
        this.idDep = idDep;
    }

    public Departamento(String idDep, String nomeDep) {
        this.idDep = idDep;
        this.nomeDep = nomeDep;
    }

    public String getIdDep() {
        return idDep;
    }

    public void setIdDep(String idDep) {
        this.idDep = idDep;
    }

    public String getNomeDep() {
        return nomeDep;
    }

    public void setNomeDep(String nomeDep) {
        this.nomeDep = nomeDep;
    }

    public String getFoneDep() {
        return foneDep;
    }

    public void setFoneDep(String foneDep) {
        this.foneDep = foneDep;
    }

    @XmlTransient
    public Collection<Funcionario> getFuncionarioCollection() {
        return funcionarioCollection;
    }

    public void setFuncionarioCollection(Collection<Funcionario> funcionarioCollection) {
        this.funcionarioCollection = funcionarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDep != null ? idDep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.idDep == null && other.idDep != null) || (this.idDep != null && !this.idDep.equals(other.idDep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Departamento[ idDep=" + idDep + " ]";
    }
    
}
