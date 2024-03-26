package it.engim.primoprogetto.controller;

import it.engim.primoprogetto.model.Libro;
import it.engim.primoprogetto.model.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrimoProgettoController {

    @Autowired
    LibroRepository libroRepository;
    //Autowired inizializza ovvero fa in automatico new Libro ecc

    //voglio l'elenco dei libri
    @GetMapping("/getLibri")
    public List<Libro> getLibri(){
        return libroRepository.findAll();
        //questo deve diventare una pagina web una rest API in json perchè abbiamo scritto RestController
        // @GetMapping("/getLibri")
    }

    @GetMapping("/addLibro")
    public String addLibro(@RequestParam(value="titolo") String titolo, @RequestParam(value="autore") String autore, @RequestParam(value="anno") int anno){
        //http://localhost:8081/addLibro?titolo="HP3"&autore="JKR"&anno=2005
        Libro libro= new Libro();
        libro.setAnno(anno);
        libro.setAutore(autore);
        libro.setTitolo(titolo);

        //.save viene preso dall' extends CrudRepository
        libroRepository.save(libro);
        return "OK";
    }
}
