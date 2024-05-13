package implementacao.bancodedados;

import implementacao.bancodedados.DAO.UsuarioDAO;
import implementacao.bancodedados.entity.Usuario;
import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) throws Exception {

        Usuario u = new Usuario();
        u.setNome("Kiko");
        u.setLogin("kiko");
        u.setSenha("tesouro");
        u.setEmail("kiko@gmail.com");

        new UsuarioDAO().cadastrar(u);
        System.out.println(StringUtils.capitalize("conta criada com sucesso!"));

    }

}
