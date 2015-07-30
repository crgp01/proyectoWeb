package modelo.jpa;

import modelo.dao.TutoriaDAO;
import modelo.entity.Tutoria;

public class JPATutoriaDAO extends JPAGenericDAO<Tutoria, Integer>
		implements TutoriaDAO {

	public JPATutoriaDAO() {
		super(Tutoria.class);
		// TODO Auto-generated constructor stub
	}
}
