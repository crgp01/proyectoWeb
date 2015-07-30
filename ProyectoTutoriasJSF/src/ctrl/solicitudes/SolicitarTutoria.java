package ctrl.solicitudes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.entity.Estudiante;
import modelo.entity.Profesor;
import modelo.entity.Tutoria;
import modelo.jpa.JPADAOFactory;

@ManagedBean (name="SolicitarTutoriaBean")
@SessionScoped
public class SolicitarTutoria {
	
	private Profesor profesor;
	private List<Profesor> profesores = new ArrayList<Profesor>();
	private Tutoria tutoria;
	private Estudiante estudiante1;
	
	
	
	
	public Estudiante getEstudiante1() {
		obtenerEstudiante();
		return estudiante1;
	}



	public void setEstudiante1(Estudiante estudiante1) {
		this.estudiante1 = estudiante1;
	}



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
		tutoria.setProfesor(this.profesor);
		tutoria.setEstudiate(this.estudiante1);
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
	public void obtenerEstudiante(){
		setEstudiante1(JPADAOFactory.getFactory().getEstudianteDAO().getEstudiantesByNombre("Pedro"));
		
	}
}

