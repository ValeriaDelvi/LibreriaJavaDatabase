package it.engim.primoprogetto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Primary;

@Entity
//così diciamo che vogliamo questa classe nel database!
public class Libro {
//variabili
    private String titolo;
    private String autore;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int anno;
//costruttore
  /*  public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }
    public Libro(String titolo) {
        this.titolo = titolo;
        this.autore = autore;
    }
*/
    //get e setter

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
}//end Libro
