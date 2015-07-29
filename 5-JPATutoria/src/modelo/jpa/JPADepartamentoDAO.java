package modelo.jpa;

import java.util.List;

import modelo.dao.DepartamentoDAO;
import modelo.entity.Departamento;
import modelo.entity.Profesor;

public class JPADepartamentoDAO extends JPAGenericDAO<Departamento, Integer>
		implements DepartamentoDAO {

	public JPADepartamentoDAO() {
		super(Departamento.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Profesor> getProfesorByDepartamento(int idDepartamento) {
		// TODO Auto-generated method stub
		return null;
	}
}
