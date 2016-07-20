/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citystate;

import java.util.ArrayList;
import java.util.List;
import util.Vec2;

/**
 *
 * @author Kosmic
 */
public class Area {

    public static final int MAX_SUB = 3;

    protected String name;
    protected Vec2 pos;
    protected Vec2 dim;
    protected int subID;
    protected Area parent;
    protected List<Area> children;
    protected boolean[][] childMap;

    public Area(String name, Vec2 pos, Vec2 dim) {

        this(name, pos, dim, null);
    }

    private Area(String name, Vec2 pos, Vec2 dim, Area parent) {

        this.name = name;
        this.pos = pos;
        this.dim = dim;
        this.parent = parent;
        children = new ArrayList();
        childMap = new boolean[(int) dim.x][(int) dim.y];
        subID = 0;

        if (parent != null) {

            subID = parent.subID + 1;
        }
    }

    public Area makeSubArea(String name, Vec2 pos, Vec2 dim) {

        int x = (int) (pos.x - this.pos.x);
        int y = (int) (pos.y - this.pos.y);
        
        for (int i = 0; i < (int) dim.x; i++) {

            for (int j = 0; j < (int) dim.y; j++) {

                if (x + i < 0 || y + j < 0 || x + i >= this.dim.x || y + j >= this.dim.y) {

                    return null;
                }

                if (childMap[x + i][y + j]) {

                    return null;
                }
            }
        }

        if (subID < MAX_SUB) {

            Area a = new Area(name, pos, dim, this);
            children.add(a);

            for (int i = 0; i < (int) dim.x; i++) {

                for (int j = 0; j < (int) dim.y; j++) {
                    
                    childMap[x + i][y + j] = false;
                }
            }

            return a;
        }

        return null;
    }
    
    public boolean isUniqueName(String name){
        
        for(Area a : children){
            
            if(a.name.equals(name)){
                
                return false;
            }
        }
        
        return true;
    }

    public String getName() {
        
        return name;
    }

    public Vec2 getPos() {
        
        return pos;
    }

    public Vec2 getDim() {
        
        return dim;
    }
}
