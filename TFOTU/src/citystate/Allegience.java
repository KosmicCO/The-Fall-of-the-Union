/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citystate;

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
    
    public Allegience(String name, Color[] colors){
        
        id = ++nextID;
        this.name = name;
        this.colors = colors;
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
