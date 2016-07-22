/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import land.Allegience;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public class Citizen extends Owner{

    protected String firstName;
    protected String lastName;
    protected boolean gender; //false - male
    protected final List<Citizen> children;
    protected final List<Citizen> parents;
    //city that citizen is registered to
    
    public Citizen(String firstName, String lastName, Vec2 pos, boolean gender, Allegience alle){
        
        super(pos, 100, alle);
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        children = new ArrayList();
        parents = new ArrayList();
    }

    public String getFirstName() {
        
        return firstName;
    }

    public void setFirstName(String firstName) {
        
        this.firstName = firstName;
    }

    public String getLastName() {
        
        return lastName;
    }

    public void setLastName(String lastName) {
        
        this.lastName = lastName;
    }
    
    public void addParent(Citizen parent){
        
        parents.add(parent);
        
        if(!parent.children.contains(this)){
            
            parent.children.add(this);
        }
    }
    
    public void addChild(Citizen child){
        
        children.add(child);
        
        if(!child.parents.contains(this)){
            
            child.parents.add(this);
        }
    }

    public boolean getGender() {
        
        return gender;
    }

    public void setAlle(Allegience alle) {
        
        this.alle = alle;
    }
    
    @Override
    public void destroy() {

        for(Citizen p : parents){
            
            p.children.remove(this);
        }
        
        for(Citizen c : children){
            
            c.parents.remove(this);
        }
        
        //city.unregister
    }
}
