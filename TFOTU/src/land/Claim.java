/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package land;

import game.interfaces.PermissionClaimable;
import entities.Owner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public class Claim extends Area implements PermissionClaimable{
    
    protected List<Owner> owners;
    protected Map<Owner, Integer> permissions;
    
    public Claim(String name, Vec2 pos, Vec2 dim) {
        
        super(name, pos, dim);
        owners = new ArrayList();
        permissions =  new HashMap();
    }
    
    @Override
    public void addOwner(Owner owner){
        
        owners.add(owner);
        permissions.put(owner, 1);
        owner.addClaim(this);
    }
    
    @Override
    public void setPermission(Owner owner, int permis){
        
        permissions.replace(owner, permis);
    }
    
    @Override
    public int getOwnerPermission(Owner owner){
        
        return permissions.get(owner);
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

    @Override
    public void addOwner(Owner owner, int permis) {

        owners.add(owner);
        permissions.put(owner, permis);
        owner.addClaim(this);
    }

    @Override
    public Map<Owner, Integer> getPermissionMap() {

        Map<Owner, Integer> copy = new HashMap();
        copy.putAll(permissions);
        return copy;
    }
}
