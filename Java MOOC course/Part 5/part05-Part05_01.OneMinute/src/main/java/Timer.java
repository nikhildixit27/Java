/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundreth;
    
    public Timer(){
        this.seconds=new ClockHand(60);
        this.hundreth=new ClockHand(100);
    }
    
    public void advance(){
        this.hundreth.advance();
        
        if(this.hundreth.value()==0){
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return seconds +":"+hundreth;
    }   
}
