/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import citystate.Allegience;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public class Citizen extends Owner{

    protected int gender; //0 undef, 1 male, 2 female
    
    public Citizen(Vec2 pos, int gender, Allegience alle){
        
        super(pos, 100, alle);
        this.gender = gender;
    }

    public int getGender() {
        
        return gender;
    }

    public void setAlle(Allegience alle) {
        
        this.alle = alle;
    }
    
    @Override
    public void destroy() {

        
    }
}
