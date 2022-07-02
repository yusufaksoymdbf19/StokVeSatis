package application;

import java.net.URL;

import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button1;
    @FXML
    TextField txtEposta;
    @FXML
    TextField txtSifre;
    @FXML
    void button1_OnAction(ActionEvent event) {
    	
			//SampleController.MesajVer("@iste.edu.tr uzantýlý eposta olmalý.", AlertType.ERROR);
    	//	System.out.println(validateEmailAddress(txtEposta.getText()));
    	String string = validateEmailAddress(txtEposta.getText());
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("Denemeee");
    	alert.setHeaderText("headerText");
    	alert.setContentText(string);
		SampleController.MesajVer(string, AlertType.ERROR);
    	/*Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Denemeee");
    	alert.setHeaderText("headerText");
    	alert.setContentText("icerik metni");
    	Optional<ButtonType> buttonTypeOptional =alert.showAndWait();
    	if (buttonTypeOptional.get().equals(ButtonType.OK)) {
    		System.out.println("tamam tusuna basildi.");
			
		}*/
    }
    static void MesajVer(String mesajString,AlertType alertType) {
    	Alert alert = new Alert(alertType);
    	alert.setTitle("Denemeee");
    	alert.setHeaderText("headerText");
    	alert.setContentText(mesajString);
    	//Optional<ButtonType> buttonTypeOptional =alert.showAndWait();
    	//if (buttonTypeOptional.get().equals(ButtonType.OK)) {
    		//System.out.println("tamam tusuna basildi.");
    }
    @FXML
    void initialize() {
    }
    private Pattern regexPattern;
    private Matcher regMatcher;

    public String validateEmailAddress(String emailAddress) {
    	String coDomain = "iste.edu.tr";
        regexPattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        	    + Pattern.quote(coDomain)+"$");
        regMatcher   = regexPattern.matcher(emailAddress);
        if(regMatcher.matches()) {
            return "Valid Email Address";
        } else {
            return "Invalid Email Address";
        }
    }

    public String validateMobileNumber(String mobileNumber) {
        regexPattern = Pattern.compile("^\\+[0-9]{2,3}+-[0-9]{10}$");
        regMatcher   = regexPattern.matcher(mobileNumber);
        if(regMatcher.matches()) {
            return "Valid Mobile Number";
        } else {
            return "Invalid Mobile Number";
        }
    }
}
