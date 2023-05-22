/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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

/**
 *
 * @author gabriel.esmunoz
 */
@WebServlet(name = "ControleDepartamento", urlPatterns = {"/ControleDepartamento"})
public class ControleDepartamento extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String flag = request.getParameter("flag"), mensagem, idDep;
        EmpresaDao dao = new EmpresaDao();
        RequestDispatcher disp = null;
        int resultado;
        if (flag.equalsIgnoreCase("CadastroDepartamento")) {

            Departamento dep = new Departamento();
            dep.setIdDep(request.getParameter("IDdepartamento"));
            dep.setNomeDep(request.getParameter("nomeDepartamento"));
            dep.setFoneDep(request.getParameter("telefoneDepartamento"));
            resultado = dao.salvar(dep);
            switch (resultado) {
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
            disp = request.getRequestDispatcher("MensagensDeErro.jsp");

        } else if (flag.equalsIgnoreCase("ListarDepartamento")) {

            List<Departamento> departamentos = dao.listarDepartamentos(); //Instancia logo de uma vez, ao inves de criar uma variavel "atoa";
            request.setAttribute("listarDepartamentos", departamentos);
            disp = request.getRequestDispatcher("ListarDepartamentos.jsp");

        } else if (flag.equalsIgnoreCase("ConsultarDepartamento")) {

            String nomeDep;//O valor do parametro é o 'name' do input do 'ConsultarDepartamento.html';
            List<Departamento> departamentos;//Chama o método consultarDepartamentos passando o nome do departamento e recebe a lista evolvida pelo método;
            request.setAttribute("listarDepartamentos", departamentos = dao.consultarDepartamentos(nomeDep = request.getParameter("nomeDepartamento")));//Enviar a lista de Departamentos para o arquivo ListarDepartamentos.jsp;
            disp = request.getRequestDispatcher("ListarDepartamentos.jsp");

        } else if (flag.equalsIgnoreCase("ExcluirDepartamento")) {

            resultado = dao.excluirDepartamento(idDep = request.getParameter("idDep"));
            if (resultado == 1) {
                mensagem = "Departamento excluído com sucesso";
            } else if (resultado == 2) {
                mensagem = "Departamento '" + idDep + "' nao existe";
            } else {
                mensagem = "Erro ao tentar excluir o departamento";
            }
            request.setAttribute("m", mensagem);
            disp = request.getRequestDispatcher("MensagensDeErro.jsp");

        } else if (flag.equalsIgnoreCase("AlterarDepartamento")) {//Altera o departamento, referente a listagem de depatamento;

            String nomeDep, foneDep;
            resultado = dao.alterarDepartamento(idDep = request.getParameter("idDep"), nomeDep = request.getParameter("nomeDep"), foneDep = request.getParameter("foneDep"));
            if (resultado == 1) {
                mensagem = "Dados do departamento alterados com sucesso";
            } else {
                mensagem = "Erro ao tentar alterar dados do departamento";
            }
            request.setAttribute("m", mensagem);
            disp = request.getRequestDispatcher("MensagensDeErro.jsp");

        } else if (flag.equalsIgnoreCase("BuscarDepartamento")) { //Busaca o departamento pelo ID para alterar;

            Departamento dep = dao.buscarDepartamento(idDep = request.getParameter("idDep"));
            if (dep == null) {
                request.setAttribute("m", "Departamento não encontrado, seu P A T I F E");
                disp = request.getRequestDispatcher("MensagensDeErro.jsp");
            } else {
                request.setAttribute("dep", dep);
                disp = request.getRequestDispatcher("AlterarDepartamentoPeloID.jsp");
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
    }// </editor-fold>

}
