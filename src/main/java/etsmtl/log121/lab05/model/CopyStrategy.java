package etsmtl.log121.lab05.model;

import etsmtl.log121.lab05.control.Mediator;

public interface CopyStrategy {
    void setMediator(Mediator mediator);
    void copy();
    void setCopyStrategy();
}
