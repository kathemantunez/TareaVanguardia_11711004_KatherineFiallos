/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder1;

/**
 *
 * @author KATHERINE
 */
public class MealDirector {
    
    public MealDirector(){
        
    }
    public void makeMeal(MealBuilder m){
        m.addSandwich("Club Sandwich");
        m.addDrink("Té frio");
        m.addSides("Patatas con extra queso y extra tocino");
        m.addOffer("50% de descuento");
        m.setPrice(310.15);
    }
    
}
