package modelo.jpa;

import modelo.dao.AdministradorDAO;
import modelo.entity.Administrador;

public class JPAAdministradorDAO extends JPAGenericDAO<Administrador, Integer>
		implements AdministradorDAO {

	public JPAAdministradorDAO() {
		super(Administrador.class);
		// TODO Auto-generated constructor stub
	}
}
