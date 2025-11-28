/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzashop;

/**
 * This is responsible for baking pizza
 * @author muhammadarham
 */
public class Baker {
    
    // I fixed SRP, since baking is the baker's job, not the pizza itself
    public void bake(Pizza pizza, int temp)
    {
        pizza.bakeTemp = temp;
        //do some baking here, code not implemented yet
        //not necessary for the review
    }
}
