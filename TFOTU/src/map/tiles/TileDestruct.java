/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.tiles;

import game.globalInterfaces.Health;
import org.newdawn.slick.Color;

/**
 *
 * @author Kosmic
 */
public class TileDestruct extends Tile implements Health{
    
    protected double maxHP;
    protected double hp;
    protected Tile deathTile;
    
    public TileDestruct(String id, double speed, double maxHP, int bLevel, boolean opaque, Color color, Tile deathTile) {
        
        super(id, speed, bLevel, opaque, color);
        this.maxHP = maxHP;
        this.hp = maxHP;
        this.deathTile = deathTile;
    }
    
    @Override
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

    @Override
    public void setHP(double hp) {
        
        this.hp = hp;
    }

    @Override
    public double getMaxHP() {
        
        return maxHP;
    }

    @Override
    public double getHP() {
        
        return hp;
    }

    public Tile getDeathTile() {
        
        return deathTile;
    }
}
