package etsmtl.log121.lab05.control;

import etsmtl.log121.lab05.model.Perspective;

public class RedoController extends Command{
    private boolean enabled;
    private final Perspective perspective;

    public RedoController(Perspective perspective) {
        this.enabled = false;
        this.perspective = perspective;
    }

    @Override
    public void execute() {

    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
