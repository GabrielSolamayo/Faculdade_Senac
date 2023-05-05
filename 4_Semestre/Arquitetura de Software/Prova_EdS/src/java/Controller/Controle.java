/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Model.Aluno;
import Model.ProvaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gabriel.esmunoz
 */
@WebServlet(name = "Controle", urlPatterns = {"/Controle"})
public class Controle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String flag, mensagem;
        flag = request.getParameter("flag");
        
        if(flag.equalsIgnoreCase("CadastroAluno")){
            Aluno aluno = new Aluno();
            int matri = Integer.parseInt(request.getParameter("matricula"));
            aluno.setMatricula(matri);
            aluno.setNome(request.getParameter("nome"));
            aluno.setDisciplina(request.getParameter("disciplina"));
            int quant = Integer.parseInt(request.getParameter("quantAula"));
            aluno.setQuantidadeAula(quant);
            float media  = Float.parseFloat(request.getParameter("mediaF"));
            aluno.setMediaFinal(media);
            
            int resp = new ProvaDAO().salvarDepartamento(aluno);
            
            switch (resp) {
                case 1:
                    mensagem = "Departamento salvo com sucesso";
                    break;
                case 2:
                    mensagem = "Este departamento ja está cadastrado";
                    break;
                default:
                    mensagem = "Entre em contato com o administrador";
                    break;
            }
            request.setAttribute("m", mensagem);
            RequestDispatcher disp = request.getRequestDispatcher("MensagensDeErro.jsp");
            disp.forward(request, response);
            
        }else if (flag.equalsIgnoreCase("ListarAlunos")){
            
            List<Aluno> alunos = new ProvaDAO().listarAlunos(); //Instancia logo de uma vez, ao inves de criar uma variavel "atoa";
            
            request.setAttribute("listarAlunos", alunos);
            RequestDispatcher disp = request.getRequestDispatcher("ListarAlunos.jsp");
            disp.forward(request, response);
            
        }else if(flag.equalsIgnoreCase("ConsultarAluno")){
            
            String nomeA = request.getParameter("nome");
            ProvaDAO prova = new ProvaDAO();
            List<Aluno> alunos = prova.consultarAlunos(nomeA);
            
            request.setAttribute("listarAlunos", alunos);
            RequestDispatcher disp = request.getRequestDispatcher("ListarAlunos.jsp");
            disp.forward(request, response);
        }else if(flag.equalsIgnoreCase("ExcluirAlunos")){
            
            int matricula = Integer.parseInt(request.getParameter("matricula"));
            ProvaDAO prova = new ProvaDAO();
            int exc = prova.excluirDepartamento(matricula);
            if(exc == 1){
                mensagem = "Aluno excluído com sucesso";
            }else if(exc == 2){
                mensagem = "A matricula '"+matricula+"' nao existe";
            }else{
                mensagem = "Erro ao tentar excluir o aluno";
            }
            request.setAttribute("m", mensagem);
            RequestDispatcher disp = request.getRequestDispatcher("MensagensDeErro.jsp");
            disp.forward(request, response);
            
        }else if(flag.equalsIgnoreCase("BuscarAluno")){
            
            int matricula = Integer.parseInt(request.getParameter("matricula"));
            
            ProvaDAO prova = new ProvaDAO();
            Aluno aluno = prova.buscarAluno(matricula);
            
            if(aluno == null){
                request.setAttribute("m", "Aluno não encontrado");
                RequestDispatcher disp = request.getRequestDispatcher("MensagensDeErro.jsp");
                disp.forward(request, response);
            }else{
                request.setAttribute("aluno", aluno);
                RequestDispatcher disp = request.getRequestDispatcher("AlterarAlunosPeloID.jsp");
                disp.forward(request, response);
            }
            
        }else if(flag.equalsIgnoreCase("AlterarAlunos")){
            
            int matricula = Integer.parseInt(request.getParameter("matricula"));
            String nome = request.getParameter("nome");
            String disciplina = request.getParameter("disciplina");
            int quantA = Integer.parseInt(request.getParameter("quantAula"));
            float media = Float.parseFloat(request.getParameter("mediaF"));
            
            ProvaDAO prova = new ProvaDAO();
            
            int resultado = prova.alterarAluno(matricula, nome, disciplina, quantA, media);
            if(resultado == 1){
                mensagem = "Dados do Aluno alterados com sucesso";
            }else{
                mensagem = "Erro ao tentar alterar dados do Aluno";
            }
            request.setAttribute("m", mensagem);
            RequestDispatcher disp = request.getRequestDispatcher("MensagensDeErro.jsp");
            disp.forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
