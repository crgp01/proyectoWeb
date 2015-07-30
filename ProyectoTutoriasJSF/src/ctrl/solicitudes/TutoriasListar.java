package ctrl.solicitudes;

import java.util.List;

import javax.annotation.ManagedBean;

import modelo.entity.Tutoria;
import modelo.jpa.JPADAOFactory;

@ManagedBean
public class TutoriasListar {
	private List<Tutoria> tutoriasList;
	//Constructor
	public TutoriasListar(){
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
	
	//Acciones
	public String ListarSolicitudes(){
		return null;
	}
	public String RechazarSolicitudes(){
		return null;
	}
	public String SolicitarTutorias(){
		return null;
	}
	public String AceptarTutorias(){
		return null;
	}



	
}
