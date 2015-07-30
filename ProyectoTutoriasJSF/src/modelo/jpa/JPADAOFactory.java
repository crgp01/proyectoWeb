 package modelo.jpa;

import modelo.dao.AdministradorDAO;
import modelo.dao.DAOFactory;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EstudianteDAO;
import modelo.dao.ProfesorDAO;
import modelo.dao.TutoriaDAO;
import modelo.dao.UsuarioDAO;


public class JPADAOFactory extends DAOFactory {

	@Override
	public EstudianteDAO getEstudianteDAO() {
		return new JPAEstudianteDAO();
	}

	@Override
	public AdministradorDAO getAdministradorDAO() {
		// TODO Auto-generated method stub
		return new JPAAdministradorDAO();
	}

	@Override
	public TutoriaDAO getTutoriaDAO() {
		// TODO Auto-generated method stub
		return new JPATutoriaDAO();
	}

	@Override
	public DepartamentoDAO getDepartamentoDAO() {
		// TODO Auto-generated method stub
		return new JPADepartamentoDAO();
	}

	@Override
	public ProfesorDAO getProfesorDAO() {
		// TODO Auto-generated method stub
		return new JPAProfesorDAO();
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new JPAUsuarioDAO();
	}


}
