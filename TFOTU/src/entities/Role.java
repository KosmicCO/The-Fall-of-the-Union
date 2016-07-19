/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import citystate.Area;
import citystate.Territory;

/**
 *
 * @author Kosmic
 */
public abstract class Role {
    
    protected double wealth;
    protected Area workplace;
    protected Citizen worker;
    
    public Role(double wealth, Area workplace, Citizen worker){
        
        this.wealth = wealth;
        this.workplace = workplace;
        this.worker = worker;
    }
    
    public abstract void idleMove(); //probably can be an actual method with random node selection and path finding
    
    public class Unimployed extends Role{
        
        public static final int WANDER_RANGE = 20;
        
        public Unimployed(double wealth, Citizen worker) {
            
            super(wealth, new Area(/*general vicinity*/), worker);
        }

        @Override
        public void idleMove() {

            //moves to a random location int the area
        }
    }
}
