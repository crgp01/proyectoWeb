package modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import modelo.dao.TutoriaDAO;
import modelo.entity.Tutoria;
import modelo.entity.Usuario;

public class JPATutoriaDAO extends JPAGenericDAO<Tutoria, Integer>
		implements TutoriaDAO {

	public JPATutoriaDAO() {
		super(Tutoria.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Tutoria> BuscarporProfesor(String profesor) {
		
		Query q = em.createQuery("SELECT t.fecha, t.horaInicio, t.horaFin  FROM Tutoria t WHERE t.profesor = :profesor");
		q.setParameter("profe", profesor);
		
		/*
		Query q = em.createNamedQuery("BuscarUsuarioClave");
		*/
		System.out.println(q.toString());
		

		List<Tutoria> user = (List<Tutoria>)q.getResultList();
		return user;
		
	}
	
	
}
