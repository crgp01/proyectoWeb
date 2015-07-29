package modelo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQueries({ @NamedQuery(name = "BuscarUsuarioClave", query = "SELECT u FROM Usuario u WHERE u.username = :username AND u.clave = :clave") })
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_codigo")
	private Integer id;
	@Column(name = "usu_nombre")
	private String nombre;
	@Column(name = "usu_apellido")
	private String apellido;
	@Column(name = "usu_username")
	private String username;
	@Column(name = "usu_clave")
	private String clave;
	public Usuario() {

	}
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
