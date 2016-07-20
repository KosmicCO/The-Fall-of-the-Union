/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import citystate.Allegience;
import citystate.Claimable;
import java.util.ArrayList;
import java.util.List;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public class Citizen extends Entity implements Owner{

    protected int gender; //0 undef, 1 male, 2 female
    protected Allegience alle;
    protected List<Claimable> claims;
    
    public Citizen(Vec2 pos, int gender, Allegience al){
        
        super(pos, 100);
        this.gender = gender;
        alle = al;
        claims = new ArrayList();
    }

    public int getGender() {
        
        return gender;
    }

    public Allegience getAlle() {
        
        return alle;
    }

    public void setAlle(Allegience alle) {
        
        this.alle = alle;
    }
    
    @Override
    public void destroy() {

        
    }

    @Override
    public void addClaim(Claimable claim) {

        claims.add(claim);
    }

    @Override
    public void removeClaim(Claimable claim) {

        claims.remove(claim);
    }

    @Override
    public List<Claimable> getClaimList() {

        List<Claimable> copy = new ArrayList();
        claims.forEach(o -> copy.add(o));
        return copy;
    }
}
