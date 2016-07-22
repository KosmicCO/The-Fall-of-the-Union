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
public class City extends Owner{

    private final List<Citizen> citizens;
    private Citizen mayor;
    
    public City(Vec2 position, double maxHP, Allegience alle) {
        
        super(position, maxHP, alle);
        citizens = new ArrayList();
    }
    
    public void birth(Citizen... parents){
        
        int l = parents.length;
        String lastName = parents[(int) (l * Math.random())].getLastName();
        String firstName = "Cruz"; //make class with types of names to pick from based on 'culture' type
        Vec2 bPos = parents[(int) (l * Math.random())].getPos();
        Citizen baby = new Citizen(firstName, lastName, bPos, Math.random() < 0.5, alle);
        citizens.add(baby);
        
        for(Citizen p : parents){
            
            p.addChild(baby);
        }
    }
    
    public void death(Citizen citizen){
        
        citizens.remove(citizen);
    }

    @Override
    public void destroy() {
        
        
    }
    
}
