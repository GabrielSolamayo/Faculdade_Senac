
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Departamento</title>
    </head>
    <body>
        <form method="post" action="Controle">//Mandando pra ServLest 'Controle'
            <input type="hidden" name="flag" value="AlterarDepartamento">
            <p>
                <label for="idDep">Código</label>
                <input type="text" name="idDep" id="idDep" value="<%= request.getParameter("idDep") %>" readonly>
            </p>
            <p>
                <label for="nomeDep">Nome</label>
                <input type="text" name="nomeDep" id="nomeDep" value="<%= request.getParameter("nomeDep") %>">
            </p>
            <p>
                <label for="foneDep">Telefone</label>
                <input type="text" name="foneDep" id="foneDep" value="<%= request.getParameter("foneDep") %>">
            </p>
            <p>
                <input type="submit" value="Salvar Alteração">
            </p>
        </form>
    </body>
</html>
