/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "acesso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acesso.findAll", query = "SELECT a FROM Acesso a"),
    @NamedQuery(name = "Acesso.findByEmailSenhaFunc", query = "SELECT a FROM Acesso a WHERE a.emailFunc = :emailFunc AND a.senhaFunc = :senhaFunc"),
    @NamedQuery(name = "Acesso.findByEmailFunc", query = "SELECT a FROM Acesso a WHERE a.emailFunc = :emailFunc"),
    @NamedQuery(name = "Acesso.findBySenhaFunc", query = "SELECT a FROM Acesso a WHERE a.senhaFunc = :senhaFunc")})
public class Acesso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emailFunc")
    private String emailFunc;
    @Basic(optional = false)
    @Column(name = "senhaFunc")
    private String senhaFunc;
    @JoinColumn(name = "emailFunc", referencedColumnName = "emailFunc", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Funcionario funcionario;

    public Acesso() {
    }

    public Acesso(String emailFunc) {
        this.emailFunc = emailFunc;
    }

    public Acesso(String emailFunc, String senhaFunc) {
        this.emailFunc = emailFunc;
        this.senhaFunc = senhaFunc;
    }

    public String getEmailFunc() {
        return emailFunc;
    }

    public void setEmailFunc(String emailFunc) {
        this.emailFunc = emailFunc;
    }

    public String getSenhaFunc() {
        return senhaFunc;
    }

    public void setSenhaFunc(String senhaFunc) {
        this.senhaFunc = senhaFunc;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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
        if (!(object instanceof Acesso)) {
            return false;
        }
        Acesso other = (Acesso) object;
        if ((this.emailFunc == null && other.emailFunc != null) || (this.emailFunc != null && !this.emailFunc.equals(other.emailFunc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Acesso[ emailFunc=" + emailFunc + " ]";
    }
    
}
