package etsmtl.log121.lab05.model;

import java.util.Stack;

public class Memento {
    private Stack<Perspective> states;

    public Memento(){
        this.states = new Stack<>();
    }

    public Perspective getLastState(){
        if(!this.states.empty())
            return this.states.pop();
        return null;
    }

    public void addState(Perspective perspective){
        this.states.push(perspective);
    }

    public void removeStates(){
        this.states.clear();
    }
}
