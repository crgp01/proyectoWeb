package modelo.jpa;

import modelo.dao.UsuarioDAO;
import modelo.entity.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer>
		implements UsuarioDAO {

	public JPAUsuarioDAO() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}
}
