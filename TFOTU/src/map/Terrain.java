/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

/**
 *
 * @author Kosmic
 */
public class Terrain {
    
    private Tile[][] map;
    private int width;
    private int height;
    private long seed;
    
    public Terrain(Tile[][] map, long seed){
        
        this.map = map;
        width = map.length;
        height = map[0].length;
        this.seed = seed;
    }
}
