package unilim.info.ihm.projet_fil_rouge;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	
	// TODO Déclaration des composants 
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// TODO Instanciation des composants
			
			// TODO gestionaire de layout racine
			
			GridPane root = new GridPane();
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
