package modelo.entity;


import java.io.Serializable;
import java.sql.Date;
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

@Entity
@Table(name="Tutoria")
//@NamedQueries({ @NamedQuery(name = "ListarSolicitudes", query = "SELECT t.fecha, t.horaInicio, t.horaFin  FROM Tutoria t, Estudiante e WHERE t.username = :username AND u.clave = :clave") })
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
	@Column(name="tut_fecha")
	private Date fecha;
	@Column(name="tut_horaInicio")
	private Time horaInicio;
	@Column(name="tut_horaFin")
	private Time horaFin;
	@Column(name="tut_tematica")
	private Time tematica;

	public Time getTematica() {
		return tematica;
	}

	public void setTematica(Time tematica) {
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

	public Time getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Time getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}
	
}
