/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabriel.esmunoz
 */
@Entity
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByEmailFunc", query = "SELECT f FROM Funcionario f WHERE f.emailFunc = :emailFunc"),
    @NamedQuery(name = "Funcionario.findByNomeFunc", query = "SELECT f FROM Funcionario f WHERE f.nomeFunc = :nomeFunc"),
    @NamedQuery(name = "Funcionario.findByCargoFunc", query = "SELECT f FROM Funcionario f WHERE f.cargoFunc = :cargoFunc"),
    @NamedQuery(name = "Funcionario.findBySalarioFunc", query = "SELECT f FROM Funcionario f WHERE f.salarioFunc = :salarioFunc")})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emailFunc")
    private String emailFunc;
    @Basic(optional = false)
    @Column(name = "nomeFunc")
    private String nomeFunc;
    @Basic(optional = false)
    @Column(name = "cargoFunc")
    private String cargoFunc;
    @Basic(optional = false)
    @Column(name = "salarioFunc")
    private double salarioFunc;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "funcionario", fetch = FetchType.EAGER)
    private Acesso acesso;
    @JoinColumns({
        @JoinColumn(name = "idDep", referencedColumnName = "idDep"),
        @JoinColumn(name = "idDep", referencedColumnName = "idDep")})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Departamento departamento;

    public Funcionario() {
    }

    public Funcionario(String emailFunc) {
        this.emailFunc = emailFunc;
    }

    public Funcionario(String emailFunc, String nomeFunc, String cargoFunc, double salarioFunc) {
        this.emailFunc = emailFunc;
        this.nomeFunc = nomeFunc;
        this.cargoFunc = cargoFunc;
        this.salarioFunc = salarioFunc;
    }

    public String getEmailFunc() {
        return emailFunc;
    }

    public void setEmailFunc(String emailFunc) {
        this.emailFunc = emailFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getCargoFunc() {
        return cargoFunc;
    }

    public void setCargoFunc(String cargoFunc) {
        this.cargoFunc = cargoFunc;
    }

    public double getSalarioFunc() {
        return salarioFunc;
    }

    public void setSalarioFunc(double salarioFunc) {
        this.salarioFunc = salarioFunc;
    }

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emailFunc != null ? emailFunc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.emailFunc == null && other.emailFunc != null) || (this.emailFunc != null && !this.emailFunc.equals(other.emailFunc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Funcionario[ emailFunc=" + emailFunc + " ]";
    }
    
}
