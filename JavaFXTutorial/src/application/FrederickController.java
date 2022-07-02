package application;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
public class FrederickController {
	@FXML
	AnchorPane anchorPane;
	@FXML
	Button buttonCikis;
	public FrederickController() {
		// TODO Auto-generated constructor stub
	}
	@FXML 
	void buttonCikis_OnAction(ActionEvent actionEvent){
			//uyar� verme i�lemi nas�l yap�l�r?
		Alert alert = new Alert(AlertType.CONFIRMATION);
		//uyar�n�n ba�l�g� nas�l de�i�tirilir?
		alert.setTitle("uyar�!");
		//uyar�n�n basl�k metni nas�l degistirilir?
		alert.setHeaderText("cikis yapmak uzeresin.");
		//uyar�n�n i�erik metni nas�l degistirilir?
		alert.setContentText("C�k�s yapmak istediginden emin misin?");
		//tamama bas�ld�ysa ��k�� yaps�n..
		if(alert.showAndWait().get()==ButtonType.OK){
			//��k�� yapma butonu nas�l yap�l�r
			Stage stage = (Stage)anchorPane.getScene().getWindow();
			System.out.println("Basariyla cikis yaptiniz.");
			stage.close();
		}
	} 

}
