/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import land.Allegience;
import game.interfaces.Claimable;
import java.util.ArrayList;
import java.util.List;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public abstract class Owner extends Entity{
    
    protected List<Claimable> claims;
    protected Allegience alle;

    public Owner(Vec2 position, double maxHP, Allegience alle) {
        
        super(position, maxHP);
        claims = new ArrayList();
        this.alle = alle;
    }

    public Allegience getAlle() {
        
        return alle;
    }
   
    public void addClaim(Claimable claim) {

        claims.add(claim);
    }

    public void removeClaim(Claimable claim) {

        claims.remove(claim);
    }

    public List<Claimable> getClaimList() {

        List<Claimable> copy = new ArrayList();
        claims.forEach(o -> copy.add(o));
        return copy;
    }
}
