package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
public class SampleController {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Label sceneTitle;
    @FXML 
    private Label labelSonuc;
    @FXML public Button buttonGirisYap;
    @FXML private Label labelDeneme;
    @FXML
    private Button button1;
@FXML VBox vbox;
    
    public void labelMetniniDegistir(String metin) {
		labelDeneme.setText(metin);
	}
    @FXML
    void initialize() {
    	labelDeneme.setText("");
    	sceneTitle.setId("welcome-text");
    	labelSonuc.setId("labelsonuc");
      //  sceneTitle.setFont(Font.font("TAHOMA",FontWeight.EXTRA_BOLD,20));
        buttonGirisYap.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub			
				//labelSonuc.setTextFill(Color.FIREBRICK);
				labelSonuc.setText("Giriþ yap butonuna basýldý.");
			}
		});
        LabelaResimEkle();
        button1.setText("Accept");
       Image image1 = new Image(getClass().getResourceAsStream("R.png"));
       button1.setGraphic(new ImageView(image1));
       button1.setText("kabul et");
       //vbox isi
       final String[] names = new String[]{"March", "April", "May",
    		    "June", "July", "August"};
    		final CheckBox[] cbs = new CheckBox[names.length];
    		final Separator separator = new Separator();
    		final VBox vbox = new VBox();

    		for (int i = 0; i < names.length; i++) {
    		    cbs[i] = new CheckBox(names[i]);
    		}
    		                        
    		separator.setMaxWidth(40);
    		separator.setHalignment(HPos.LEFT);
    		vbox.getChildren().addAll(cbs);
    		vbox.setSpacing(5);
    		vbox.getChildren().add(3, separator);
      
       
        
        
    }
    private void LabelaResimEkle() {
    	Image image = new Image(getClass().getResourceAsStream("label.png"));
        labelDeneme.setGraphic(new ImageView(image));
        labelDeneme.setText("Deneme calistirdiktan sonra duzenlendi.sdfsfsfsdfsdfsf");
        labelDeneme.setTextFill(Color.web("#0076a3"));
        labelSonuc.setFont(Font.font("Cambria",32));
        labelDeneme.setFont(new Font("Arial",35));
        labelDeneme.setWrapText(true);
        labelDeneme.setRotate(45);
        labelSonuc.setTranslateY(60);
        labelSonuc.setOnMouseEntered((MouseEvent e) -> {
            labelSonuc.setScaleX(1.5);
            labelSonuc.setScaleY(1.5);
        });

        labelSonuc.setOnMouseExited((MouseEvent e) -> {
            labelSonuc.setScaleX(1);
            labelSonuc.setScaleY(1);
        });
    }
}
