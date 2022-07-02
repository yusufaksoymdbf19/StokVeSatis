/**
 * Sample Skeleton for 'Sample.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="textFieldSayi1"
    private TextField textFieldSayi1; // Value injected by FXMLLoader

    @FXML // fx:id="textFieldSayi2"
    private TextField textFieldSayi2; // Value injected by FXMLLoader

    @FXML // fx:id="labelSonuc"
    private Label labelSonuc; // Value injected by FXMLLoader

    @FXML // fx:id="buttonTopla"
    private Button buttonTopla; // Value injected by FXMLLoader
    @FXML
    ComboBox<String> comboBox1;
    @FXML
    Button buttonYildizEkle;
    @FXML
    Button buttonTemizle;
    @FXML Button button8;
    @FXML Button button6;
    @FXML Button button7;
    @FXML Button buttonUcuncuIndisiSil;
    @FXML Button buttonbaslangicdegeri3olanisil;
    @FXML Button button9;
    @FXML void button9_OnAction(ActionEvent actionEvent) {
    	//secilen indisi labela yazar.
    	labelSonuc.setText( String.valueOf(comboBox1.getSelectionModel().getSelectedIndex()));

    }
    @FXML void button8_OnAction(ActionEvent actionEvent) {
    	labelSonuc.setText( comboBox1.getSelectionModel().getSelectedItem());
    	System.out.println(comboBox1.getItems().get(comboBox1.getSelectionModel().getSelectedIndex()));
    	System.out.println("dorduncu indisteki deger:" +comboBox1.getItems().get(4));
    	System.out.println("Comboda \"baslangic degeri3\" degeri ilk indisi: "+comboBox1.getItems().indexOf("baslangic degeri3"));//Comboda \"baslangic degeri10\" degeri ilk indisi
    	System.out.println("Comboda \"baslangic degeri3\" degeri en son kacinci indiste: "+comboBox1.getItems().lastIndexOf("baslangic degeri3"));//Comboda "Deneme1" degeri en son kacinci indiste
    	
    	
    	
    }
    @FXML void button6_OnAction(ActionEvent actionEvent) {
    	comboBox1.getItems().removeAll("baslangic degeri3");

    }
    
    @FXML void button7_OnAction(ActionEvent actionEvent) {
    	comboBox1.getItems().removeAll("baslangic degeri3", "baslangic degeri10");
    }
    @FXML
    void buttonYildizEkle_OnAction(ActionEvent actionEvent) {
    	comboBox1.getItems().add(3, "***********");
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	comboBox1.setPromptText("Deger Seçiniz");
    	textFieldSayi1.setPromptText("birinci sayiyi giriniz.");
    	textFieldSayi2.setPromptText("ikinci sayiyi giriniz.");
        for(int i = 0;i<10;i++) {
        	comboBox1.getItems().add("baslangic degeri"+Integer.toString(i+1));
        	comboBox1.getItems().add("baslangic degeri3");
        	
        }
        //diziyi comboya ekle
        String[] dizi= {"Deneme1", "Deneme2", "Deneme3", "Deneme1"};

        comboBox1.getItems().addAll(dizi);
        listView1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView1.getItems().addAll(dizi);
    }
   
    @FXML
    void buttonbaslangicdegeri3olanisil_OnAction(ActionEvent actionEvent) {
    	comboBox1.getItems().remove("baslangic degeri3");

    }
    @FXML
    void buttonUcuncuIndisiSil_OnAction(ActionEvent actionEvent) {
    	comboBox1.getItems().remove(3);   
    	
    }
    @FXML
    void buttonTopla_OnAction(ActionEvent event) {
    	double sayi1= Double.parseDouble(textFieldSayi1.getText());
    	double sayi2=Double.parseDouble(textFieldSayi2.getText());
    	double sonuc=sayi1+sayi2;
    	
    	labelSonuc.setText(Double.toString(sonuc));
    	
    	
    }
    
    @FXML
    void btn_Temizle_Click(ActionEvent event) {
    	textFieldSayi1.setText("");
    	textFieldSayi2.setText("");
    	labelSonuc.setText("");
    }
    @FXML Button button10;
    @FXML ListView<String> listView1;
    
    @FXML void button10_OnAction(ActionEvent actionEvent) {
    
    	System.out.println(listView1.getSelectionModel().getSelectedIndices());
        System.out.println(listView1.getSelectionModel().getSelectedItems());
        listView1.getSelectionModel().selectRange(0, 3); //3 dahil degil.
        


    }
}
