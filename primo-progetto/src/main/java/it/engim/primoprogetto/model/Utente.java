package it.engim.primoprogetto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utente {

    private String nome;
    private String cognome;
    private String user;
    private String mail;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getUser() {
        return user;
    }

    public String getMail() {
        return mail;
    }
}
