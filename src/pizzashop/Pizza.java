/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 * @author dancye
 * @modified by: Muhammad Arham
 */
public class Pizza 
{
    public int bakeTemp = 100;//temp to bake at
    private ArrayList<String> ingredients = new ArrayList();
    
    // I removed bake method from here to fix the SRP issue
    /**
     *  A method to add toppings to the ingredients
     * list
     * @param topping 
     */
    public void addTopping(String topping)
    {
        ingredients.add(topping);
    }
}
