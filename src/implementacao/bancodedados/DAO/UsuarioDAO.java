package implementacao.bancodedados.DAO;

import implementacao.bancodedados.conexao.Conexao;
import implementacao.bancodedados.entify.Usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void cadastrar(Usuario usuario) {

        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
