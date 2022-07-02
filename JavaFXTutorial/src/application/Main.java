package application;
	
import javafx.application.Application;
//import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
//import javafx.scene.input.KeyEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
//import javafx.animation.TranslateTransition;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		    FXMLLoader loader = new FXMLLoader(getClass().getResource("Toplam.fxml"));
		    
			AnchorPane root = loader.load(); //(AnchorPane)FXMLLoader.load(getClass().getResource("KonuCheckBox.fxml"));
		//	KonuCheckBoxController konuCheckBoxController = loader.getController(); fxmli KonuCheckBox.fxml yap...
			
			Scene scene = new Scene(root,600,600,Color.BLUE); //arkaplan� mavi ekran
			
			scene.getStylesheets().add(getClass().getResource("yenicss.css").toExternalForm());
			/*scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
				@Override
				public void handle(KeyEvent event){
					switch(event.getCode()){
					case UP:
					konuCheckBoxController.up();
					 break;
					case DOWN:
					konuCheckBoxController.down();
					break;
					case LEFT:
					konuCheckBoxController.left();
					break;
					case RIGHT:
					konuCheckBoxController.right();
					break;
					default:
					System.out.println(event.getCode().toString());
					}}}
					
				);*/
			//pencerenin ko�esine ikon ekleme nas�l yap�l�r?
			Image image = new Image(getClass().getResourceAsStream("myicon.png"));
			primaryStage.getIcons().add(image);
			//pencere basl�g� nas�l ayarlan�r?
			primaryStage.setTitle("Penceremin Basligi...");
			//pencerenin geni�lik ve y�ksekli�i 420 x 420 nas�l yap�l�r?
			primaryStage.setWidth(420.0);
			primaryStage.setHeight(420.0);
			//pencere yeniden boyutlama olmamas� i�in ne yap�l�r?
			primaryStage.setResizable(false);
			//pencere yeniden boyutlama olmas� i�in ne yap�l�r?
			primaryStage.setResizable(true);
			//pencerenin x y ekseninde de�erlerini x=50, y=100 nas�l yap�l�r?
			primaryStage.setX(50.0);
			primaryStage.setY(100.0);
			//tam ekran ayarlama nas�l yap�l�r?
			primaryStage.setFullScreen(true); //tam ekran yapmak i�in.
			primaryStage.setFullScreen(false); //tam ekran yapmamak i�in.
			//tam ekrandan ��kma ipucu yaz�s�n� nas�l de�i�tirirsin?
			primaryStage.setFullScreenExitHint("Nolur tam ekrandan cikmak icin q ya bas...");
			//tam ekrandan ��kma tu�u q nas�l yap�l�r?
			primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
			//
			
			primaryStage.setScene(scene);
			primaryStage.show();
			//program� sag usttek� kapatma tusundan kapatmak nas�l yap�l�r?
			primaryStage.setOnCloseRequest(event->{
				event.consume();
				this.buttonCikis_OnAction(primaryStage);
			});
			//translation animasyonu.
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void buttonCikis_OnAction(Stage stage){
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
			//Stage stage = (Stage)anchorPane.getScene().getWindow(); //yukar�da zaten tan�ml�...
			System.out.println("Basariyla cikis yaptiniz.");
			stage.close();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
