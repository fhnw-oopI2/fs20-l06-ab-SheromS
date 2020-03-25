package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {

	private Label label;
	private TextField textFeld;
	private TextArea textBereich;
	private Button button;
	private Insets paddingSize = new Insets(10);
	
	public ApplicationUI(){
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		label = new Label("ein Label");
		textFeld = new TextField();
		textBereich = new TextArea();
		button = new Button("ein Button");
		
	}
	
	private void layoutControls() {
		this.getChildren().add(label);
		this.getChildren().add(textFeld);
		this.getChildren().add(textBereich);
		this.getChildren().add(button);
		this.setPadding(paddingSize);
		ApplicationUI.setMargin(button, paddingSize);
		ApplicationUI.setMargin(textFeld, new Insets(5, 5, 5, 30));
	}
}
