package modelo.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Estudiante")
public class Estudiante extends Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="est_codigo")
	private Integer id;
	
	@Column(name="est_correo")
	private String correo;
	
	@OneToMany(mappedBy="estudiante")
	private List <Tutoria> tutorias;
	
	public Estudiante() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public List<Tutoria> getTutorias() {
		return tutorias;
	}
	public void setTutorias(List<Tutoria> tutorias) {
		this.tutorias = tutorias;
	}

	
	
	
	
}
