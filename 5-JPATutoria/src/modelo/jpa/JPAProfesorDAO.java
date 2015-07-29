package modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import modelo.dao.ProfesorDAO;
import modelo.entity.Profesor;

public class JPAProfesorDAO extends JPAGenericDAO<Profesor, Integer>
		implements ProfesorDAO {

	public JPAProfesorDAO() {
		super(Profesor.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	public List<Profesor> getProfesorByDepartamento(int idDepartamento) {
		Query query = this.em.createQuery("SELECT d.profesor FROM Departamento d WHERE d.id LIKE idDep");
		query.setParameter("idDep", idDepartamento);
        @SuppressWarnings("unchecked")
        List<Profesor> resultado = query.getResultList();
        return resultado;
		
		// TODO Auto-generated method stub

	}
}
