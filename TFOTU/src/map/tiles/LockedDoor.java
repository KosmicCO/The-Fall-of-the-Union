/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.tiles;

import org.newdawn.slick.Color;

/**
 *
 * @author Kosmic
 */
public class LockedDoor extends Door{
    
    //protected City 
    
    public LockedDoor(String id, double speed, double maxHP, double openSpeed, int bLevel, boolean opaque, Color openColor, Color closedColor, Tile deathTile) {
        
        super(id, speed, maxHP, openSpeed, bLevel, opaque, openColor, closedColor, deathTile);
    }
}
