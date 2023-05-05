<%-- 
    Document   : ListarAlunos
    Created on : 5 de mai. de 2023, 09:51:30
    Author     : gabriel.esmunoz
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Alunos</title>
    </head>
    <body>
        <%
            List<Aluno> listaAlunos = (List<Aluno>)request.getAttribute("listarAlunos");
        %>
        <table>
            <tr>
                <th>Matrícula</th>
                <th>Nome</th>
                <th>Disciplina</th>
                <th>Quantidade de Aulas</th>
                <th>Média</th>
            </tr>
            <%
                for(Aluno alunos : listaAlunos){
            %>
            <tr>
                <td><%= alunos.getMatricula() %></td>//<%--tag usada para exibir (<%= %> --%>
                <td><%= alunos.getNome() %></td>
                <td><%= alunos.getDisciplina()%></td>
                <td><%= alunos.getQuantidadeAula()%></td>
                <td><%= alunos.getMediaFinal() %></td>
                <td><a href="Controle?flag=ExcluirAlunos&matricula=<%= alunos.getMatricula()%>">Excluir</a></td>
                <td><a href="AlterarAluno.jsp?matricula=<%= alunos.getMatricula()%>&nome=<%= alunos.getNome()%>&disciplina=<%= alunos.getDisciplina()%>&quantAula=<%= alunos.getQuantidadeAula()%>&mediaF=<%= alunos.getQuantidadeAula()%>">Alterar</a></td>
            </tr>
            <%
            }
            %>
        </table>
        
        
    </body>
</html>
