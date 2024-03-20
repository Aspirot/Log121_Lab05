package etsmtl.log121.lab05.control;

import etsmtl.log121.lab05.model.Perspective;
import javafx.scene.input.MouseEvent;

public class TranslationController extends Command{
    private MouseEvent mouseEvent;
    private int originalX;
    private int originalY;
    private int originalTranslateX;
    private int originalTranslateY;
    private final Perspective perspective;

    public TranslationController(Perspective perspective) {
        this.perspective = perspective;
    }

    @Override
    public void execute() {

    }

    public MouseEvent getMouseEvent() {
        return mouseEvent;
    }

    public void setMouseEvent(MouseEvent mouseEvent) {
        this.mouseEvent = mouseEvent;
    }

    public int getOriginalX() {
        return originalX;
    }

    public void setOriginalX(int originalX) {
        this.originalX = originalX;
    }

    public int getOriginalY() {
        return originalY;
    }

    public void setOriginalY(int originalY) {
        this.originalY = originalY;
    }

    public int getOriginalTranslateX() {
        return originalTranslateX;
    }

    public void setOriginalTranslateX(int originalTranslateX) {
        this.originalTranslateX = originalTranslateX;
    }

    public int getOriginalTranslateY() {
        return originalTranslateY;
    }

    public void setOriginalTranslateY(int originalTranslateY) {
        this.originalTranslateY = originalTranslateY;
    }
}
