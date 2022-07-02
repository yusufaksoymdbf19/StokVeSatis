package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField1;

    @FXML
    private Label lbl1;

    @FXML
    private Button btn1;

    @FXML
    private TextField textField2;

    @FXML
    void btn1_Click(ActionEvent event) {
    	
    	int sayi1 = 0,sayi2=0;
    	sayi1= Integer.parseInt(textField1.getText());
    	sayi2=Integer.parseInt(textField2.getText());
    	lbl1.setText(sayi1>sayi2?"Birinci sayi buyuk":"birinci sayi buyuk degil");
    	
    }

    @FXML
    void initialize() {
        

    }
}
