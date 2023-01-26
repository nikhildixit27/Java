/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

public class Container {
    private int amount;
    
    public Container(){
        this.amount=0;
    }
    
    public int contains(){
        return amount;
    }
    
    public void add(int amountToAdd){
        if(amountToAdd<0){
            return;
        }else if(this.contains() + amountToAdd <=100){
             amount += amountToAdd;
        }else{
            amount = 100;
        }  
    }
    
    public void remove(int amountToRemove){
        if(amountToRemove <0){
            return;
        }else if(this.contains()-amountToRemove>=0){
            amount = amount-amountToRemove;
        }else{
            amount = 0;
        }
    }
    
    public String toString(){
        return this.contains()+"/100";
    }
}
