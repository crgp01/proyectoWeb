package ctrl.solicitudes;

import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.entity.Tutoria;
import modelo.jpa.JPADAOFactory;

@ManagedBean
@SessionScoped
public class SolicitarTutoria {
	private Tutoria tutoria;
	private Date time3;
	
	public SolicitarTutoria()
	{
		
	}
	public Tutoria getTutoria() {
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
	
}

