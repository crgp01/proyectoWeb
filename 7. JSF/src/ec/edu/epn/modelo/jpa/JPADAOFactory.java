 package ec.edu.epn.modelo.jpa;

import ec.edu.epn.modelo.dao.DAOFactory;
import ec.edu.epn.modelo.dao.EstudianteDAO;


public class JPADAOFactory extends DAOFactory {

	@Override
	public EstudianteDAO getEstudianteDAO() {
		return new JPAEstudianteDAO();
	}


}
