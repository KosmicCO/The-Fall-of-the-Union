/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package land;

import entities.Government;
import java.util.ArrayList;
import java.util.List;
import org.newdawn.slick.Color;

/**
 *
 * @author Kosmic
 */
public class Allegience {
    
    private static int nextID = -1;
    private static final List<Allegience> alList = new ArrayList();
    
    private final int id;
    private String name;
    private Color[] colors;
    private final Government association;
    
    public Allegience(String name, Color[] colors, Government assoc){
        
        id = ++nextID;
        this.name = name;
        this.colors = colors;
        association = assoc;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Color[] getColors() {
        return colors;
    }
    
    public static boolean uniqueName(String name){
        
        boolean unique = true;
        
        for(Allegience a : alList){
            
            unique &= !a.name.equals(name);
        }
        
        return unique;
    }
}
