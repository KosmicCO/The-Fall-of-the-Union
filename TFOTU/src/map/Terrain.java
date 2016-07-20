/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import map.tiles.Tile;

/**
 *
 * @author Kosmic
 */
public class Terrain {
    
    private final Tile[][] map;
    private final int width;
    private final int height;
    private final long seed;
    
    public Terrain(Tile[][] map, long seed){
        
        this.map = map;
        width = map.length;
        height = map[0].length;
        this.seed = seed;
    }
}
