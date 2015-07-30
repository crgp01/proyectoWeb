package modelo.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Profesor")
public class Profesor extends Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pro_codigo")
	private Integer id;
	
	@Column(name="pro_correo")
	private String correo;
	
	@OneToMany(mappedBy="profesor")
	private List<Tutoria> tutorias;
	@ManyToOne(fetch=FetchType.LAZY)
	
	@JoinColumn(name="dep_codigo")
	private Departamento departamento;
	
	public List<Tutoria> getTutorias() {
		return tutorias;
	}
	public void setTutorias(List<Tutoria> tutorias) {
		this.tutorias = tutorias;
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
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}
