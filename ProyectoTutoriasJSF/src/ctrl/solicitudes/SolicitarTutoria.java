package ctrl.solicitudes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.entity.Profesor;
import modelo.entity.Tutoria;
import modelo.jpa.JPADAOFactory;

@ManagedBean (name="SolicitarTutoriaBean")
@SessionScoped
public class SolicitarTutoria {
	
	private Profesor profesor;
	private List<Profesor> profesores = new ArrayList<Profesor>();
	private Tutoria tutoria;
	
	
	public SolicitarTutoria()
	{
		
	}
	
	
	
	public Profesor getProfesor() {
		if(this.profesor==null){
			return this.profesor=new Profesor();
		}else
		return profesor;
	}



	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}



	public List<Profesor> getProfesores() {
		ListarProfesores();
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}

	public Tutoria getTutoria() {
		if(this.tutoria==null){
			return this.tutoria=new Tutoria();
		}else
		return tutoria;
	}
	public void setTutoria(Tutoria tutoria) {
		this.tutoria = tutoria;
	}
	public String guardar()
	{
		JPADAOFactory.getFactory().getTutoriaDAO().create(this.tutoria);
		return "solicitartutoria.xhtml";
		
	}
	public String cancelar()
	{
		return "login.xhtml";
		
	}
	
	public void ListarProfesores(){
		setProfesores(JPADAOFactory.getFactory().getProfesorDAO().find());
	}
	
}

