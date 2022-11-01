package Aula_4.Model.Bean;

import Aula_4.Model.DAO.acessarUsuario;
import Aula_4.Model.Enity.Usuario;

public class UserBean {

	public Usuario signInUsuario(String nome) {
        UsuarioDao user = new UsuarioDao();
        Usuario usuario = user.acessarUsario(nome);
        return usuario;
    }
}
