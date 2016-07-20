/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import citystate.Claim;
import java.util.ArrayList;
import java.util.List;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public abstract class Entity {
    
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

    public double getMaxHP() {
        
        return maxHP;
    }

    public double getHp() {
        
        return hp;
    }

    public void setHp(double hp) {
        
        this.hp = hp;
    }
    
    public abstract void destroy();
}
