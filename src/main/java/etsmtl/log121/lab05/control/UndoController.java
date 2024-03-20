package etsmtl.log121.lab05.control;

import etsmtl.log121.lab05.model.Perspective;

public class UndoController extends Command{
    public boolean enabled;
    private final Perspective perspective;

    public UndoController(Perspective perspective) {
        this.enabled = false;
        this.perspective = perspective;
    }

    @Override
    public void execute() {

    }
}
