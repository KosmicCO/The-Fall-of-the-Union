/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.globalInterfaces;

import game.globalInterfaces.Claimable;
import entities.Owner;
import java.util.Map;

/**
 *
 * @author Kosmic
 */
public interface PermissionClaimable extends Claimable{
    
    public abstract void setPermission(Owner owner, int permis);
    
    public abstract int getOwnerPermission(Owner owner);
    
    public abstract void addOwner(Owner owner, int permis);
    
    public abstract Map<Owner, Integer> getPermissionMap();
}
