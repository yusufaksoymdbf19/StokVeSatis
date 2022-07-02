package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
public class SampleController {
	
	@FXML
	TextField textField1;
	@FXML
	TextField textField2;
	@FXML
	Button button1;
	@FXML
	TextArea textArea1;
	@FXML
	ListView<Integer> listView1;
	@FXML
	ListView<Integer> listView2;
	@FXML
	ListView<Integer> listView3;
	@FXML
	Label label1;
	@FXML
	Label label2;
	@FXML
	Label label3;
	@FXML 
	void initialize() {
		
	}
	@FXML
	void btnTikla(ActionEvent event) {
		int sayi1 = Integer.parseInt(textField1.getText());
		int sayi2 = Integer.parseInt(textField2.getText());
		int modunuAl = sayi1%sayi2;
		textArea1.setText(textArea1.getText()+"\n"+sayi1+"%"+sayi2+" = "+modunuAl);
		listView1.getItems().add(sayi1);
		listView2.getItems().add(sayi2);
		listView3.getItems().add(modunuAl);
	}
	
}
