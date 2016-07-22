/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import land.Allegience;
import org.newdawn.slick.Color;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public class Government extends Owner{

    protected final List<City> cities;
    protected Citizen president;
    
    public Government(Vec2 position, double maxHP, String alleName, Color[] alleColors) {
        
        super(position, maxHP, null);
        alle = new Allegience(alleName, alleColors, this);
        cities = new ArrayList();
    }

    @Override
    public void destroy() {
        
        
    }
    
}
