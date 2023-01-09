package com.example.recicleview2;

public class Persona {
    private String nome,cognome;
    private int icona;

    public Persona(String nome, String cognome, int icona) {
        this.nome = nome;
        this.cognome = cognome;
        this.icona = icona;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getIcona() {
        return icona;
    }

    public void setIcona(int icona) {
        this.icona = icona;
    }
}
