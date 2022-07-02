package application;
import javafx.scene.control.TreeView;
import javafx.scene.control.TreeItem; 
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.control.DatePicker;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.control.ChoiceBox;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Button;
import javafx.animation.TranslateTransition;
public class KonuCheckBoxController implements Initializable {
	@FXML
	ImageView imageView1;
	@FXML
	Label label1,label2,label3,label4,label5;
	@FXML
	CheckBox checkBox1;
	
	Image image1 = new Image(getClass().getResourceAsStream("myicon.png"));
	Image image2 = new Image(getClass().getResourceAsStream("resim2.png"));
	@FXML
	ToggleGroup yemek;
	@FXML
	RadioButton radioButton1,radioButton2,radioButton3;
	@FXML 
	DatePicker datePicker;
	@FXML
	ColorPicker colorPicker;
	@FXML
	AnchorPane anchorPane;
	@FXML
	Pane pane;
	@FXML
	ChoiceBox<String> choiceBox1;
	String[] dizi1 = {"pizza", "sushi", "ramen"};//pizza, sushi, ramen içeren bir dizi tanýmla.
	@FXML
	Slider slider1;
	int sicaklik;
	@FXML ProgressBar progressBar;
	@FXML 
	Button button1;
	double progress;
	@FXML
	Label label6;
	@FXML
	TreeView<String> treeView1;
	@FXML 
	void button1_OnAction(){
		//týklanýldýgýnda progressbar %10 nasýl arttýrýlýr ve labela yazýlýr?
		if((int)Math.round(progress*100)!=100 && progress< 1){//progressbar'a limit nasýl ayarlanýr? //BigDecimal degiskenin double deðeri nasýl alýnýr?
			progress+=0.1;
			System.out.println(progress);
			progressBar.setProgress(progress);
			label6.setText(Integer.toString((int)Math.round(progress*100)) + "%");//progressbarýn ondalýklý degeri labelda nasýl tamsayý olarak gösterilir?
		}
		/*
		 * BigDecimal degiskenler sabittir. d/y
		 * doðru.
		 * BigDecimal degiskenler sabit degildir. d/y
		 * yanlýþ, BigDecimal degiskenler sabit degildir.
		 * */
	}
	void up(){System.out.println("yukarýýý");}
	void down(){System.out.println("asagýýý");}
	void left(){
		System.out.println("solll");
	 }
	void right(){
	 System.out.println("saggggg");
	 }		
	 
