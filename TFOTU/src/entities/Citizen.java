/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import citystate.Allegience;
import util.RegisteredEntity;

/**
 *
 * @author Kosmic
 */
public class Citizen extends RegisteredEntity{

    private int gender; //0 undef, 1 male, 2 female
    private Allegience alle;
    
    public Citizen(int gender, Allegience al){
        
        this.gender = gender;
        alle = al;
    }
    
    @Override
    protected void createInner() {

        
    }
}
