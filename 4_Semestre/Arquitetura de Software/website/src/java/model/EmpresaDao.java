package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EmpresaDao {
    
    private EntityManagerFactory conn;
    private EntityManager manager;
    
    public void conectar(){
        conn = Persistence.createEntityManagerFactory("websitePU");//Nome tirado da pasta "Configuration Files", "pesistence.xml";
        manager = conn.createEntityManager();
    }
    public Acesso validarLogin(String u, String s){
        conectar();
        TypedQuery<Acesso> q = manager.createNamedQuery("Acesso.findByEmailSenhaFunc", Acesso.class);//Query tirado da classe "Acesso",query para pegar usuario e senha;
        q.setParameter("senhaFunc", s);
        q.setParameter("emailFunc", u);
        Acesso acesso = q.getSingleResult();
        return acesso;
    }
}
