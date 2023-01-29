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

public class RecipeBook {
    private ArrayList<Recipe> recipe;
    
    public RecipeBook(){
        this.recipe = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe){
        this.recipe.add(recipe);
    }
    
    public void printByName(String name){
        if(this.recipe.isEmpty()){
            System.out.println("Not found");
        }else{
            for(Recipe e : this.recipe){
                if(e.getName().toLowerCase().contains(name.toLowerCase())){
                    System.out.println(e);
                }
            }
        }
    }
    
    public void printByTime(String time){
        if(this.recipe.isEmpty()){
            System.out.println("Not found");
        }else{
            for(Recipe e: this.recipe){
                if(e.getTime() <= Integer.valueOf(time)){
                    System.out.println(e);
                }
            }
        }
               
    }

    public void printByIngredient(String ingredient) {

        if (this.recipe.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe e : this.recipe) {
                if (e.getIngredients().contains(ingredient.toLowerCase())) {
                    System.out.println(e);
                }
            }
        }
    }
    
    public void printRecipeBook() {
        for (Recipe e : this.recipe) {
            System.out.println(e);
        }
    }
    
}
