package etsmtl.log121.lab05.control;

import etsmtl.log121.lab05.model.*;

public class CopyPasteController extends Command implements Mediator{
    private CopyStrategy currentStrategy;

    public CopyPasteController(CopyStrategy initialStrategy){
        this.currentStrategy = initialStrategy;
    }

    public void copy(){

    }

    public void paste(){

    }

    @Override
    public void changeCopyStrategy(CopyStrategy strategy) {
        this.currentStrategy = strategy;
    }

    @Override
    public void execute() {

    }
}
