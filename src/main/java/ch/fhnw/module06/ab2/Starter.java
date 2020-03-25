package ch.fhnw.module06.ab2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Starter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox gui = new ApplicationUI();
		
		Scene scene = new Scene(gui);
		
		primaryStage.setTitle("Notiz Panel");
		primaryStage.setScene(scene);
		
		//primaryStage.setWidth(200);
		//primaryStage.setHeight(200);
		
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
