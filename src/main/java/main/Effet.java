/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author agath
 */
public interface Effet {
  
    public void activate();
    public void fin();
    public void setDuree(int d);
    public void setMessage(String s);
}
