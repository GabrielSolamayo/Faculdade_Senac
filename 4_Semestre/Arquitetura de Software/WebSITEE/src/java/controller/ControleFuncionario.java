package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.entity.Departamento;
import model.dao.EmpresaDao;
import model.entity.Funcionario;

@WebServlet(name = "ControleFuncionario", urlPatterns = {"/ControleFuncionario"})
public class ControleFuncionario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        EmpresaDao dao = new EmpresaDao();
        Funcionario func = new Funcionario();
        Departamento dep = new Departamento();
        String mensagem;
        RequestDispatcher disp = null;
        String flag = request.getParameter("flag");
        int resp;
        if (flag.equalsIgnoreCase("BuscarDepartamento")) {//Busca os departamento cadastrados para carregar no cadastro Funcionario;
            
            List<Departamento> departamentos = dao.listarDepartamentos();
            request.setAttribute("departamentos", departamentos);
            disp = request.getRequestDispatcher("CadastrarFuncionario.jsp");
        
        } else if (flag.equalsIgnoreCase("CadastrarFuncionario")) { // Cadastra o funcionario;
            
            String email, nome, cargo, idDep;
            double salario;
            func.setEmailFunc(email = request.getParameter("email"));
            func.setNomeFunc(nome = request.getParameter("nome"));
            func.setCargoFunc(cargo = request.getParameter("cargo"));
            func.setSalarioFunc(salario = Double.parseDouble(request.getParameter("salario")));
            dep.setIdDep(idDep = request.getParameter("idDep"));
            func.setDepartamento(dep);

            resp = dao.salvar(func);

            switch (resp) {
                case 1:
                    mensagem = "Funcionario cadastrado com sucesso";
                    break;
                case 2:
                    mensagem = "Este Funcionario ja está cadastrado";
                    break;
                default:
                    mensagem = "Entre em contato com o administrador";
                    break;
            }
            request.setAttribute("m", mensagem);
            disp = request.getRequestDispatcher("MensagensDeErro.jsp");

        } else if (flag.equalsIgnoreCase("ListarFuncionario")) { // Ele busca todos os funcionarios cadastrados;
           
            List<Funcionario> funcionario = dao.listarFuncionarios();
            request.setAttribute("listarFuncionario", funcionario);
            disp = request.getRequestDispatcher("ListarFuncionarios.jsp");
            
        }else if(flag.equals("ExcluirFuncionario")){
            
            String email;
            resp = dao.excluirFuncionario(email = request.getParameter("emailFunc"));
            switch (resp) {
                case 1:
                    mensagem = "Funcionario excluido com sucesso";
                    break;
                case 2:
                    mensagem = "Este Funcionario não existe";
                    break;
                default:
                    mensagem = "Entre em contato com o administrador";
                    break;
            }
            request.setAttribute("m", mensagem);
            disp = request.getRequestDispatcher("MensagensDeErro.jsp"); 
        }
        disp.forward(request, response);
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
