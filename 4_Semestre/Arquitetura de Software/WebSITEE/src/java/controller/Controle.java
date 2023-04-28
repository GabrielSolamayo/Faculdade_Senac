/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
            
        }else if(flag.equalsIgnoreCase("ListarDepartamento")){
            
            List<Departamento> departamentos = new EmpresaDao().listarDepartamentos(); //Instancia logo de uma vez, ao inves de criar uma variavel "atoa";
            request.setAttribute("listarDepartamentos", departamentos);
            RequestDispatcher disp = request.getRequestDispatcher("ListarDepartamentos.jsp");
            disp.forward(request, response);
            
        }else if(flag.equalsIgnoreCase("ConsultarDepartamento")){
            
            String nomeDep = request.getParameter("nomeDepartamento");//O valor do parametro é o 'name' do input do 'ConsultarDepartamento.html';
            EmpresaDao dao = new EmpresaDao();//Instancia um objeto da classe EmpresaDao para acessar os métodos desta classe;
            List<Departamento> departamentos = dao.consultarDepartamentos(nomeDep);//Chama o método consultarDepartamento passando o nome do departamento e recebe a lista evolvida pelo método;
           
            //Enviar a lista de Departamentos para o arquivo ListarDepartamentos.jsp;
            request.setAttribute("listarDepartamentos", departamentos);
            RequestDispatcher disp = request.getRequestDispatcher("ListarDepartamentos.jsp");
            disp.forward(request, response);
            
        }else if(flag.equalsIgnoreCase("ExcluirDepartamento")){
            
            String idDep = request.getParameter("idDep");
            EmpresaDao dao = new EmpresaDao();
            int resultado = dao.excluirDepartamento(idDep);
            if(resultado == 1){
                mensagem = "Departamento excluído com sucesso";
            }else if(resultado == 2){
                mensagem = "Departamento '"+idDep+"' nao existe";
            }else{
                mensagem = "Erro ao tentar excluir o departamento";
            }
            request.setAttribute("m", mensagem);
            RequestDispatcher disp = request.getRequestDispatcher("MensagensDeErro.jsp");
            disp.forward(request, response);
            
            
        }else if(flag.equalsIgnoreCase("AlterarDepartamento")){//Altera o departamento, referente a listagem de depatamento;
            
            String idDep = request.getParameter("idDep");
            String nomeDep = request.getParameter("nomeDep");
            String foneDep = request.getParameter("foneDep");
            
            EmpresaDao dao = new EmpresaDao();
            int resultado = dao.alterarDepartamento(idDep, nomeDep, foneDep);
            if(resultado == 1){
                mensagem = "Dados do departamento alterados com sucesso";
            }else{
                mensagem = "Erro ao tentar alterar dados do departamento";
            }
            request.setAttribute("m", mensagem);
            RequestDispatcher disp = request.getRequestDispatcher("MensagensDeErro.jsp");
            disp.forward(request, response);
            
        }else if(flag.equalsIgnoreCase("BuscarDepartamento")){ //Busaca o departamento pelo ID para alterar;
            
            String idDep = request.getParameter("idDep");
            EmpresaDao dao = new EmpresaDao();
            Departamento dep = dao.buscarDepartamento(idDep);
            if(dep == null){
                request.setAttribute("m", "Departamento não encontrado, seu P A T I F E");
                RequestDispatcher disp = request.getRequestDispatcher("MensagensDeErro.jsp");
                disp.forward(request, response);
            }else{
                request.setAttribute("dep", dep);
                RequestDispatcher disp = request.getRequestDispatcher("AlterarDepartamentoPeloID.jsp");
                disp.forward(request, response);
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
    }// </editor-fold>

}
