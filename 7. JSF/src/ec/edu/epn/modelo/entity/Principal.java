package ec.edu.epn.modelo.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {
	
	public static void main(String[] args){
		
		EntityManagerFactory emf;
		EntityManager em;
		emf = Persistence.createEntityManagerFactory("5-JPATUTORIAS");
		em = emf.createEntityManager();
		
		Departamento dep = new Departamento();
		dep.setNombre("Ingenieria de Sistemas");
		em.getTransaction().begin();
		em.persist(dep);
		em.getTransaction().commit();
	}
	

}
