package model;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EmpresaDao {

    private EntityManagerFactory conn;
    private EntityManager manager;

    public void conectar() {
        conn = Persistence.createEntityManagerFactory("WebSITEEPU");//Nome tirado da pasta "Configuration Files", "pesistence.xml";
        manager = conn.createEntityManager();
    }

    public Acesso validarLogin(String u, String s) {
        conectar();
        try {
            TypedQuery<Acesso> q = manager.createNamedQuery("Acesso.findByEmailSenhaFunc", Acesso.class);//Query tirado da classe "Acesso",query para pegar usuario e senha;
            q.setParameter("senhaFunc", s);
            q.setParameter("emailFunc", u);
            Acesso acesso = q.getSingleResult();
            return acesso;
        } catch (NoResultException ex) {
            return null;
        }

    }

    public int salvarDepartamento(Departamento dep) {
        conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(dep);
            manager.getTransaction().commit();
            return 1;//Cadastro;
        }catch(EntityExistsException ex){
            return 2;//Já ta cadastrado;
        }catch (Exception ex){
            return 3;//Deu qualquer outro erro;
        }
        
    }
}
