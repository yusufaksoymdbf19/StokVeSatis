package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
public class Sample2Controller {
	@FXML
	Button ust;
	@FXML 
	Button alt;
	@FXML
	Button sol;
	@FXML
	Button sag;
	@FXML
	Circle cember;
	@FXML 
	Label label1;
	@FXML 
	Label label2;
	@FXML
	Button buttonPencereAc;
	@FXML
	Label labelIsim;
	
	
	private double x;
	private double y;
	@FXML
	public void buttonPencereAc_OnAction(ActionEvent actionEvent){//butonla baþka pencere açma nasýl yapýlýr?
		try{
			AnchorPane root = FXMLLoader.load(getClass().getResource("Charles.fxml"));
			Scene scene = new Scene(root,500,500);
			scene.getStylesheets().add(getClass().getResource("yenicss.css").toExternalForm());
			Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}catch(Exception exception){
			exception.printStackTrace();
		}
	}
	public void isimGoruntule(String isim){
		labelIsim.setText("Merhabaaa " + isim);
	}
			
	@FXML
	void sag_OnAction(ActionEvent e) {
		//https://youtu.be/9XJicRt_FaI?t=3160
		cember.setCenterX(x+=10);
	}
	@FXML
	void sol_OnAction(ActionEvent e){
		cember.setCenterX(x-=10);
	}
	@FXML
	void ust_OnAction(ActionEvent e) {
		cember.setCenterY(y-=10);
	}
	@FXML
	void alt_OnAction(ActionEvent e) {
		cember.setCenterY(y+=10);
	}
	
	

}
