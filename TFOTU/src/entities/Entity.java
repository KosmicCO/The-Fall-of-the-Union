/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import game.globalInterfaces.Health;
import java.util.ArrayList;
import java.util.List;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public abstract class Entity implements Health{
    
    protected static final List<Entity> entities = new ArrayList();
    
    protected Vec2 pos;
    protected double maxHP;
    protected double hp;
    
    public Entity(Vec2 position, double maxHP){
        
        this.pos = position;
        this.maxHP = maxHP;
        hp = maxHP;
    }

    public Vec2 getPos() {
        
        return pos;
    }

    @Override
    public double getMaxHP() {
        
        return maxHP;
    }

    @Override
    public double getHP() {
        
        return hp;
    }

    @Override
    public void setHP(double hp) {
        
        this.hp = hp;
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
    
    public abstract void destroy();
}
