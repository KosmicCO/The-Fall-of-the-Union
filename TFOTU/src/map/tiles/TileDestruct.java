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
public class TileDestruct extends Tile{
    
    private double maxHP;
    private double hp;
    private Tile deathTile;
    
    public TileDestruct(String id, double speed, double maxHP, double hp, int bLevel, boolean opaque, boolean solid, Color color, Tile deathTile) {
        
        super(id, speed, bLevel, opaque, solid, color);
        this.maxHP = maxHP;
        this.hp = hp;
        this.deathTile = deathTile;
    }
    
    public TileDestruct(String id, double speed, double maxHP, int bLevel, boolean opaque, boolean solid, Color color, Tile deathTile) {
        
        this(id, speed, maxHP, maxHP, bLevel, opaque, solid, color, deathTile);
    }
    
    public double takeDamage(double damage){
        
        if(maxHP - hp < damage){
            
            damage = maxHP - hp;
            hp = maxHP;
            return damage;
        }
        
        hp += damage;
        
        if(hp < 0){
            
            return damage - hp;
        }
        
        return damage;
    }
}
