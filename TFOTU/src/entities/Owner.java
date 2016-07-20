/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import citystate.Claimable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kosmic
 */
public interface Owner {
    
    public abstract void addClaim(Claimable claim);
    
    public abstract void removeClaim(Claimable claim);
    
    public abstract List<Claimable> getClaimList();
}
