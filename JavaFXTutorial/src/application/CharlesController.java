package application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
public class CharlesController {
	@FXML 
	Label label1;
	@FXML
	Button button1;
	@FXML
	Label label2;
	@FXML 
	TextField textField1;
	
		public CharlesController() {
		// TODO Auto-generated constructor stub
	}
	//sample2daki labela buradaki textfieldýn metni nasýl gönderilir?
	public void button1_OnAction(ActionEvent actionEvent){//butonla baþka pencere açma nasýl yapýlýr?
		try{
			String deger = textField1.getText();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample2.fxml"));
			AnchorPane root = loader.load();
			Sample2Controller sample2Controller = loader.getController();
			sample2Controller.isimGoruntule(deger); //diger taraftaki kontrole fonksiyonla erisiyor.
			
		//AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample2.fxml"));
		Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("yenicss.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
		}catch(Exception exception){
			exception.printStackTrace();
		}
		//sample2daki labela buradaki textfieldýn metni nasýl gönderilir?
		//buradayým..!
		
	}
	

}
