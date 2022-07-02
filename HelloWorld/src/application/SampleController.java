package application;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
public class SampleController {
	
	@FXML
	Button button1;
	@FXML
	Button button2;
	@FXML
	Label label1;
	@FXML
	TextField textField1;
	@FXML
	ListView<String> listView1;
	@FXML
	void button1_OnAction(ActionEvent actionEvent) {
		listView1.getItems().add(textField1.getText());
	}
	@FXML
	void initialize() throws Exception {
		button1.setWrapText(true);
		button2.setWrapText(true);
		listView1.setOrientation(Orientation.VERTICAL);
		listView1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		ObservableList<String> observableList = FXCollections.observableArrayList("Ben","Sen","O","Biz","Siz","Onlar");
		listView1.getItems().addAll(observableList);
	}
	@FXML
	void button2_OnAction(ActionEvent actionEvent){
		ObservableList<String> alinanDegerler=listView1.getSelectionModel().getSelectedItems();
		for(String item:alinanDegerler) {
			System.out.print(item+" ");
			System.out.println(listView1.getSelectionModel().getSelectedIndex());
			
		}
	}
}
