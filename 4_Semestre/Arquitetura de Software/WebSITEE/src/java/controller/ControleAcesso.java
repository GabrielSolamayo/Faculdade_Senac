/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.entity.Acesso;
import model.dao.EmpresaDao;

/**
 *
 * @author gabriel.esmunoz
 */
@WebServlet(name = "ControleAcesso", urlPatterns = {"/ControleAcesso"})
public class ControleAcesso extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String flag = request.getParameter("flag"), mensagem;
        EmpresaDao dao = new EmpresaDao();
        RequestDispatcher disp = null;
        if (flag.equals("login")) {
            String user, password;
            Acesso acesso = dao.validarLogin(user = request.getParameter("usuario"), password = request.getParameter("senha"));
            if (acesso == null) {
                request.setAttribute("m", "Usuário não encontrado seu PATIFE >:C");
                disp = request.getRequestDispatcher("MensagensDeErro.jsp");
            } else {
                String cargo = acesso.getFuncionario().getCargoFunc(), nome;
                mensagem = "Bem Vindo, " + (nome = acesso.getFuncionario().getNomeFunc()) + " | Cargo: " + cargo;
                request.setAttribute("mens", mensagem);
                if (cargo.equalsIgnoreCase("Gerente")) {
                    disp = request.getRequestDispatcher("AcessoGerente.jsp");
                } else if (cargo.equalsIgnoreCase("Professor")) {
                    disp = request.getRequestDispatcher("AcessoProfessor.jsp");
                } else {
                    disp = request.getRequestDispatcher("AcessoOutro.jsp");
                }
            }            
        }
        disp.forward(request, response);
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
    }
}
