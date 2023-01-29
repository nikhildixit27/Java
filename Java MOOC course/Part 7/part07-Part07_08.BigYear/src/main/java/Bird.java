/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Bird {
    private String name;
    private String latinName;
    private int observation;
    
    public Bird(String name, String latinName){
        this.name=name;
        this.latinName=latinName;
        this.observation=observation;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addObservation(){
        this.observation++;
    }
    
    public String toString(){
        return this.name+ " ("+ this.latinName + "): "+this.observation+" observation";
    }
}
