package application;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
public class SampleController {
	@FXML
	TextField textField1;
	@FXML
	Label label1;
	@FXML
	Button buttonMetniLabelaYaz;
	@FXML
	CheckBox checkBox1;
	@FXML
	void initialize() { //bu main.java yerine kullanýlýyor.
		buttonMetniLabelaYaz.setOnAction(tiklamaOlayiEventHandler);
		textField1.setPromptText("Buraya Metin Giriniz.");
		
	}
	@FXML
	void textField1_OnAction(ActionEvent actionEvent) {
		System.out.println("textField'a basýldý.");
	}
	@FXML
	void buttonMetniLabelaYaz_OnAction(ActionEvent actionEvent) {
		
		label1.setText(textField1.getText());
		textField1.setText("Metin ayarlama denemesi");
	}
	EventHandler<ActionEvent> tiklamaOlayiEventHandler = new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
			label1.setText("javafx.event.EventHandler kullanýlarak butona Basýldi.");
			checkBox1.fire();
			checkBox1.allowIndeterminateProperty();
			
			
		}
	};
}
