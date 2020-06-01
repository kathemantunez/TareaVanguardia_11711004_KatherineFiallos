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
public class CarFactory {
    
    public Car buildCar(CarType car){
        if(car.equals(CarType.LUXURYCAR)){
            return new Luxury();
        }else if(car.equals(CarType.SEDANCAR)){
            return new Sedan();
           
        }else if(car.equals(CarType.SMALLCAR)){
            return new Small();
        }
        return new Car(car);
    }
    
}
