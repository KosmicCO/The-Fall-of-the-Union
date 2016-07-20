/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.tiles;

import citystate.Claimable;
import entities.Entity;
import entities.Owner;
import java.util.ArrayList;
import java.util.List;
import org.newdawn.slick.Color;

/**
 *
 * @author Kosmic
 */
public class LockedDoor extends Door implements Claimable{

    protected boolean locked;
    protected List<Owner> owners;

    public LockedDoor(String id, double speed, double maxHP, double openSpeed, int bLevel, boolean opaque, Color openColor, Color closedColor, Tile deathTile) {

        super(id, speed, maxHP, openSpeed, bLevel, opaque, openColor, closedColor, deathTile);
        locked = false;
        owners = new ArrayList();
    }

    public void setLocked(boolean locked) {

        this.locked = locked;
    }

    public boolean isLocked() {

        return locked;
    }

    @Override
    public void interact(Entity entity) {

        if (!locked || entity instanceof Owner && owners.contains((Owner) entity)) {

            super.interact(entity);
        }
    }

    @Override
    public void addOwner(Owner owner) {

        owners.add(owner);
    }

    @Override
    public void removeOwner(Owner owner) {

        owners.remove(owner);
    }

    @Override
    public List<Owner> getOwnerList() {

        List<Owner> copy = new ArrayList();
        owners.forEach(o -> copy.add(o));
        return copy;
    }
}
