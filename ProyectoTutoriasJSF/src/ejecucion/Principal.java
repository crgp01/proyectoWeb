package ejecucion;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.entity.Departamento;
import modelo.entity.Estudiante;
import modelo.entity.Profesor;
import modelo.entity.Usuario;
import modelo.jpa.JPADAOFactory;

public class Principal {
	
	public static void main(String[] args){
		
		/*
		EntityManagerFactory emf;
		EntityManager em;
		emf = Persistence.createEntityManagerFactory("ProyectoTutoriasJSF");
		em = emf.createEntityManager();
		
		Departamento dep = new Departamento();
		dep.setNombre("Ingenieria de Sistemas");
		em.getTransaction().begin();
		em.persist(dep);
		em.getTransaction().commit();
		
		*/
		Estudiante e = new Estudiante();
		e.setApellido("jacome");
		e.setClave("admin");
		e.setCorreo("carlos@gmail.com");
		e.setNombre("Pedro" );
		e.setUsername("admin");
		
		
		JPADAOFactory.getFactory().getEstudianteDAO().create(e);
		
		
		Departamento d = new Departamento();
		d.setNombre("Ingenieria en Sistemas");
		JPADAOFactory.getFactory().getDepartamentoDAO().create(d);
		
		Profesor p = new Profesor();
		p.setApellido("Hernandez1");
		p.setClave("admin2");
		p.setCorreo("profesor@gmail.com");
		p.setDepartamento(d);
		p.setNombre("Luis");
		p.setUsername("admin2");
		
		JPADAOFactory.getFactory().getProfesorDAO().create(p);
		
		/*
		Usuario u = JPADAOFactory.getFactory().getUsuarioDAO().buscarPorUsuarioClave("admin", "admin");
		System.out.println(u);*/
	}
	

}
