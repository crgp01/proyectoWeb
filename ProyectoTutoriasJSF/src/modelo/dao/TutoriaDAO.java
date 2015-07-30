package modelo.dao;

import java.util.List;

import modelo.entity.Tutoria;

public interface TutoriaDAO extends GenericDAO<Tutoria, Integer> {

	List<Tutoria> BuscarporProfesor (String profesor);
}
