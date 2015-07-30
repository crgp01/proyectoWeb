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
		Query q = em.createQuery("SELECT t FROM Tutoria t WHERE t.profesor.id = :idprofesor");
		q.setParameter("idprofesor", profesor);
		
		/*
		Query q = em.createNamedQuery("BuscarUsuarioClave");
		*/
		System.out.println(q.toString());
		

		Tutoria tutoria = (Tutoria) q.getResultList();
		return (List<Tutoria>) tutoria;
		
	}
}
