package modelo.dao;

import modelo.entity.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer> {
	Usuario buscarPorUsuarioClave(String usuario, String clave);

}
