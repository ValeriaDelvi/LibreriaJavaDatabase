package it.engim.primoprogetto.model.repository;

import it.engim.primoprogetto.model.Libro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibroRepository extends CrudRepository<Libro,Integer> {
    //creami l interfaccia che mi va a prendere database di Libro
    //deve prendere libri e l'integer  id della primary K
    List<Libro> findAll();
    //metodo che prende tutti i libri dal database e li restituisce nella list
    //ci ritroviamo con un array di libri quando richiamiamo la funzione
    //List<Libro> findByTitolo(String titolo);
}
