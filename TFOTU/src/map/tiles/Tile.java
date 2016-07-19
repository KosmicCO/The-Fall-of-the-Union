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
public class Tile {
    
    private String tileID;
    private double speed;
    private int blockingLevel;
    private boolean opaque;
    private boolean solid;
    private Color color;
    
    public Tile(String id, double speed, int bLevel, boolean opaque, boolean solid, Color color){
        
        tileID = id;
        this.speed = speed;
        blockingLevel = bLevel;
        this.opaque = opaque;
        this.solid = solid;
        this.color = color;
    }

    public String getTileID() {
        
        return tileID;
    }

    public double getSpeed() {
        
        return speed;
    }

    public int getBlockingLevel() {
        
        return blockingLevel;
    }

    public boolean isOpaque() {
        
        return opaque;
    }

    public boolean isSolid() {
        
        return solid;
    }

    public Color getColor() {
        
        return color;
    }
}
