package etsmtl.log121.lab05.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageSubject {
    private ImageView imageView;

    public ImageSubject(String sourcePath){

    }

    public void setImage(Image image){
        this.imageView.setImage(image);
    }

    public Image getImage(){
        return this.imageView.getImage();
    }
}
