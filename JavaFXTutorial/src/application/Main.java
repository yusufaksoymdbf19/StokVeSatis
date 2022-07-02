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
			
			Scene scene = new Scene(root,600,600,Color.BLUE); //arkaplaný mavi ekran
			
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
			//pencerenin koþesine ikon ekleme nasýl yapýlýr?
			Image image = new Image(getClass().getResourceAsStream("myicon.png"));
			primaryStage.getIcons().add(image);
			//pencere baslýgý nasýl ayarlanýr?
			primaryStage.setTitle("Penceremin Basligi...");
			//pencerenin geniþlik ve yüksekliði 420 x 420 nasýl yapýlýr?
			primaryStage.setWidth(420.0);
			primaryStage.setHeight(420.0);
			//pencere yeniden boyutlama olmamasý için ne yapýlýr?
			primaryStage.setResizable(false);
			//pencere yeniden boyutlama olmasý için ne yapýlýr?
			primaryStage.setResizable(true);
			//pencerenin x y ekseninde deðerlerini x=50, y=100 nasýl yapýlýr?
			primaryStage.setX(50.0);
			primaryStage.setY(100.0);
			//tam ekran ayarlama nasýl yapýlýr?
			primaryStage.setFullScreen(true); //tam ekran yapmak için.
			primaryStage.setFullScreen(false); //tam ekran yapmamak için.
			//tam ekrandan çýkma ipucu yazýsýný nasýl deðiþtirirsin?
			primaryStage.setFullScreenExitHint("Nolur tam ekrandan cikmak icin q ya bas...");
			//tam ekrandan çýkma tuþu q nasýl yapýlýr?
			primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
			//
			
			primaryStage.setScene(scene);
			primaryStage.show();
			//programý sag ustteký kapatma tusundan kapatmak nasýl yapýlýr?
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
			//Stage stage = (Stage)anchorPane.getScene().getWindow(); //yukarýda zaten tanýmlý...
			System.out.println("Basariyla cikis yaptiniz.");
			stage.close();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
