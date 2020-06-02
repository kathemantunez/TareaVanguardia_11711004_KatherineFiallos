/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class HeadHunter implements Subject{
    private ArrayList<String>jobs=new ArrayList();
    private ArrayList<Observer>observes=new ArrayList();

    public HeadHunter() {
    }

    @Override
    public void registerObserver(Observer ob) {
        observes.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observes.remove(ob);
    }

    @Override
    public void notifyAllObservers() {
        for (int i = 0; i < observes.size(); i++) {
            observes.get(i).update(this);
            
        }
    }
    public void addJob(String j){
        this.jobs.add(j);
        notifyAllObservers();
    }
    public ArrayList<String> getJobs(){
        return jobs;
    }

    @Override
    public String toString() {
        return "HeadHunter{" + "jobs=" + jobs + ", observes=" + observes + '}';
    }
    
    
    
}
