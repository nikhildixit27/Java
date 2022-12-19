/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Cube {
    private int edgeLenght;
    
    public Cube(int edgeLenght){
        this.edgeLenght=edgeLenght;
    }
    
    public int volume(){
        return this.edgeLenght *this.edgeLenght *this.edgeLenght;
    }
    
    public String toString(){
        return "The lenght of the edge is "+ this.edgeLenght +" and the volume "+this.volume();
    }
}
