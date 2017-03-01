package com.example.andreavalenziano.organisthelper.models;

/**
 * Created by AndreaValenziano on 01/03/17.
 */

public class Canto {

    private String title, categoria;

    public Canto() {
    }

    public Canto(String title, String categoria) {
        this.title = title;
        this.categoria = categoria;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
