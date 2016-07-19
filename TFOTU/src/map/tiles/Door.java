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
public class Door extends TileDestruct{
    
    private double openSpeed;
    
    public Door(String id, double speed, double maxHP, double hp, int bLevel, boolean opaque, boolean solid, Color color, Tile deathTile) {
        
        super(id, speed, maxHP, hp, bLevel, opaque, solid, color, deathTile);
    }
    
    public Door(String id, double speed, double maxHP, int bLevel, boolean opaque, boolean solid, Color color, Tile deathTile) {
        
        super(id, speed, maxHP, bLevel, opaque, solid, color, deathTile);
    }
    
}
