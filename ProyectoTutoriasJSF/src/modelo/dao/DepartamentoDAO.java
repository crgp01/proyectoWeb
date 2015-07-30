package modelo.dao;

import java.util.List;

import modelo.entity.Departamento;
import modelo.entity.Profesor;

public interface DepartamentoDAO extends GenericDAO<Departamento, Integer> {
	
	public List<Profesor> getProfesorByDepartamento(int idDepartamento);

}
