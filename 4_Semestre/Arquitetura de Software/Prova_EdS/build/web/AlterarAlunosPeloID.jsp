<%-- 
    Document   : AlterarAlunosPeloID
    Created on : 5 de mai. de 2023, 10:49:16
    Author     : gabriel.esmunoz
--%>

<%@page import="Model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Aluno aluno = (Aluno) request.getAttribute("aluno");//Fazendo um Cast para Departamento, pois o 'getAttribute' só recebe tipo Object generico;
        %>
        
        <form method="post" action="Controle">//Mandando pra ServLest 'Controle'
            <input type="hidden" name="flag" value="AlterarAlunos">
            <p>
                <label for="matricula">Matricula</label>
                <input type="number" name="matricula" id="matricula" value="<%= aluno.getMatricula() %>" readonly>
            </p>
            <p>
                <label for="nome">Nome</label>
                <input type="text" name="nome" id="nome" value="<%= aluno.getNome() %>">
            </p>
            <p>
                <label for="disciplina">Disciplina</label>
                <input type="text" name="disciplina" id="disciplina" value="<%= aluno.getDisciplina() %>">
            </p>
            <p>
                <label for="quantAula">Quantidade de Aula</label>
                <input type="number" name="quantAula" id="quantAula" value="<%= aluno.getQuantidadeAula() %>">
            </p>
            <p>
                <label for="mediaF">Média</label>
                <input type="number" name="mediaF" id="mediaF" value="<%= aluno.getMediaFinal() %>">
            </p>
            <p>
                <input type="submit" value="Salvar Alteração">
            </p>
        </form>
    </body>
</html>
