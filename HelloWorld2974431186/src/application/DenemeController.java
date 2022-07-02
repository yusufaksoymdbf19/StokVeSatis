package application;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;

import java.io.IOException;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class DenemeController {

	
	
	@FXML
    private Button buttonFormAc;
	@FXML
    private Slider opacityLevel;

    @FXML
    private Slider sepiaTone;

    @FXML
    private Slider scaling;

    @FXML
    private ImageView cappucino;

    @FXML
    private Label label1;

    @FXML
    private GridPane grid;

    @FXML
    private Button button;

    @FXML
    private ComboBox<String> emailComboBox;

    @FXML
    private ComboBox<String> priorityComboBox;

    @FXML
    private TextField subject;

    @FXML
    private TextArea text;
    @FXML
    private Label sepiaValue;

    @FXML
    private Label scalingValue;
@FXML private Button buttonEkle;
@FXML private TextField textField1;
@FXML private ComboBox<String> comboBox1;
@FXML private void buttonEkle_OnClick(ActionEvent actionEvent) {
	comboBox1.getItems().add(textField1.getText());
}
    
    String address = " ";

    @FXML
    private Label notification;
    @FXML Label opacityValue;
    @FXML
	CheckBox checkbox;
    final static Color textColor = Color.BLACK;
    final static SepiaTone sepiaEffect = new SepiaTone();
	@FXML
	void initialize() {
		final Image image  = new Image(getClass().getResourceAsStream(
		        "cappuccino.jpg")
		    );
		cappucino.setImage(image);
		 scaling.valueProperty().addListener((
		            ObservableValue<? extends Number> ov, Number old_val, 
		            Number new_val) -> {
		                cappucino.setScaleX(new_val.doubleValue());
		                cappucino.setScaleY(new_val.doubleValue());
		                scalingValue.setText(String.format("%.2f", new_val));
		        });

		 
		
		
        
		
        emailComboBox.getItems().addAll(
            "jacob.smith@example.com",
            "isabella.johnson@example.com",
            "ethan.williams@example.com",
            "emma.jones@example.com",
            "michael.brown@example.com"  
        );
        emailComboBox.setPromptText("Email address");
        emailComboBox.setEditable(true);        
        emailComboBox.setOnAction((ActionEvent ev) -> {
            address = 
                emailComboBox.getSelectionModel().getSelectedItem().toString();    
        });
        
       
        priorityComboBox.getItems().addAll(
            "Highest",
            "High",
            "Normal",
            "Low",
            "Lowest" 
        );   

        priorityComboBox.setValue("Normal");
        priorityComboBox.setCellFactory(
                (Callback<ListView<String>, ListCell<String>>) new Callback<ListView<String>, ListCell<String>>() {
                    @Override public ListCell<String> call(ListView<String> param) {
                        final ListCell<String> cell = new ListCell<String>() {
                            {
                                super.setPrefWidth(100);
                            }    
                            @Override public void updateItem(String item, 
                                boolean empty) {
                                    super.updateItem(item, empty);
                                    if (item != null) {
                                        setText(item);    
                                        if (item.contains("High")) {
                                            setTextFill(Color.RED);
                                        }
                                        else if (item.contains("Low")){
                                            setTextFill(Color.GREEN);
                                        }
                                        else {
                                            setTextFill(Color.BLACK);
                                        }
                                    }
                                    else {
                                        setText(null);
                                    }
                                }
                    };
                    return cell;
                }
            });
        button.setOnAction((ActionEvent e) -> {
            if (emailComboBox.getValue() != null && 
                    !emailComboBox.getValue().toString().isEmpty()){
                notification.setText("Your message was successfully sent"
                        + " to " + address);
                emailComboBox.setValue(null);
                if (priorityComboBox.getValue() != null &&
                        !priorityComboBox.getValue().toString().isEmpty()){
                    priorityComboBox.setValue(null);
                }
                subject.clear();
                text.clear();
            }
            else {
                notification.setText("You have not selected a recipient!");
            }
        });
	}
	@FXML
	void buttonFormAc_OnAction(ActionEvent actionEvent) throws IOException {
		try {
			label1.setText("Deneme olsuuunn");
			//degerini degis
			
			
			
			
			//yeniformgoster hatasz
			
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			//eskiform goster hatalý
			/*Stage primaryStage = new Stage(StageStyle.DECORATED);
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			SampleController sampleController = new SampleController();
			sampleController.labelMetniniDegistir("Degistirdimmm");
			primaryStage.show();*/
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
