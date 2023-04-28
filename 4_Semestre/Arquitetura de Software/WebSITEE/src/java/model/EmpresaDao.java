package model;

import java.util.List;
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
        } catch (EntityExistsException ex) {
            return 2;//Já ta cadastrado;
        } catch (Exception ex) {
            return 3;//Deu qualquer outro erro;
        }

    }

    public List<Departamento> listarDepartamentos() {
        conectar();
        try {
            TypedQuery<Departamento> q = manager.createNamedQuery("Departamento.findAll", Departamento.class);//Query tirado da classe "Departamento";
            List<Departamento> departamentos = q.getResultList();
            return departamentos;
        } catch (NoResultException ex) {
            return null;
        }
    }

    public List<Departamento> consultarDepartamentos(String nomeDep) {
        conectar();
        try {
            TypedQuery<Departamento> q = manager.createNamedQuery("Departamento.findByNomeDep", Departamento.class).setParameter("nomeDep", "%" + nomeDep + "%");
            List<Departamento> departamentos = q.getResultList();
            return departamentos;
        } catch (NoResultException ex) {
            return null;
        }

    }

    public List<Departamento> consultarDepartamento(String nome) {
        conectar();
        try {
            TypedQuery<Departamento> q = manager.createNamedQuery("Departament.findAll", Departamento.class);
            q.setParameter("nomeDep", nome);
            List<Departamento> departamentos = q.getResultList();
            return departamentos;
        } catch (NoResultException ex) {
            return null;
        }
    }

    public int excluirDepartamento(String idDep) {
        conectar();

        try {
            Departamento dep = manager.find(Departamento.class, idDep);
            if (dep == null) {
                return 2;//Nao Existe;
            } else {
                manager.getTransaction().begin();
                manager.remove(dep);//So aceita tipos Object;
                manager.getTransaction().commit();
                return 1;//Encontrados;
            }
        } catch (Exception ex) {
            return 0;//Nao encontrado;
        }

    }

    public int alterarDepartamento(String idDep, String nomeDep, String foneDep) {
        conectar();

        try {
            Departamento dep = manager.find(Departamento.class, idDep);

            dep.setNomeDep(nomeDep);
            dep.setFoneDep(foneDep);

            manager.getTransaction().begin();
            manager.merge(dep);//So aceita tipos Object;
            manager.getTransaction().commit();
            return 1;//Encontrados;
        } catch (Exception ex) {
            return 0;//Nao encontrado;
        }

    }

    public Departamento buscarDepartamento(String idDep) {
        conectar();
        Departamento dep = manager.find(Departamento.class, idDep);
        return dep;
    }
}
