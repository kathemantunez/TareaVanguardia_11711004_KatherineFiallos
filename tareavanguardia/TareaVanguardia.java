/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareavanguardia;


import Factory.Car;
import Factory.CarFactory;
import Factory.CarType;
import Singleton.EagerSingleton;

/**
 *
 * @author KATHERINE
 */
public class TareaVanguardia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("TAREA VANGUARDIA, PATRONES DE DISEÑO");
        System.out.println("----------------------------------------");
        System.out.println("---------------SINGLETON----------------");
        singleton();
        System.out.println("----------------------------------------");
        System.out.println("---------------FACTORY------------------");
        factory();
        System.out.println("----------------------------------------");
        System.out.println("---------------OBSERVER-----------------");
        observer();
        System.out.println("----------------------------------------");
        System.out.println("---------------BUILDER------------------");
        Builder();
    }

    private static void singleton() {
       EagerSingleton x=EagerSingleton.getInstance();
       EagerSingleton y =EagerSingleton.getInstance();
       
        System.out.println(x.toString());
        System.out.println(y.toString());
        
    }

    private static void factory() {
        CarFactory factory=new CarFactory();
        
        Car c1=factory.buildCar(CarType.SMALLCAR);
        System.out.println(c1.getModel()+" carro creado exitosamente");
        Car c2=factory.buildCar(CarType.LUXURYCAR);
        System.out.println(c2.getModel()+" carro creado exitosamente");
        Car c3=factory.buildCar(CarType.SEDANCAR);
        System.out.println(c3.getModel()+" carro creado exitosamente");
        
    }

    private static void observer() {
   }

    private static void Builder() {
    }
    
}
