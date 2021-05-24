package unilim.info.ihm.projet_fil_rouge.view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Card extends StackPane {
	
	Rectangle card;
	ImageView img;
	
	public Card(Image image) {
		Rectangle card = new Rectangle(100, 150);
		card.setFill(new ImagePattern(image));
		card.setStroke(Color.BLACK);
        
		getChildren().addAll(card);
	}
}