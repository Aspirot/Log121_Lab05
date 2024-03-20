package etsmtl.log121.lab05.control;

import etsmtl.log121.lab05.model.Perspective;

public class ZoomInController extends Command{
    public boolean enabled;
    private final Perspective perspective;

    public ZoomInController(Perspective perspective) {
        this.perspective = perspective;
    }

    @Override
    public void execute() {

    }
}
