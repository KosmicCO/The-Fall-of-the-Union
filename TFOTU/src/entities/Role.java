/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import citystate.Area;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public abstract class Role {
    
    protected double wealth;
    protected Area workplace;
    protected Area city;
    protected Citizen worker;
    
    public Role(double wealth, Area workplace /*area is found in the workplace claim*/, Citizen worker){
        
        this.wealth = wealth;
        this.workplace = workplace;
        this.worker = worker;
    }
    
    public void idleMove(){
        
        //pick a place to go that is inside workplace bounds and use A* to get there
    }
    
    public void errandMove(){
        
        //picks a place to go that is outside the workplace; this happens less often than idleMove
    }
    
    public class Unimployed extends Role{
        
        public Unimployed(double wealth, Citizen worker) {
            
            super(wealth, null, worker);
        }
    }
}
