package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class DodgeController {
	@FXML
	Button button1;
	@FXML 
	ImageView imageView1;
	public DodgeController() {
		// TODO Auto-generated constructor stub
	}
	@FXML 
	void button1_OnAction(ActionEvent actionEvent){
		Image resim = new Image(getClass().getResourceAsStream("resim2.png"));
		imageView1.setImage(resim);
		
		
	}

}
