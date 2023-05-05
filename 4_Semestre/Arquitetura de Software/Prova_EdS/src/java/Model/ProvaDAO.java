/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author gabriel.esmunoz
 */
public class ProvaDAO {
    
    private EntityManagerFactory conn;
    private EntityManager manager;

    public void conectar() {
        conn = Persistence.createEntityManagerFactory("Prova_EdSPU");//Nome tirado da pasta "Configuration Files", "pesistence.xml";
        manager = conn.createEntityManager();
    }
    
    
    public int salvarDepartamento(Aluno aluno) {
        conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(aluno);
            manager.getTransaction().commit();
            return 1;//Cadastro;
        } catch (EntityExistsException ex) {
            return 2;//Já ta cadastrado;
        } catch (Exception ex) {
            return 3;//Deu qualquer outro erro;
        }
    }
    
    public List<Aluno> listarAlunos() {
        conectar();
        try {
            TypedQuery<Aluno> q = manager.createNamedQuery("Aluno.findAll", Aluno.class);//Query tirado da classe "Departamento";
            List<Aluno> departamentos = q.getResultList();
            return departamentos;
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    public List<Aluno> consultarAlunos(String nomeA) {
        conectar();
        try {
            TypedQuery<Aluno> q = manager.createNamedQuery("Aluno.findByNome", Aluno.class).setParameter("nome", "%" + nomeA + "%");
            List<Aluno> departamentos = q.getResultList();
            return departamentos;
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    public List<Aluno> consultarAluno(String nomeA) {
        conectar();
        try {
            TypedQuery<Aluno> q = manager.createNamedQuery("Aluno.findAll", Aluno.class);
            q.setParameter("nome", nomeA);
            List<Aluno> departamentos = q.getResultList();
            return departamentos;
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    public int excluirDepartamento(int matricula) {
        conectar();

        try {
            Aluno aluno = manager.find(Aluno.class, matricula);
            if (aluno == null) {
                return 2;//Nao Existe;
            } else {
                manager.getTransaction().begin();
                manager.remove(aluno);//So aceita tipos Object;
                manager.getTransaction().commit();
                return 1;//Encontrados;
            }
        } catch (Exception ex) {
            return 0;//Nao encontrado;
        }

    }
    
    public Aluno buscarAluno(int matricula) {
        conectar();
        Aluno aluno = manager.find(Aluno.class, matricula);
        return aluno;
    }
    
    public int alterarAluno(int matricula, String nome, String disciplina, int quantA, float media) {
        conectar();

        try {
            Aluno aluno = manager.find(Aluno.class, matricula);
            
            aluno.setNome(nome);
            aluno.setDisciplina(disciplina);
            aluno.setQuantidadeAula(quantA);
            aluno.setMediaFinal(media);

            manager.getTransaction().begin();
            manager.merge(aluno);//So aceita tipos Object;
            manager.getTransaction().commit();
            return 1;//Encontrados;
        } catch (Exception ex) {
            return 0;//Nao encontrado;
        }

    }
}
