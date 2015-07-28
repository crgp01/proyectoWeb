package ec.edu.epn.modelo.contralador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ec.edu.epn.modelo.dao.DAOFactory;
import ec.edu.epn.modelo.entity.Estudiante;

@ManagedBean
@SessionScoped
public class EstudianteControlador {

	private DAOFactory daoFactory;
	private ProfesorDAO profesorDAO;
	private EstudianteDAO estudianteDAO;
	private TutoriaDAO tutoriaDAO;
	private List<Tutoria> tutorias;

}
