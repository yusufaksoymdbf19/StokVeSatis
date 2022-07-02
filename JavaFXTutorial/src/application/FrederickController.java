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
			//uyarý verme iþlemi nasýl yapýlýr?
		Alert alert = new Alert(AlertType.CONFIRMATION);
		//uyarýnýn baþlýgý nasýl deðiþtirilir?
		alert.setTitle("uyarý!");
		//uyarýnýn baslýk metni nasýl degistirilir?
		alert.setHeaderText("cikis yapmak uzeresin.");
		//uyarýnýn içerik metni nasýl degistirilir?
		alert.setContentText("Cýkýs yapmak istediginden emin misin?");
		//tamama basýldýysa çýkýþ yapsýn..
		if(alert.showAndWait().get()==ButtonType.OK){
			//çýkýþ yapma butonu nasýl yapýlýr
			Stage stage = (Stage)anchorPane.getScene().getWindow();
			System.out.println("Basariyla cikis yaptiniz.");
			stage.close();
		}
	} 

}
