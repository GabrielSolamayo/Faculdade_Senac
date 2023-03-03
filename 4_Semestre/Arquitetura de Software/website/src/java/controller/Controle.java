
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Acesso;
import model.EmpresaDao;


@WebServlet(name = "Controle", urlPatterns = {"/Controle"})
public class Controle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String flag;
        PrintWriter out = response.getWriter();
        flag = request.getParameter("flag");
        if(flag.equals("login")){
            String user, password;
            user = request.getParameter("usuario");
            password = request.getParameter("senha");
            EmpresaDao dao = new EmpresaDao();
            Acesso acesso = dao.validarLogin(user, password);
            if(acesso == null){
                out.print("Não Encontrado seu Patife!");
            }else{
                out.print("Encontrado ^w^");
            }
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
    }

}
