package etsmtl.log121.lab05.control;

import etsmtl.log121.lab05.model.Memento;
import etsmtl.log121.lab05.model.Perspective;

import java.util.Stack;

public class OrderManager {
    private OrderManager instance;
    private Stack<Command> topViewCommandStack;
    private Stack<Command> bottomViewCommandStack;
    private Memento topViewMemento;
    private Memento bottomViewMemento;
    private Perspective copiedPerspective;

    private OrderManager(){
        topViewCommandStack = new Stack<>();
        bottomViewCommandStack = new Stack<>();
        topViewMemento = new Memento();
        bottomViewMemento = new Memento();
        copiedPerspective = null;
    }

    public OrderManager getInstance(){
        if(this.instance != null)
            this.instance = new OrderManager();
        return this.instance;
    }

    public void addCommandToStack(Command command){

    }

    public void undo(){

    }

    public void redo(){

    }

    public void setCopiedPerspective(Perspective perspective){
        this.copiedPerspective = perspective;
    }

    public Perspective getCopiedPerspective(){
        return this.copiedPerspective;
    }
}
