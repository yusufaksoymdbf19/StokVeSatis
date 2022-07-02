package application;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;
public class SampleController{
	@FXML TextField textField1;
	@FXML ComboBox<String> comboBox1;
	@FXML Button button1;
	@FXML void initialize(){
	
	}
	@FXML void button1_OnClick(ActionEvent actionEvent){
		comboBox1.getItems().add(textField1.getText());
	}
}