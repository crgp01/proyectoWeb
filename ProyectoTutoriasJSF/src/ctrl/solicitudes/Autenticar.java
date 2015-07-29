package ctrl.solicitudes;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.dao.DAOFactory;
import modelo.dao.UsuarioDAO;
import modelo.entity.Usuario;
import modelo.jpa.JPADAOFactory;

@ManagedBean
public class Autenticar {
	DAOFactory daoFactory;
	UsuarioDAO usuarioDAO;
	Usuario user;
	private String username;
	private String password;
	public Autenticar() {
		daoFactory=DAOFactory.getFactory();
		usuarioDAO=daoFactory.getUsuarioDAO();
	}
	public String login() {
		usuarioDAO.buscarPorUsuarioClave(username, password);
		return null;
	}
}
