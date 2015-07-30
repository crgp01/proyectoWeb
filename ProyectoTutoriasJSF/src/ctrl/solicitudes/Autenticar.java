package ctrl.solicitudes;

import javax.faces.bean.ManagedBean;

import modelo.dao.DAOFactory;
import modelo.dao.UsuarioDAO;
import modelo.entity.Usuario;

@ManagedBean
public class Autenticar {
	public String menu = "menu.jsp";
	private DAOFactory daoFactory;
	private UsuarioDAO usuarioDAO;
	private Usuario user;
	private String username;
	private String password;

	public Autenticar() {
		daoFactory = DAOFactory.getFactory();
		usuarioDAO = daoFactory.getUsuarioDAO();
	}

	public String login() {
		user = usuarioDAO.buscarPorUsuarioClave(username, password);
		if (user != null) {
			System.out.println("Llega al controlador: " + username + " : "
					+ password);
			return menu;
		}
		return null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
