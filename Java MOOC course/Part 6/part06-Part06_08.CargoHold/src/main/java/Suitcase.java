/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight=maxWeight;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Item e: items){
            weight += e.getWeight();
        }
        return weight;
    }
    
    public void addItem(Item item){
            if((totalWeight() + item.getWeight()) <= maxWeight){
                items.add(item);
            }else{
                return;
            }
        }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for (Item e : items) {
            if (e.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = e;
                }
            }
        return heaviestItem;
    }
        
    public void printItems(){
        for(Item e: items)            
            System.out.println(e);
    }        
    
    public String toString(){

        String weightOutput = " (" + totalWeight() + "kg";
        String itemOutput = "";
        
        if (items.isEmpty()) {
            itemOutput = "no items";
        } else if (items.size() == 1) {
            itemOutput = "1 item";
        } else {
            itemOutput = items.size() + " items";
        }

        return itemOutput + weightOutput;
    }
}
