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
    
    protected String tileID;
    protected double speed;
    protected int blockingLevel;
    protected boolean opaque;
    protected Color color;
    
    public Tile(String id, double speed, int bLevel, boolean opaque, Color color){
        
        tileID = id;
        this.speed = speed;
        blockingLevel = bLevel;
        this.opaque = opaque;
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

    public Color getColor() {
        
        return color;
    }
    
    public boolean isSolid(){
        
        return speed == 0;
    }
}
