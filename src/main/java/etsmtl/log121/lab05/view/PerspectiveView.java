package etsmtl.log121.lab05.view;

import etsmtl.log121.lab05.control.CopyPasteController;
import etsmtl.log121.lab05.model.*;

import java.util.ArrayList;
import java.util.List;

public class PerspectiveView implements Observer{
    private final Perspective perspective;
    private final List<CopyStrategy> copyStrategies;

    public PerspectiveView(Perspective perspective) {
        this.perspective = perspective;
        CopyState copyStateStrategy = new CopyState();
        CopyTranslation copyTranslationStrategy = new CopyTranslation();
        CopyScale copyScaleStrategy = new CopyScale();
        CopyNothing copyNothingStrategy = new CopyNothing();

        CopyPasteController copyPasteController = new CopyPasteController(copyNothingStrategy);

        copyStateStrategy.setMediator(copyPasteController);
        copyTranslationStrategy.setMediator(copyPasteController);
        copyScaleStrategy.setMediator(copyPasteController);
        copyNothingStrategy.setMediator(copyPasteController);

        this.copyStrategies = new ArrayList<>();
        this.copyStrategies.add(copyStateStrategy);
        this.copyStrategies.add(copyTranslationStrategy);
        this.copyStrategies.add(copyScaleStrategy);
        this.copyStrategies.add(copyNothingStrategy);
    }

    @Override
    public void update(Subject s) {

    }
}
