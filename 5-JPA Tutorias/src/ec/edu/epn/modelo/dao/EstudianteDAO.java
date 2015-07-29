package ec.edu.epn.modelo.dao;

import java.util.List;

import ec.edu.epn.modelo.entity.Estudiante;

public interface EstudianteDAO extends GenericDAO<Estudiante, Integer> {

	public List<Estudiante> getEstudiantesByDepartamento(int idDepartamento);
	public List<Estudiante> getEstudiantesByNombre(String nombre);
	public List<Estudiante>getEstudianteByNombre2(String nombre);
}
