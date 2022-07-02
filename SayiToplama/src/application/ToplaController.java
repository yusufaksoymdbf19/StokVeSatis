package application;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ToplaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private Button button1;

    @FXML
    void button1_OnAction(ActionEvent event) {
    	
    }

    @FXML
    void initialize() {
        assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'Topla.fxml'.";
        assert textField2 != null : "fx:id=\"textField2\" was not injected: check your FXML file 'Topla.fxml'.";
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'Topla.fxml'.";

    }
}
