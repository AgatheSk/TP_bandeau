/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bandeau.Bandeau;

/**
 *
 * @author agath
 */
public class EffetNormal implements Effet {

    private Bandeau band;
    private String message;
    private int duree;

    public EffetNormal(String msg) {
        this.message = msg;
        this.band = new Bandeau();
    }

    public EffetNormal(String msg, int d) {
        this.message = msg;
        this.band = new Bandeau();
        duree = d;
    }

    @Override
    public void activate() {
        band.setMessage(message);
    }

    @Override
    public void fin() {
        this.band.close();
    }

    @Override
    public void setDuree(int d) {
        this.duree = d;
    }

    @Override
    public void setMessage(String s) {
        this.message = s;
    }

}
