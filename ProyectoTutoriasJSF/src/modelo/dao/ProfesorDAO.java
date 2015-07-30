package modelo.dao;

import java.util.List;

import modelo.entity.Profesor;

public interface ProfesorDAO extends GenericDAO<Profesor, Integer> {
	
	public List<Profesor> getProfesorByDepartamento(int idDepartamento);

}
