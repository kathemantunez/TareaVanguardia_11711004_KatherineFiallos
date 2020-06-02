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
import Builder1.MealBuilder;
import Builder1.SandwichMealBuilder;
import Builder1.MealDirector;
import Builder1.Meal;
import Observer.HeadHunter;
import Observer.JobSeeker;

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
       
        System.out.println("Objeto EagerSingleton x:"+x.toString());
        System.out.println("Objeto EagerSingleton y:"+y.toString());
        System.out.println("y tiene la misma instancia de x");
        
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
        HeadHunter h=new HeadHunter();
        JobSeeker j1=new JobSeeker("Luis");
        JobSeeker j2=new JobSeeker("Lucas");
        JobSeeker j3=new JobSeeker("Miguel");
        JobSeeker j4=new JobSeeker("Orlando");
        
        h.registerObserver(j1);
        h.registerObserver(j2);
        h.registerObserver(j3);
        h.registerObserver(j4);
        
        h.removeObserver(j4);
        
        System.out.println("Asignacion 1:notificar a:");
        h.addJob("Crear Interfaz ");
        System.out.println("Asignacion 2:notificar a:");
        h.addJob("Crear base de datos en SQLServer ");
        System.out.println("Asignacion 3:notificar a:");
        h.addJob("Crear sistema contable ");
        
        
        
        
   }

    private static void Builder() {
        MealBuilder mb=new SandwichMealBuilder();
        MealDirector d=new MealDirector();
        
        d.makeMeal(mb);
        Meal m=mb.getMeal();
        System.out.println(m.toString());
    }
    
}
