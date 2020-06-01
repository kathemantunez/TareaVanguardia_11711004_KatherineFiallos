/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author KATHERINE
 */
public class Car {
    CarType model;

    public Car() {
    }

    public Car(CarType model) {
        this.model = model;
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
    
    
}
