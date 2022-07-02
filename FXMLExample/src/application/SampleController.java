package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class SampleController {
@FXML private Text actiontarget;
    int sayac = 0;
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
    	sayac++;
        actiontarget.setText(String.valueOf(sayac)+" defa Sign in button pressed.");
        
    }
}