	public void treeViewSec(){
		
	}
	@FXML
	public void colorPicker_OnAction(ActionEvent actionEvent){//arkaplan rengini colorpicker ile nasýl degistirilir?
		Color color = colorPicker.getValue();
		anchorPane.setBackground(new Background(new BackgroundFill(color, null, null)));
	}
	@FXML
	public void datePicker_onAction(ActionEvent actionEvent){
				//datePickerdaki degeri oldugu gibi labela yaz.
					//LocalDate localDate = datePicker.getValue();
					//label3.setText(localDate.toString());
		//datePickerdaki degeri bicimlendirerek labela yaz.
		LocalDate localDate = datePicker.getValue();
		String bicimlendirilmisTarih = localDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
		label3.setText(bicimlendirilmisTarih);
		
	}
	
	
	@FXML
	void yemekSec(ActionEvent actionEvent){//radiobutona basýldýgýnda radionun textini labela ata.
		if(radioButton1.isSelected()){
			label2.setText(radioButton1.getText());
		}
		else if(radioButton2.isSelected()){
			label2.setText(radioButton2.getText());
		}
		else if(radioButton3.isSelected()){
			label2.setText(radioButton3.getText());
		}
	}
	
	
	@FXML
	public void checkBox1_OnAction(ActionEvent actionEvent){ //checkboxa basýlgýdýnga resim degistiren fonksiyon
		if(checkBox1.isSelected()){
			label1.setText("ON");
			imageView1.setImage(image2);
			checkBox1.setText("ON");
		}
		else{
			label1.setText("OFF");
			checkBox1.setText("OFF");
			imageView1.setImage(image1);
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	
	public void initialize(URL arg0, ResourceBundle arg1){

		//choiceboxda seçilen deger labela nasýl yazýlýr?
		/*
	
	diziyi initialize fonksiyonu içinde choiceBoxa at.
	*/
		choiceBox1.getItems().addAll(dizi1);
	/*
	choiceboxa setOnAction getFood fonksiyonunu ekle.*/
	choiceBox1.setOnAction(this::getFood);
		//sliderýn degeri nasýl labela yazýlýr?
		slider1.valueProperty().addListener(new ChangeListener<Number>(){
			@Override 
			public void changed(ObservableValue<? extends Number> args0, Number arg1, Number arg2){
				sicaklik = (int)slider1.getValue();
				label5.setText(Integer.toString(sicaklik) + " derece");
			}});
		//kýrmýzý progressbar nasýl yapýlýr?
		progressBar.setStyle("-fx-accent: red;");
		
		//týklanýldýgýnda progressbar %10 nasýl arttýrýlýr ve labela yazýlýr?
		//butonla yapýlýr.
		//progressbar'a limit nasýl ayarlanýr?
		//progressbarýn ondalýklý degeri labelda nasýl tamsayý olarak gösterilir?
		//BigDecimal sýnýfý nedir?
		//sayý yuvarlama davranýþý üzerine kullanýcýsýna tam kontrol verir.
		//---
		TreeItem<String> treeItem = new TreeItem<>("Dosyalar");
		TreeItem<String> branchItem1 = new TreeItem<>("Resimler");
		TreeItem<String> branchItem2 = new TreeItem<>("Videolar");
		TreeItem<String> branchItem3 = new TreeItem<>("Muzik");
		
		TreeItem<String> leafItem1 = new TreeItem<String>("resim1");
		TreeItem<String> leafItem2 = new TreeItem<>("resim2");
		TreeItem<String> leafItem3 = new TreeItem<>("video1");
		TreeItem<String> leafItem4 = new TreeItem<>("video2");
		TreeItem<String> leafItem5 = new TreeItem<>("muzik1");
		TreeItem<String> leafItem6 = new TreeItem<>("muzik2");
		
		branchItem1.getChildren().addAll(leafItem1, leafItem2);
		branchItem2.getChildren().addAll(leafItem3, leafItem4);
		branchItem3.getChildren().addAll(leafItem5, leafItem6);
		treeItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);
		treeView1.setRoot(treeItem);
		
		TranslateTransition translateTransition = new TranslateTransition();
			//imageView animasyonu nasýl ayarlanýr?
			translateTransition.setNode(imageView1);
			translateTransition.setDuration(javafx.util.Duration.millis(500)); //süre nasýl ayarlanýr.
			translateTransition.setCycleCount(TranslateTransition.INDEFINITE); //
			//xe göre ayarlama nasýl yapýlýr
			translateTransition.setByX(250);
			translateTransition.setByY(-250);
			translateTransition.setAutoReverse(true);//gidip geri gelme nasýl ayarlanýr?
			translateTransition.play(); //oynatma nasýl yapýlýr?
			//döndürme nasýl yapýlýr?
			javafx.animation.RotateTransition rotateTransition = new javafx.animation.RotateTransition();
			rotateTransition.setNode(imageView1);
			rotateTransition.setDuration(javafx.util.Duration.millis(500)); //dönme süresi nasýl ayarlanýr?
			rotateTransition.setCycleCount(TranslateTransition.INDEFINITE);
			rotateTransition.setInterpolator(javafx.animation.Interpolator.LINEAR);
			rotateTransition.setByAngle(360); //kaç derece dönebileceðini hesaplar.
			//eksen nasýl ayarlanýr?
			rotateTransition.setAxis(javafx.scene.transform.Rotate.Z_AXIS);
			rotateTransition.play();
			///
			//fade ve scale uygulamasýný yappp.
			javafx.animation.FadeTransition fadeTransition = new javafx.animation.FadeTransition();
			fadeTransition.setNode(imageView1);
			fadeTransition.setDuration(javafx.util.Duration.millis(500));
			fadeTransition.setCycleCount(TranslateTransition.INDEFINITE);
			fadeTransition.setInterpolator(javafx.animation.Interpolator.LINEAR);
			fadeTransition.setFromValue(0);
			fadeTransition.setToValue(1);
			fadeTransition.play();
			
			//scale uygulamas.
			javafx.animation.ScaleTransition scaleTransition = new javafx.animation.ScaleTransition();
			scaleTransition.setNode(imageView1);
			scaleTransition.setDuration(javafx.util.Duration.millis(500));
			scaleTransition.setCycleCount(TranslateTransition.INDEFINITE);
			scaleTransition.setInterpolator(javafx.animation.Interpolator.LINEAR);
			scaleTransition.setByX(2.0);
			scaleTransition.setByY(2.0);
			scaleTransition.setAutoReverse(true);
			scaleTransition.play();
			
			
			
			
	}
	
	public void getFood(ActionEvent actionEvent){
		/*getFood isminde choiceoBoxdaki degeri alacak ve label4'ün metnini degistirecek. event fonksiyonu yaz.*/
		
		String deger = choiceBox1.getValue();//choiceoBoxdaki degeri al.
		label4.setText(deger); //label4'ün metnini degistir
	}
	//sliderda en fazla yapýlabilecek tik nasýl ayarlanýr?
	//Major Tick Unit deðiþtirerek
	//sliderda en az yapýlabilecek tik nasýl ayarlanýr?
	//Minor Tick Count deðiþtirerek.
	//tik iþaretleri hangi özellik ile gösterilebilir?
	//Show Tick Marks
	//tik etiketleri hangi özellik ile gösterilebilir?
	//Show Tick Labels
	//sliderýn en düþük degeri hangi özellik ile ayarlanýr?
	//Min
	//sliderýn en büyük degeri hangi özellik ile ayarlanýr?
	//Max
	/*
	 * sliderýn gösterdigi deger hangi özellik ile deðiþtirilir?
	 * Value
	 * sliderýn blok arttýrýmý hangi özellik ile yapýlýr?
	 * Block Increment
	 * --
	 * ProgressBar nerede bulunur
	 * control bölümünde bulunur
	 * progress özelliði veri tipi nedir?
	 * double
	 * progress özelliði aralýgý nedir?
	 * 0 ile 1 arasýnda...
	 * progess özelliðinin indeterminate özelliði var mýdýr?
	 * evet
	 * progress özelliðinin indeterminate özelliði ne iþe yarar?
	 * yüzdeyi belli etmemeyi saðlar.
	 * ProgressBarýn yönü nasýl deðiþtirilir
	 * rotate özelliðinde dereceyi ayarlayarak deðiþtirilir.
	 * progressbarýn onAction eventý vardýr. d/y
	 * yanlýþ, progressbarýn onAction eventý yoktur.
	 * progressbar'ýn onAction eventi yoktur. d/y
	 * doðru.
	 *  
	 * */
	

}
