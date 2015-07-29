package ejecucion;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.entity.Departamento;

public class Principal {
	
	public static void main(String[] args){
		
		EntityManagerFactory emf;
		EntityManager em;
		emf = Persistence.createEntityManagerFactory("ProyectoTutoriasJSF");
		em = emf.createEntityManager();
		
		Departamento dep = new Departamento();
		dep.setNombre("Ingenieria de Sistemas");
		em.getTransaction().begin();
		em.persist(dep);
		em.getTransaction().commit();
	}
	

}
