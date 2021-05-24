package unilim.info.ihm.projet_fil_rouge.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class RootPane extends VBox{

	Button quitter;
	Label lblTour;
	CardPair grid = new CardPair();
	HBox hbox;
	Label lblDifficulte;
	Label lblScore;
	
	public RootPane() {
		Button quitter = new Button("Quitter");
		Label lblDifficulte = new Label("Difficulté : Facile");
		Label lblScore = new Label("Score : xx");
		Label lblTour = new Label("Tour du joueur : 1 / 2 / Ordi");
		HBox hbox = new HBox(quitter, lblTour, lblDifficulte, lblScore);
		hbox.setSpacing(100);
		VBox.setMargin(hbox, new Insets(20,20,20,20));
		this.getChildren().addAll(hbox, grid);
	}
}
