/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.interfaces;

import entities.Owner;
import java.util.List;

/**
 *
 * @author Kosmic
 */
public interface Claimable {
    
    public void addOwner(Owner owner);
    
    public void removeOwner(Owner owner);
    
    public List<Owner> getOwnerList();
}
