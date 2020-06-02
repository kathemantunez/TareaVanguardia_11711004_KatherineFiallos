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
public class SandwichMealBuilder implements MealBuilder{
    private Meal meal=new Meal();

    public SandwichMealBuilder() {
    }

    @Override
    public void addSandwich(String s) {
        meal.sandwich=s;
    }

    @Override
    public void addSides(String s) {
        meal.sideOrder=s;
    }

    @Override
    public void addDrink(String d) {
        meal.drink=d;
    }

    @Override
    public void setPrice(double p) {
        meal.price=p;
    }

    @Override
    public Meal getMeal() {
        return meal;
    }

    @Override
    public void addOffer(String o) {
        meal.offer=o;
    }
    
}
