package Aula_4.Controller;


import Aula_4.Model.Bean.UserBean;
import Aula_4.Model.Enity.Usuario;
import Aula_4.View.InteracaoUsuario;



public class AppLoja {
	
	public static void main(String[] args) {

        InteracaoUsuario tela = new InteracaoUsuario();
        tela.boasVindas();

        String nomeUsuario = tela.entradaUsuario();
        System.out.println(nomeUsuario);

        UserBean user = new UserBean();
        Usuario usuarioOk = user.signInUsuario(nomeUsuario);

        if (usuarioOk != null) {
            System.out.println("Usuario existe."
                    + "");
        } else {
            System.out.println("Usuario não existe.");
        }

    }
}
