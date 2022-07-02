/**
 * Sample Skeleton for 'Sample.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class SampleController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="spinner1"
    private Spinner<Integer> spinner1; // Value injected by FXMLLoader
    int baslangicDegeri=2;
   
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	 SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,baslangicDegeri);
    	 spinner1.setValueFactory(valueFactory);
    	 
    }
}
