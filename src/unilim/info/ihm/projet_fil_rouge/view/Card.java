package unilim.info.ihm.projet_fil_rouge.view;

import java.io.File;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Card extends StackPane {
	
	private static final int NUM_OF_PAIRS = 6;
	private static final int NUM_PER_ROW = 4;
	Rectangle card;
	String url = "https://i.pinimg.com/originals/c5/b1/f3/c5b1f35d29702f1d9cb49f5760029603.png";
	Image img;

	public Card() {
		Image img = new Image(url);
		Rectangle card = new Rectangle(50, 100);
		card.setFill(new ImagePattern(img));
		card.setStroke(Color.BLACK);
		StackPane grid = new StackPane();
		
		setAlignment(Pos.CENTER);
		getChildren().addAll(card);
		List<Tile> tiles = new ArrayList<>();
	}
}