package ch.fhnw.module06.ab3;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent rootPane = new ApplicationUI();
		
		Scene scene = new Scene(rootPane);
		
		primaryStage.setTitle("AB_3");
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}
