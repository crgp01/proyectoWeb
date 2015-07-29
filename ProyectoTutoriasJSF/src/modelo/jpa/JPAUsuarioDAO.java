package modelo.jpa;

import javax.persistence.Query;

import modelo.dao.UsuarioDAO;
import modelo.entity.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements
		UsuarioDAO {

	public JPAUsuarioDAO() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Usuario buscarPorUsuarioClave(String usuario, String clave) {
		Query q = em.createNamedQuery("BuscarUsuarioClave");
		q.setParameter("username", usuario);
		q.setParameter("clave", clave);
		Usuario u = (Usuario) q.getSingleResult();
		return u;
	}
}
