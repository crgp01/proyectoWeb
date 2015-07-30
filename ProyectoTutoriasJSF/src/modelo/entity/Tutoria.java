package modelo.entity;


import java.io.Serializable;
import java.util.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Tutoria")
@NamedQueries({ @NamedQuery(name = "ListarSolicitudes", query = "SELECT t FROM Tutoria t WHERE t.profesor.id = :idprofesor") })
public class Tutoria implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tut_codigo")
	private Integer id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cod_profesor")
	private Profesor profesor;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cod_estudiante")
	private Estudiante estudiante;
	@Temporal(TemporalType.DATE)
	@Column(name="tut_fecha")
	private Date fecha;
	@Column(name="tut_horaInicio")
	private String horaInicio;
	@Column(name="tut_horaFin")
	private String horaFin;
	@Column(name="tut_tematica")
	private String tematica;


	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}


	
	public Tutoria(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Estudiante getEstudiate() {
		return estudiante;
	}

	public void setEstudiate(Estudiante estudiate) {
		this.estudiante = estudiate;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	
	
}
