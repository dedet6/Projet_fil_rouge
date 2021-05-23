package unilim.info.ihm.projet_fil_rouge.view;

import javafx.scene.layout.BorderPane;

public class RootPane extends BorderPane{

	Card grid = new Card();
	
	public RootPane() {
		this.setCenter(grid);
	}
}
