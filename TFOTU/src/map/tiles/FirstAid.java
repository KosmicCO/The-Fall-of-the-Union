/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.tiles;

import game.interfaces.Interact;
import entities.Citizen;
import entities.Entity;
import org.newdawn.slick.Color;

/**
 *
 * @author Kosmic
 */
public class FirstAid extends TileDestruct implements Interact{
    
    private double remainingHP;
    
    public FirstAid(String id, double speed, double maxHP, int bLevel, boolean opaque, Color color, Tile deathTile) {
        
        super(id, speed, maxHP, bLevel, opaque, color, deathTile);
        remainingHP = 200;
    }

    @Override
    public void interact(Entity entity) {

        if(entity instanceof Citizen){
            
            double healed = entity.getMaxHP() - entity.getHP();
            
            if(healed > remainingHP){
                
                entity.takeDamage(remainingHP);
                remainingHP = 0;
            }else{
                
                entity.setHP(entity.getMaxHP());
                remainingHP -= healed;
            }
        }
    }
}
