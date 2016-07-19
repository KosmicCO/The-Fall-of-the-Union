/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citystate;

import util.Vec2;

/**
 *
 * @author Kosmic
 */
public class Territory {
    
    private int[][] map;
    private int width;
    private int height;
    private int seed;
    
    public Territory(int[][] map, int seed){
        
        this.map = map;
        width = map.length;
        height = map[0].length;
        this.seed = seed;
    }
    
    public void landChange(int[][] change, Vec2 pos){
        
        int w = change.length;
        int h = change[0].length;
        
        for (int i = 0; i < w; i++) {
            
            for (int j = 0; j < h; j++) {
                
                if(change[i][j] != -1){
                    
                    map[(int) pos.x + i][(int) pos.y + j] = change[i][j];
                }
            }
        }
    }

    public int getWidth() {
        
        return width;
    }

    public int getHeight() {
        
        return height;
    }

    public int getSeed() {
        
        return seed;
    }
}
