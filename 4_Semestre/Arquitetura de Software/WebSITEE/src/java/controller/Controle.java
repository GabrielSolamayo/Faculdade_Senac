/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Acesso;
import model.Departamento;
import model.EmpresaDao;

/**
 *
 * @author gabriel.esmunoz
 */
@WebServlet(name = "Controle", urlPatterns = {"/Controle"})
public class Controle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String flag, mensagem;
        PrintWriter out = response.getWriter();
        flag = request.getParameter("flag");
        if (flag.equals("login")) {
            String user, password;
            user = request.getParameter("usuario");
            password = request.getParameter("senha");
            EmpresaDao dao = new EmpresaDao();
            Acesso acesso = dao.validarLogin(user, password);
            if (acesso == null) {
                request.setAttribute("m", "Usuário não encontrado seu PATIFE >:C");
                RequestDispatcher disp = request.getRequestDispatcher("MensagensDeErro.jsp");
                disp.forward(request, response);
            } else {
                String nome, cargo;
                nome = acesso.getFuncionario().getNomeFunc();
                cargo = acesso.getFuncionario().getCargoFunc();
                mensagem = "Bem Vindo, " + nome + " | Cargo: " + cargo;
                request.setAttribute("mens", mensagem);
                if (cargo.equalsIgnoreCase("Gerente")) {
                    RequestDispatcher disp = request.getRequestDispatcher("AcessoGerente.jsp");
                    disp.forward(request, response);
                } else if (cargo.equalsIgnoreCase("Professor")) {
                    RequestDispatcher disp = request.getRequestDispatcher("AcessoProfessor.jsp");
                    disp.forward(request, response);
                } else {
                    RequestDispatcher disp = request.getRequestDispatcher("AcessoOutro.jsp");
                    disp.forward(request, response);
                }

            }
        } else if (flag.equalsIgnoreCase("CadastroDepartamento")) {

            Departamento dep = new Departamento();
            dep.setIdDep(request.getParameter("IDdepartamento"));
            dep.setNomeDep(request.getParameter("nomeDepartamento"));
            dep.setFoneDep(request.getParameter("telefoneDepartamento"));

            int resp = new EmpresaDao().salvarDepartamento(dep);

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
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
