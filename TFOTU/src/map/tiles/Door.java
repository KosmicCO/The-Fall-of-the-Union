/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.tiles;

import entities.Entity;
import org.newdawn.slick.Color;

/**
 *
 * @author Kosmic
 */
public class Door extends TileDestruct implements Interact {

    protected double openSpeed;
    protected boolean open;
    protected Color openColor;

    public Door(String id, double speed, double maxHP, double openSpeed, int bLevel, boolean opaque, Color openColor, Color closedColor, Tile deathTile) {

        super(id, speed, maxHP, bLevel, opaque, closedColor, deathTile);
        this.openSpeed = openSpeed;
        this.open = false;
        this.openColor = openColor;
    }

    @Override
    public Color getColor() {

        return open ? openColor : color;
    }

    @Override
    public void interact(Entity entity) {

        open = !open;

        if (open) {

            speed = openSpeed;
        } else {

            speed = 0;
        }
    }

    public double getOpenSpeed() {

        return openSpeed;
    }

    public boolean isOpen() {

        return open;
    }

    public Color getOpenColor() {

        return openColor;
    }

    public Color getClosedColor() {

        return color;
    }

    public void open(boolean open) {
        
        this.open = open;
    }
}
