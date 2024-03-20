package etsmtl.log121.lab05.model;

import etsmtl.log121.lab05.view.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    public List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void detach(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        observers.forEach(o -> o.update(this));
    }
}
