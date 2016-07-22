/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kosmic
 */
public final class Names {
    
    private final static List<String>[] names = new ArrayList[3];
    
    static{
        
        names[0] = new ArrayList(); //male
        names[1] = new ArrayList(); //female
        
        //copy baby names from file
    }
}
