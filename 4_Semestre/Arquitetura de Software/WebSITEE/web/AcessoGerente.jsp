<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Teste</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="conf.css">
        <link rel="stylesheet" type="text/css" href="menu.css">
    </head>
    <body>
        <!–Azul–>
        <header> 
            <h1>SENAC</h1>
            <p style="margin-right: 1vw">${mens}</p>
        </header>

        <!– Amarelo  –>
        <nav>
            <div class="topnav" id="myTopnav">
                <a href="#home" class="active">Home</a>
                <a href="#contact">Contatos</a>
                <div class="dropdown">
                    <button class="dropbtn">Departamento 
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="CadastroDepartamento.html" target="conteudo">Incluir</a>
                        <a href="BuscarDepartamento.html" target="conteudo">Alterar</a>
                        <a href="ExcluirDepartamento.html" target="conteudo">Excluir</a>
                        <a href="ConsultarDepartamento.html" target="conteudo">Consultar</a>
                        <a href="Controle?flag=ListarDepartamento" target="conteudo">Listar</a>
                    </div>
                </div> 
                <div class="dropdown">
                    <button class="dropbtn">Funcionário 
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="ControleFuncionario?flag=BuscarDepartamento" target="conteudo">Incluir</a>
                        <a href="AlterarFuncionário.html" target="conteudo">Alterar</a>
                        <a href="ExcluirFuncionário.html" target="conteudo">Excluir</a>
                        <a href="ConsultarFuncionário.html" target="conteudo">Consultar</a>
                        <a href="ListarFuncionário.html" target="conteudo">Listar</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Acesso 
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="CadastroAcesso.html" target="conteudo">Incluir</a>
                        <a href="AlterarAcesso.html" target="conteudo">Alterar</a>
                        <a href="ExcluirAcesso.html" target="conteudo">Excluir</a>
                        <a href="ConsultarAcesso.html" target="conteudo">Consultar</a>
                        <a href="ListarAcesso.html" target="conteudo">Listar</a>
                    </div>
                </div>  
                <a href="javascript:void(0);" style="font-size:15px;" class="icon" onclick="myFunction()">&#9776;</a>
            </div>
        </nav>

        <!– Vermelho –>
        <main>
            <iframe src="abertura.html" name="conteudo"></iframe>
        </main>

        <!– Verde –>
        <footer>

        </footer>

        <script src="menu.js"></script>
    </body>
</html>
