package unilim.info.ihm.projet_fil_rouge.view;

import java.util.ArrayList;
import java.util.Collections;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public class CardPair extends StackPane {
	private static final int NUM_OF_PAIRS = 6;
	private static final int NUM_PER_ROW = 4;
	Rectangle card;
	ImageView img;
	String urlDosCarte = "https://i.pinimg.com/originals/c5/b1/f3/c5b1f35d29702f1d9cb49f5760029603.png";
	String urlPair1 = "https://images-na.ssl-images-amazon.com/images/I/91leEZf5XtL._AC_SY355_.jpg";
	String urlPair2 = "https://images-na.ssl-images-amazon.com/images/I/51TPWdDvN4L._AC_SY355_.jpg";
	String urlPair3 = "https://images-na.ssl-images-amazon.com/images/I/A17NucJBx8L._AC_SY450_.jpg";
	String urlPair4 = "https://images-na.ssl-images-amazon.com/images/I/91qT57DTX6L._AC_SY355_.jpg";
	String urlPair5 = "https://images-na.ssl-images-amazon.com/images/I/91MdzSBiRML._AC_SY355_.jpg";
	String urlPair6 = "https://images-na.ssl-images-amazon.com/images/I/91%2BNTWopGWL._AC_SY355_.jpg";


	public CardPair() {
		ArrayList<Card> cardPair = new ArrayList<>();
		Image[] puzz = new Image[NUM_OF_PAIRS];
		String[] urls = { urlPair1, urlPair2, urlPair3, urlPair4, urlPair5, urlPair6 };
		for(int i = 0 ; i< puzz.length;i++) {
	    	puzz[i]= new Image(urls[i]);
	    	}

		for (int i1 = 0; i1 < NUM_OF_PAIRS; i1++) {

	    	cardPair.add(new Card(puzz[i1]));
	    	cardPair.add(new Card(puzz[i1]));
		}

		Collections.shuffle(cardPair);

		for (int i11 = 0; i11 < cardPair.size(); i11++) {

	    	Card tile = cardPair.get(i11);

	    	tile.setTranslateX(120 * (i11 % NUM_PER_ROW));
	    	tile.setTranslateY(170 * (i11 / NUM_PER_ROW));

	    	getChildren().add(tile);
		}
	}
}