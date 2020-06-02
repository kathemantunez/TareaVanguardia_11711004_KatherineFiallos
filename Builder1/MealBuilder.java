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
public interface MealBuilder {
    public void addSandwich(String s);
    public void addSides(String s);
    public void addDrink(String d);
    public void setPrice(double p);
    public Meal getMeal();
    public void addOffer(String o);
    
}
