/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citystate;

import entities.Entity;
import entities.Owner;
import java.util.ArrayList;
import java.util.List;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public class Claim extends Area implements Claimable{
    
    protected List<Owner> owners;
    
    public Claim(String name, Vec2 pos, Vec2 dim) {
        
        super(name, pos, dim);
    }
    
    @Override
    public void addOwner(Owner owner){
        
        owners.add(owner);
        owner.addClaim(this);
    }
    
    @Override
    public void removeOwner(Owner owner){
        
        owners.remove(owner);
        owner.removeClaim(this);
    }
    
    @Override
    public List<Owner> getOwnerList(){
        
        List<Owner> copy = new ArrayList();
        owners.forEach(o -> copy.add(o));
        return copy;
    }
}
