/**
 * Sample Skeleton for 'Sample.fxml' Controller Class
 */
package application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
public class SampleController {
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    @FXML // fx:id="spinner1"
    private Spinner<Integer> spinner1; // Value injected by FXMLLoader
    int baslangicDegeri=2;
    private String baslangicAyi="Haziran";
    @FXML
    private Spinner<String> spinnerAylar;
    @FXML
    private Label label1;
    @FXML
    private Slider slider1;
    @FXML
    Label label2;
    @FXML
    Spinner<Integer> spinner3;
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	//[1] baslangýc degeri ekleme, 1-10 arasý sayýlarý ekleme... 
    	 SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,baslangicDegeri);
    	 spinner1.setValueFactory(valueFactory1); //þimdiki seçilen indisi verir.
    	 //*/[1]
    	 //[2]spinnera 12 aylarý ekleme iþlemi.
    	 ObservableList<String> aylar = FXCollections.observableArrayList("Ocak","Subat","Mart","Nisan",
    			 														  "Mayis","Haziran","Temmuz","Agustos",
    			 														  "Eylul","Ekim","Kasim","Aralik");
    	 SpinnerValueFactory<String> valueFactory2 = new SpinnerValueFactory.ListSpinnerValueFactory<String>(aylar);
    	 spinnerAylar.setValueFactory(valueFactory2);
    	 //[2]
    	 valueFactory2.setValue(baslangicAyi);//varsayýlan degeri ayarlama...
    	 spinnerAylar.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL); //spinnerýn stilini deðiþtirme
    	 spinner1.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_HORIZONTAL);//spinnerýn stilini deðiþtirme 
    	 spinnerAylar.valueProperty().addListener(new ChangeListener<String>() { 
    		 @Override
    		public void changed(ObservableValue<? extends String> observableValue, String eskiDeger, String yeniDeger) {
    			// TODO Auto-generated method stub
    			label1.setText("yeni deger: "+yeniDeger);
    		}
		});
    	 slider1.setMin(0.0);
    	 slider1.setMax(200.0);
    	 slider1.setValue(30.0);
    	 slider1.setShowTickLabels(true);
    	 slider1.setShowTickMarks(true);
    	 slider1.setBlockIncrement(3);
    	 slider1.valueProperty().addListener(new ChangeListener<Number>() {
             @Override
             public void changed(ObservableValue<? extends Number> observable, //
                   Number oldValue, Number newValue) {
                label2.setText("New value: " + newValue);
             }
          });
    }
}