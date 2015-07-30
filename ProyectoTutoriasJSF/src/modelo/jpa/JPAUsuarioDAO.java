package modelo.jpa;

import java.util.ArrayList;
import java.util.List;

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
	@SuppressWarnings("unchecked")
	public Usuario buscarPorUsuarioClave(String usuario, String clave) {

		Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.username = :username AND u.clave = :clave");
		q.setParameter("username", usuario);
		q.setParameter("clave", clave);
		/*
		Query q = em.createNamedQuery("BuscarUsuarioClave");
		*/
		System.out.println(q.toString());
		

		Usuario user = (Usuario)q.getSingleResult();
		return user;
	}

}
