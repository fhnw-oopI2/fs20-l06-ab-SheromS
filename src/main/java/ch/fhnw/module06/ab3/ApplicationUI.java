package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane {

	private Button topButton;
	private Button rightButton;
	private Button bottomButton;
	private Button leftButton;
	private TextArea textfeld;
	private Insets inset = new Insets(10);
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		topButton = new Button("top");
		rightButton = new Button("right");
		bottomButton = new Button("bottom");
		leftButton = new Button("left");
		textfeld = new TextArea();
	}
	
	private void layoutControls() {
		this.setTop(topButton);
		ApplicationUI.setMargin(topButton, inset);
		topButton.setPrefWidth(800);
		
		this.setRight(rightButton);
		BorderPane.setMargin(rightButton, new Insets(0, 10, 0, 10));
		
		this.setBottom(bottomButton);
		ApplicationUI.setMargin(bottomButton, inset);
		bottomButton.setPrefWidth(800);
		bottomButton.setMinWidth(200);
		
		this.setLeft(leftButton);
		BorderPane.setMargin(leftButton, new Insets(0, 10, 0, 10));
		
		this.setCenter(textfeld);
	}
}
