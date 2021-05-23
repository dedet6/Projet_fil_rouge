package unilim.info.ihm.projet_fil_rouge;
	
import javafx.application.Application;
import javafx.stage.Stage;
import unilim.info.ihm.projet_fil_rouge.view.RootPane;
import javafx.scene.Scene;


public class Main extends Application {
	
	// TODO Déclaration des composants 
	RootPane root = new RootPane();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// TODO Instanciation des composants
			
			// TODO gestionaire de layout racine
		
			Scene scene = new Scene(root,800,500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Jeu de Memory !");
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
