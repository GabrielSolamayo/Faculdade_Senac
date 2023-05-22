package model.dao;

import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.entity.Acesso;
import model.entity.Departamento;
import model.entity.Funcionario;

public class EmpresaDao {

    private EntityManager manager;

    private void conectar() {
        manager = Persistence.createEntityManagerFactory("WebSITEEPU").createEntityManager();
    }

    public Acesso validarLogin(String u, String s) {
        conectar();
        try {
            TypedQuery<Acesso> q = manager.createNamedQuery("Acesso.findByEmailSenhaFunc", Acesso.class);//Query tirado da classe "Acesso",query para pegar usuario e senha;
            q.setParameter("senhaFunc", s);
            q.setParameter("emailFunc", u);
            return q.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    public <T> int salvar(T obj) {
        conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(obj);
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
            return manager.createNamedQuery("Departamento.findAll", Departamento.class).getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    public List<Departamento> consultarDepartamentos(String nomeDep) {
        conectar();
        try {
            return manager.createNamedQuery("Departamento.findByNomeDep", Departamento.class).setParameter("nomeDep", "%" + nomeDep + "%").getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    public List<Departamento> consultarDepartamento(String nome) {
        conectar();
        try {
            TypedQuery<Departamento> q = manager.createNamedQuery("Departament.findAll", Departamento.class);
            q.setParameter("nomeDep", nome);
            return q.getResultList();
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
        return manager.find(Departamento.class, idDep);
    }
    
    public List<Funcionario> listarFuncionarios() {
        conectar();
        try {
            return manager.createNamedQuery("Funcionario.findAll", Funcionario.class).getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    public int excluirFuncionario(String email) {
        conectar();

        try {
            Funcionario func = manager.find(Funcionario.class, email);
            if (func == null) {
                return 2;//Nao Existe;
            } else {
                manager.getTransaction().begin();
                manager.remove(func);//So aceita tipos Object;
                manager.getTransaction().commit();
                return 1;//Encontrados;
            }
        } catch (Exception ex) {
            return 0;//Nao encontrado;
        }

    }
}
