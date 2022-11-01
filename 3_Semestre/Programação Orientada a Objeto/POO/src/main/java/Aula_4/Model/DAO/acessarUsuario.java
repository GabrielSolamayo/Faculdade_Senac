package Aula_4.Model.DAO;

import Aula_4.Model.Enity.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class acessarUsuario {

public Usuario acessarUsario(String nomeUser) {
        
        ConectarDAO conDAO = new ConectarDAO();
        
        Connection conn = conDAO.FazerConexao();
        
        Usuario usuario = null;
        
        String sql = "SELECT * FROM user WHERE nomeuser = '" + nomeUser + "'";
        
        java.sql.Statement stmt = null;
        
        ResultSet resultSet = null;
        
        try {
            
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(sql);
            System.out.println("chamar sql");
            if (resultSet.next()) {
                
                int id = resultSet.getInt("idUser");
                
                String nomeUsuario = resultSet.getString("nomeUser");
                
                String senhaUser = resultSet.getString("senhaUser");
                usuario.setIdUser(usuario.getIdUser());
                usuario.setNomeUser(nomeUser);
                usuario.setSenhaUser(senhaUser);
            }
            
        } catch (SQLException e) {
            
            System.out.println("Erro na execução do Selelct " + sql + e);
            
        }
        
        System.out.println("Acesso OK");
        
        return usuario;
        
    }
}
