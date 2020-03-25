package ch.fhnw.module06.ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent rootPanel = new ApplicationUI();
		
		Scene myScene = new Scene(rootPanel);
		
		primaryStage.setTitle("JavaFX App");
		primaryStage.setScene(myScene);
		
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
		//primaryStage.centerOnScreen();
		
		primaryStage.show();
		
	}

}
