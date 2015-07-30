package ctrl.solicitudes;

import java.util.List;





import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.dao.DAOFactory;
import modelo.dao.TutoriaDAO;
import modelo.dao.UsuarioDAO;
import modelo.entity.Tutoria;
import modelo.entity.Usuario;
import modelo.jpa.JPADAOFactory;

@ManagedBean
@SessionScoped
public class ListarSolicitudes {
	private List<Tutoria> tutoriasList;
	private DAOFactory daoFactory;
	private TutoriaDAO tutoriaDAO;
	private Tutoria tutor;
	private String profesor;
	//Constructor
	public ListarSolicitudes(){
	}
	//Propiedades
	public List<Tutoria> getTutoriasList() {
		tutor = (Tutoria) tutoriaDAO.BuscarporProfesor(profesor);
	//En caso de que la lista no exista
		if(tutoriasList==null){
			tutoriasList = JPADAOFactory.getFactory().getTutoriaDAO().find();	
		}
		return tutoriasList;
	}
	

	public void setTutoriasList(List<Tutoria> tutoriasList) {
		this.tutoriasList = tutoriasList;
	}
	
	
}
