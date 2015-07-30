package ctrl.solicitudes;

import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.entity.Tutoria;
import modelo.jpa.JPADAOFactory;

@ManagedBean
@SessionScoped
public class ListarSolicitudes {
	private List<Tutoria> tutoriasList;
	//Constructor
	public ListarSolicitudes(){
	}
	//Propiedades
	public List<Tutoria> getTutoriasList() {
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
