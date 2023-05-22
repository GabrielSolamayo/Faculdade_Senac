
<%@page import="model.entity.Funcionario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Funcionario</title>
    </head>
    <body>
        <%
            List<Funcionario> listaFuncionarios = (List<Funcionario>)request.getAttribute("listarFuncionario");
        %>
        <table>
            <tr>
                <th>Email</th>
                <th>Nome</th>
                <th>Cargo</th>
                <th>Salário</th>
                <th>Departamento</th>
            </tr>
            <%
                for(Funcionario funcionario : listaFuncionarios){
            %>
            <tr>
                <td><%= funcionario.getEmailFunc() %></td>//<%-- tag usada para exibir (<%= %>) --%>
                <td><%= funcionario.getNomeFunc() %></td>
                <td><%= funcionario.getCargoFunc() %></td>
                <td><%= funcionario.getSalarioFunc() %></td>
                <td><%= funcionario.getDepartamento().getNomeDep() %></td>
                <td><a href="ControleFuncionario?flag=ExcluirFuncionario&emailFunc=<%= funcionario.getEmailFunc() %>">Excluir</a></td>
                <td><a href="AlterarFuncionario.jsp?emailFunc=<%= funcionario.getEmailFunc() %>&nomeFunc=<%= funcionario.getNomeFunc() %>&cargoFunc=<%= funcionario.getCargoFunc() %>&salarioFunc=<%= funcionario.getSalarioFunc() %>&idDep=<%= funcionario.getDepartamento().getIdDep() %>&nomeDep=<%= funcionario.getDepartamento().getNomeDep() %>">Alterar</a></td>
            </tr>
            <%
            }
            %>
        </table>
    </body>
</html>
