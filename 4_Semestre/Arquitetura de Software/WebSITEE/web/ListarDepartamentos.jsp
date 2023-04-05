<%-- 
    Document   : ListarDepartamento
    Created on : 31 de mar. de 2023, 10:26:53
    Author     : gabriel.esmunoz
--%>

<%@page import="java.util.List"%>
<%@page import="model.Departamento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Departamentos</title>
    </head>
    <body>
        <%-- 
            Tag usada para usar codigo java no HTML;
        --%>
        <%
            List<Departamento> listaDepartamentos = (List<Departamento>)request.getAttribute("listarDepartamentos");
        %>
        <table>
            <tr>
                <th>Código</th>
                <th>Nome</th>
                <th>Telefone</th>
            </tr>
            <%
                for(Departamento departamento : listaDepartamentos){
            %>
            <tr>
                <td><%= departamento.getIdDep() %></td>//<%--tag usada para exibir (<%= %> --%>
                <td><%= departamento.getNomeDep() %></td>
                <td><%= departamento.getFoneDep() %></td>
            </tr>
            <%
            }
            %>
        </table>
    </body>
</html>