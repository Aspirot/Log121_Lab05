package etsmtl.log121.lab05.model;

import javafx.scene.image.ImageView;

public class Perspective extends Subject{
    private ImageView imageView;
    private int scale;
    private int translation;

    private Perspective(int scale, int translation){
        this.scale = scale;
        this.translation = translation;
    }

    public Perspective(String imagePath, int scale, int translation) {
        this.scale = scale;
        this.translation = translation;
    }

    public Perspective getState(){
        return new Perspective(this.scale, this.translation);
    }

    public void setState(Perspective perspective){
        this.scale = perspective.getScale();
        this.translation = perspective.getTranslation();
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public int getTranslation() {
        return translation;
    }

    public void setTranslation(int translation) {
        this.translation = translation;
    }
}
