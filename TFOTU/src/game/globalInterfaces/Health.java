/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.globalInterfaces;

/**
 *
 * @author Kosmic
 */
public interface Health {
    
    public abstract double takeDamage(double damage);
    
    public abstract void setHP(double hp);
    
    public abstract double getMaxHP();
    
    public abstract double getHP();
}
