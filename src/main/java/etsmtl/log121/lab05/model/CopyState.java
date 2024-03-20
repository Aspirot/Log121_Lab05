package etsmtl.log121.lab05.model;

import etsmtl.log121.lab05.control.Mediator;

public class CopyState implements CopyStrategy{
    private Mediator mediator;

    public CopyState() {
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void copy() {

    }

    @Override
    public void setCopyStrategy() {
        if(this.mediator != null)
            this.mediator.changeCopyStrategy(this);
    }
}
