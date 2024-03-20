package etsmtl.log121.lab05.control;

import etsmtl.log121.lab05.model.ImageSubject;
import etsmtl.log121.lab05.model.Perspective;

public class SelectImageController extends Command{
    private final ImageSubject imageSubject;
    private final Perspective topPerspective;
    private final Perspective bottomPerspective;

    public SelectImageController(ImageSubject imageSubject, Perspective topPerspective, Perspective bottomPerspective) {
        this.imageSubject = imageSubject;
        this.topPerspective = topPerspective;
        this.bottomPerspective = bottomPerspective;
    }

    @Override
    public void execute() {

    }
}
