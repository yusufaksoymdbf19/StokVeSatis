package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.web.WebView;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.web.WebEngine;

public class WebSayfasiOrnekController implements Initializable {
	@FXML
	WebView webView1;
	@FXML 
	Button buttonYukle;
	@FXML
	TextField textFieldLink;
	WebEngine webEngine;
	String homePage;
	
	public WebSayfasiOrnekController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		webEngine = webView1.getEngine();
		homePage = "www.google.com";
		textFieldLink.setText(homePage);
		sayfaYukle();
		
		
	}
	@FXML
	public void sayfaYukle(){
		webEngine.load("http://"+textFieldLink.getText());
		
		
	}
}
