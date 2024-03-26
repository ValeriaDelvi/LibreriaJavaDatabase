package it.engim.primoprogetto.model;
import jakarta.persistence.*;

@Entity
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    @ManyToOne @JoinColumn(name="id_libro")
    private Libro libro;
    @ManyToOne @JoinColumn(name="id_utente")
    private Utente utente;
}
